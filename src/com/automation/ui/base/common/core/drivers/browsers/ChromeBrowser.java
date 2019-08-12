package com.automation.ui.base.common.core.drivers.browsers;
//https://chromedriver.storage.googleapis.com/index.html
import com.automation.ui.base.common.core.UIWebDriver;
import com.automation.ui.base.common.core.configuration.*;
import com.automation.ui.base.common.core.drivers.*;
import com.automation.ui.base.common.core.exceptions.TestEnvInitFailedException;
import com.automation.ui.base.common.core.helpers.Emulator;
import com.automation.ui.base.common.driverprovider.UserAgentsRegistry;
import com.automation.ui.base.common.utils.BrowserExtentionHelper;
import com.automation.ui.base.common.utils.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.Iterator;
import java.util.logging.Level;
import org.json.JSONException;
import org.openqa.selenium.remote.CapabilityType;
import org.json.JSONObject;
public class ChromeBrowser extends BrowserAbstract {

    private static final String CHROMEDRIVER_PATH_FORMAT = "ChromeDriver/chromedriver_%s";
    private static final String CHROMEDRIVER_PATH_MAC =
            String.format(CHROMEDRIVER_PATH_FORMAT, "mac64/chromedriver");
    private static final String CHROMEDRIVER_PATH_LINUX =
            String.format(CHROMEDRIVER_PATH_FORMAT, "linux64/chromedriver");
    private static final String CHROMEDRIVER_PATH_WINDOWS =
            String.format(CHROMEDRIVER_PATH_FORMAT, "win32/chromedriver.exe");
    private static Logger logger = Logger.getLogger(ChromeBrowser.class);
    private ChromeOptions options = new ChromeOptions();

    private boolean useMobile = "CHROMEMOBILEMERCURY".equals(Configuration.getBrowser());

    @Override

    //https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver
    public void setOptions() {

        String chromeBinaryPath = "";
        String osName = System.getProperty("os.name").toUpperCase();
        Emulator emulator = Configuration.getEmulator();

        if (osName.contains("WINDOWS")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_WINDOWS;
        } else if (osName.contains("MAC")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_MAC;
        } else if (osName.contains("LINUX")) {
            chromeBinaryPath = CHROMEDRIVER_PATH_LINUX;
        }

		logger.debug("Using chromedriver logs at " +chromeBinaryPath);
        //  Log.info("Using chromedriver: ", chromeBinaryPath);
        File chromedriver = null;
        try {
            chromedriver = new File(ClassLoader.getSystemResource(chromeBinaryPath).getPath());
        } catch (Exception e) {
            logger.info(e.getMessage());
            throw new TestEnvInitFailedException("Check the /logs/chromelogs or /logs/idelogs or /logs/firefoxlog is there Browser binary path " + chromeBinaryPath + " not available");

        }

        // set application user permissions to 455
        chromedriver.setExecutable(true);

        System.setProperty("webdriver.chrome.driver", chromedriver.getPath());
        logger.info("Using chromedriver logs at " + System.getProperty("user.dir") + File.separator +
                "logs" + File.separator + "chromelogs");
        System.setProperty("webdriver.chrome.logfile", System.getProperty("user.dir") + File.separator +
                "logs" + File.separator + "chromelogs" + File.separator + "chromelog" +
                DateUtil.getCurrentDate()
                + ".log");

        System.setProperty("webdriver.chrome.verboseLogging", "true");

        //options.addArguments("windows-size=800,900");
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("process-per-site");
        options.addArguments("dns-prefetch-disable");
        options.addArguments("allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--lang=en");
        // options.addArguments("user-data-dir=" + System.getProperty("user.dir")+File.separator+"logs"+File.separator+"chromeprofile");


        if ("true".equals(Configuration.getDisableFlash())) {
            options.addArguments("disable-bundled-ppapi-flash");
        }

        if (useMobile) {
            options.addArguments("--user-agent=" + UserAgentsRegistry.IPHONE.getUserAgent());
        }

        if (!emulator.equals(Emulator.DEFAULT)) {
            Map<String, Object> mobileEmulation = new HashMap<>();
            if (StringUtils.isNotBlank(emulator.getUserAgent())) {
                mobileEmulation.put("userAgent", emulator.getUserAgent());
            }
            if (StringUtils.isNotBlank(emulator.getDeviceName())) {
                mobileEmulation.put("deviceName", emulator.getDeviceName());
            } else {
                mobileEmulation.put("deviceMetrics", emulator.getDeviceMetrics());
            }

            options.setExperimentalOption("mobileEmulation", mobileEmulation);
        }
    }


    @Override
    public UIWebDriver create() {
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        caps.setJavascriptEnabled(true);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        if (Configuration.isUnsafePageLoad()) {
            caps.setCapability("pageLoadStrategy", "normal");
        }
       // caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

        //return new UIWebDriver(new RemoteWebDriver(new URL(hubUrl), caps));

        return new UIWebDriver(new ChromeDriver(caps), server, useMobile);

    }


    @Override
    public void addExtension(String extensionName) {
        options.addExtensions(BrowserExtentionHelper.findExtension(extensionName, "crx"));
    }
}
