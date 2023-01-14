package com.automation.ui.base.common.core.drivers.browsers;
//https://chromedriver.storage.googleapis.com/index.html

import com.automation.ui.base.common.core.UIWebDriver;
import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.drivers.BrowserAbstract;
import com.automation.ui.base.common.core.exceptions.TestEnvInitFailedException;
import com.automation.ui.base.common.core.helpers.Emulator;
import com.automation.ui.base.common.driverprovider.UserAgentsRegistry;
import com.automation.ui.base.common.utils.BrowserExtentionHelper;
import com.automation.ui.base.common.utils.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class EdgeBrowser extends BrowserAbstract {

    private static final String EDGEDRIVER_PATH_FORMAT = "EdgeDriver/edgedriver_%s";
    private static final String EDGEDRIVER_PATH_MAC =
            String.format(EDGEDRIVER_PATH_FORMAT, "mac64/chromedriver");
    private static final String EDGEDRIVER_PATH_MACM1 =
            String.format(EDGEDRIVER_PATH_FORMAT, "m1/chromedriver");

    private static final String EDGEDRIVER_PATH_LINUX =
            String.format(EDGEDRIVER_PATH_FORMAT, "linux64/chromedriver");
    private static final String EDGEDRIVER_PATH_WINDOWS =
            String.format(EDGEDRIVER_PATH_FORMAT, "win32/chromedriver.exe");
    private static Logger logger = Logger.getLogger(EdgeBrowser.class);
    private EdgeOptions options = new EdgeOptions();

    private boolean useMobile = "CHROMEMOBILEMERCURY".equals(Configuration.getBrowser());

    @Override

    //https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver
    public void setOptions() {

        String  edgeBinaryPath = "";
        String osName = System.getProperty("os.name").toUpperCase();
        Emulator emulator = Configuration.getEmulator();

        if (osName.contains("WINDOWS")) {
            edgeBinaryPath = EDGEDRIVER_PATH_WINDOWS;
        } else if (osName.contains("MAC")) {
            edgeBinaryPath = EDGEDRIVER_PATH_MAC;
        } else if (osName.contains("LINUX")) {
            edgeBinaryPath = EDGEDRIVER_PATH_LINUX;
        }

		logger.debug("Using chromedriver logs at " + edgeBinaryPath);
        //  Log.info("Using chromedriver: ", chromeBinaryPath);
        File edgedriver = null;
        try {
            edgedriver = new File(ClassLoader.getSystemResource( edgeBinaryPath).getPath());
        } catch (Exception e) {
            logger.info(e.getMessage());
            throw new TestEnvInitFailedException("Check the /logs/chromelogs or /logs/idelogs or /logs/firefoxlog is there Browser binary path " + edgeBinaryPath + " not available");

        }

        // set application user permissions to 455
        edgedriver.setExecutable(true);

        try {
        System.setProperty("webdriver.edge.driver", edgedriver.getPath());

        } catch (Exception e) {
            logger.info(e.getMessage());
            throw new TestEnvInitFailedException("Encoding exceptions ");
        }
        logger.info("Using chromedriver logs at " + System.getProperty("user.dir") + File.separator +
                "logs" + File.separator + "edgelogs");

        System.setProperty("webdriver.chrome.logfile", System.getProperty("user.dir") + File.separator +
                "logs" + File.separator + " edgelogs" + File.separator + " edgelog" +
                DateUtil.getCurrentDate()
                + ".log");

        System.setProperty("webdriver.edge.verboseLogging", "true");

        //options.addArguments("windows-size=800,900");
        /*options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("process-per-site");
        options.addArguments("dns-prefetch-disable");
        options.addArguments("allow-running-insecure-content");
        options.addArguments("--no-sandbox");
        options.addArguments("--lang=en");

         */
        if (Configuration.getisHeadlessRun()) {

			//options.addArguments("--headless");
			//options.addArguments("--disable-gpu");

        }

        if (Configuration.isstrictTransportSecurity()) {

            //options.addArguments("--ignore-certificate-errors");

        }
        // options.addArguments("user-data-dir=" + System.getProperty("user.dir")+File.separator+"logs"+File.separator+"chromeprofile");


        if ("true".equals(Configuration.getDisableFlash())) {
            //options.addArguments("disable-bundled-ppapi-flash");
        }

        if (useMobile) {
            //options.addArguments("--user-agent=" + UserAgentsRegistry.IPHONE.getUserAgent());
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

          //  options.setExperimentalOption("mobileEmulation", mobileEmulation);
        }
    }


    @Override
    public UIWebDriver create() {
       // caps.setCapability(EdgeOptions.CAPABILITY, options);
        caps.setJavascriptEnabled(true);
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);

        if (Configuration.isUnsafePageLoad()) {
            caps.setCapability("pageLoadStrategy", "normal");
        }
        if (Configuration.isstrictTransportSecurity()) {

             caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,
                    true);
        }


       // caps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

        //return new UIWebDriver(new RemoteWebDriver(new URL(hubUrl), caps));

        return new UIWebDriver(new EdgeDriver(caps), server, useMobile);

    }


    @Override
    public void addExtension(String extensionName) {
       // options.addExtensions(BrowserExtentionHelper.findExtension(extensionName, "crx"));
    }
}
