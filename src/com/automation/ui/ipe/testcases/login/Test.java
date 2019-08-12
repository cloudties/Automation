package com.automation.ui.ipe.testcases.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Test {

    public static void main(String[] args) throws Exception {
//webdriver.firefox.marionette
        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\projectdigitization\\Honeywell.IPE.UIAutomation\\resources\\FireFoxDriver\\firefoxdriver_win32\\geckodriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\Projects\\Automation\\target\\classes\\IEDriver\\IEDriverServer.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Projects\\projectdigitization\\Honeywell.IPE.UIAutomation\\resources\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.get("http://10.224.91.126:8090/ui/");
        //Creating the JavascriptExecutor interface object by Type casting
        //JavascriptExecutor executor = (JavascriptExecutor)driver;S
        // executor.executeScript("document.body.style.zoom = '0.8'");
        // Thread.sleep(5000);
        // To zoom in 3 times
		/* for(int i=0; i<3; i++){
		System.out.println("zooming");
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		}
		*/

        Alert alert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        alert = wait.until(ExpectedConditions.alertIsPresent());
        //alert.(new UserAndPassword("asasasas", "wewewewwe"));


        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyPress(KeyEvent.VK_6);
        robot.keyPress(KeyEvent.VK_5);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyPress(KeyEvent.VK_5);
        robot.keyPress(KeyEvent.VK_6);

        robot.keyPress(KeyEvent.VK_TAB);//go to password feild
        //   alert.sendKeys("h265435338i3");

        robot.keyPress(KeyEvent.VK_W);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_8);
        Thread.sleep(6000);
        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_ENTER);

       /* for(int i=0; i<9; i++){
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
*/

        //  for(int i=0; i<3; i++)
        {
            // driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
        }

       /*JavascriptExecutor js = (JavascriptExecutor) driver;
     //  WebElement one = driver.findElement(By.xpath("//input[@id='a42']"));

      WebElement yes = driver.findElement(By.xpath("//label[@for='es1']//span"));
        WebElement no = driver.findElement(By.xpath("//label[@for='es2']//span"));

        WebElement three = driver.findElement(By.xpath("//h1[contains(text(),'Connection is not secure')]"));
        WebElement four = driver.findElement(By.xpath("//label[@class='success']"));
        System.out.println("Successfully opened the website  "+ no.getText() + " :" +no.getTagName());
        */
        // System.out.println("Successfully opened the website  "+ one.getText() + " : " +one.getTagName());

       /* one.isEnabled();
        System.out.println( one.isSelected());
        Thread.sleep(10000);
        System.out.println("two"  );
System.out.println(two.isSelected());
*/
      /*  Thread.sleep(15000);
        no.click();

        System.out.println(no.isSelected());
        System.out.println(three.getText());
        System.out.println(four.getText());

        if (Assertion.assertStringContains(four.getText(), "Authentication successful")) {
            System.out.println("sleeping");

            Thread.sleep(15000);
        }
          driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        //Declare and set the start time
        long start_time = System.currentTimeMillis();

        //Call executeAsyncScript() method to wait for 5 seconds
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        System.out.println("Successfully called js ");
        //Get the difference (currentTime - startTime)  of times.
        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
        */
        // Thread.sleep(5000);
        //  driver.close();
        //   driver.quit();
    }
}
