package com.automation.ui.base.common.bdd.serenity.framework.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.gl.E;
import io.cucumber.java.Scenario;

import net.thucydides.core.util.EnvironmentVariables;
import com.automation.ui.base.common.bdd.serenity.framework.helpers.DateHelper;
import com.automation.ui.base.common.bdd.serenity.framework.helpers.FileHelper;
import com.automation.ui.base.common.bdd.serenity.framework.helpers.PropertyHelper;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static com.automation.ui.base.common.bdd.serenity.framework.hooks.initialization.extractBytes;


public class ScenarioHook {

    final static Logger logger = Logger.getLogger(ScenarioHook.class.getName());
    public static Scenario scenario;
    EnvironmentVariables environmentVariables;
    private static boolean logCreated = false;
    private static String logName;

    @Before(order = 1)
    public void KeepScenario(Scenario scenario) throws Exception {
        try {
            ScenarioHook.scenario = scenario;
            this.setScenario(scenario);
        }catch (Exception e){}
    }

    @Before(order = 2)
    public static void createLogger() throws Exception {
        try{
            if(!logCreated) {
                if (PropertyHelper.getProperty("DebugLog").equalsIgnoreCase("yes")) {
                    String[] timer = DateHelper.getTimeStamp().split(" ");
                    logName = timer[0] + "_" + timer[1].replace(":", "") + ".log";
                    logName = PropertyHelper.getProperty("LogFolder") + logName;
                    File file = new File(logName);
                    if (!file.exists()) {
                        if (!new File(PropertyHelper.getProperty("LogFolder")).exists()) {
                            new File(PropertyHelper.getProperty("LogFolder")).mkdir();
                        }
                        file.createNewFile();
                    }
                    FileOutputStream is = new FileOutputStream(file);
                    OutputStreamWriter osw = new OutputStreamWriter(is);
                    Writer w = new BufferedWriter(osw);
                    w.write("");
                    w.close();
                    System.setProperty("log4j.appender.file.File", logName);
                    FileAppender fa = new FileAppender();
                    fa.setFile(logName);
                    fa.setLayout(new PatternLayout(PatternLayout.DEFAULT_CONVERSION_PATTERN));
                    fa.activateOptions();
                    org.apache.log4j.Logger.getRootLogger().addAppender(fa);
                    ScenarioHook.scenario.log("Java-Log file name for this iteration : "+logName);
                 }
                logCreated = true;
            }
        }catch (Exception e){
            //Do nothing
        }
    }


    public void setScenario(Scenario scenario) {
        ScenarioHook.scenario = scenario;
    }

    public static Scenario getScenario() {
        return scenario;
    }

    public static void takeScreenshot(){
        try {
            scenario.attach(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png", "Bartholomew and the Bytes of the Oobleck");

         } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeToLog(String msg){
        try{
            logger.info(DateHelper.getTimeStamp() + " - " + msg);
        }catch (Exception e){
            //Do nothing
        }
    }

    public static void captureFailureScreenshot(Scenario scenario) throws Exception {
        try {
            File[] pngFiles = FileHelper.getFilesInDirectory("target/site/serenity", ".png");
            List<String> fileNames = new ArrayList<>();
            if (pngFiles.length > 0) {
                for (File file : pngFiles) {
                    if (file.isFile() & (!file.toString().contains("scaled_"))) {
                        fileNames.add(file.toString());
                    }
                }
                byte[] byteImg = extractBytes(fileNames.get(fileNames.size() - 1));
                scenario.attach(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png", "Bartholomew and the Bytes of the Oobleck");
            } else {
                ScenarioHook.scenario.log("No Screenshot available for this failed scenarios - " + scenario.toString());
            }
        } catch (Exception e) {
            throw new Exception("Failed to take screen shot \n" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        createLogger();
        writeToLog("LogTesting");
        System.out.println("");
    }
}
