package com.automation.ui.base.common.core.drivers.browsers;


import com.automation.ui.base.common.core.UIWebDriver;
import com.automation.ui.base.common.core.drivers.BrowserAbstract;
import com.automation.ui.base.common.logging.Log;
import com.automation.ui.base.common.utils.DateUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;

public class IEBrowser extends BrowserAbstract {


    /*
     public abstract void setOptions();

      protected abstract void startService();


     */
    private static final String IEDRIVER_PATH_WINDOWS = "IEDriver/IEDriverServer_32.exe";
    private static Logger logger = Logger
            .getLogger(IEBrowser.class);
    private InternetExplorerOptions options = new InternetExplorerOptions();

    @Override
    public void setOptions() {
        String ieBinaryPath = IEDRIVER_PATH_WINDOWS;
        String osName = System.getProperty("os.name").toUpperCase();


        File iedriver = new File(ClassLoader.getSystemResource(ieBinaryPath).getPath());


        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        logger.debug("IE BROWSER: 1" );



        // set application user permissions to 455
        // iedriver.setExecutable(true);

        //  System.setProperty("webdriver.ie.driver","D:\\Project\\Automation\\target\\classes\\IEDriver\\IEDriverServer.exe");


        System.setProperty("webdriver.ie.driver", iedriver.getPath());

        System.setProperty("webdriver.ie.driver.logfile", System.getProperty("user.dir") + File.separator + "logs" + File.separator + "ielog" + File.separator + "ielog" +
                DateUtil.getCurrentDate()
                + ".log");


        logger.debug("IE BROWSER: 1" +iedriver.getPath());

        Log.info("Using ie driver: ", iedriver.getPath());


    }

    /*
    #
    READ ME
    https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver#required-configuration

    Capabilities {acceptInsecureCerts: false, browserName: internet explorer, browserVersion: 11, javascriptEnabled: true,
    pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:ieOptions: {browserAttachTimeout: 0,
     elementScrollBehavior: 0, enablePersistentHover: true, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.fileUploadDialogTimeout: 3000,
      ie.forceCreateProcessApi: false, ignoreProtectedModeSettings: false, ignoreZoomSetting: false, initialBrowserUrl: http://localhost:23662/,
      nativeEvents: true, requireWindowFocus: false}, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}

     */
    @Override
    public UIWebDriver create() {
        caps.setJavascriptEnabled(true);
        //  caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        options.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
        //options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);
        caps.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
        //options.setCapability(CapabilityType.BROWSER_NAME, "IE");



        options.setCapability(InternetExplorerDriver.
                INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        options.setCapability("requireWindowFocus",true);


        options.setCapability("ie.ensureCleanSession", true);
        options.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR,
                ElementScrollBehavior.BOTTOM);

        options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);

        options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);


        //return new UIWebDriver(new RemoteWebDriver(new URL(hubUrl), caps));
       // return new UIWebDriver(new InternetExplorerDriver(caps), server, false);
        return new UIWebDriver(new InternetExplorerDriver(options), server, false);

    }

    @Override
    public void addExtension(String extensionName) {

    }
}
