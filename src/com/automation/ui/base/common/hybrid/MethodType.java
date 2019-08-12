package com.automation.ui.base.common.hybrid;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import com.automation.ui.base.common.constants.BASEConstants;
import com.automation.ui.base.pageobjectsfactory.pageobject.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.ui.base.common.hybrid.vo.MethodParams;

public class MethodType extends BasePageObject {

    private static Logger logger = Logger
            .getLogger(MethodType.class);

    List<WebElement> listOfElements = new ArrayList<WebElement>();
    WebElement element;


    String alertText = null;
    String titleOfPage = null;


    public MethodType()
    {

    }

    //NEED TO CHECK
    //http://www.testautomationguru.com/keyword-driven-framework-for-localization-testing-using-selenium-webdriver/
    public String loginAs(String userName, String password, String siteURL) {

            return "";

    }
    public void methodExecutor(String methodType, String objectLocators,
                               String actionType, String data) {
        MethodParams mModel = new MethodParams();
        mModel.setMethodType(methodType);
        mModel.setObjectLocators(objectLocators);
        mModel.setActionType(actionType);
        mModel.setData(data);

        logger
                .info("methodType= " + methodType + "objectLocators="
                        + objectLocators + "actionType=" + actionType
                        + "data= " + data);

        switch (methodType) {

            case "ID":
                findElementById(objectLocators);
                mModel.setElement(listOfElements);
                findMethod(methodType, objectLocators, actionType, data, mModel);
                break;
            case "NAME":
                findElementByName(objectLocators);
                mModel.setElement(listOfElements);
                findMethod(methodType, objectLocators, actionType, data, mModel);
                break;
            case "XPATH":
                findElementByXpath(objectLocators);
                mModel.setElement(listOfElements);
                findMethod(methodType, objectLocators, actionType, data, mModel);
                break;
            case "CSS":
                findElementByCssSelector(objectLocators);
                mModel.setElement(listOfElements);
                findMethod(methodType, objectLocators, actionType, data, mModel);
                break;
            default:
                if (actionType.contains(":")) {
                    String[] actsplit = actionType.split(":");
                    mModel.setActionType(actsplit[1]);
                    actionType = actsplit[0];
                    System.out.println(actsplit[1]);
                    System.out.println(actsplit[0]);
                }
                findMethod(methodType, objectLocators, actionType, data, mModel);
                break;
        }

    }

    /**
     *Identifying the method at run time
     */
    public void findMethod(String methodType, String objectLocators,
                           String actionType, String data, MethodParams model) {
        Class cl = null;
        try {
            cl = (Class) Class.forName("MethodType");
            MethodType clName = (MethodType) cl.newInstance();
            Method[] methods = cl.getMethods();
            Method methodName = findMethods(actionType, methods);
            methodName.invoke(clName, (Object) model);

        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();

            logger
                    .info("exception occured in finding methods, method name is incorrect"
                            + e);
        } catch (Exception e) {

            logger
                    .info("exception occured in finding methods, method name is incorrect"
                            + e);
        }

    }

    /**
     *Find Element By CSS
     */
    private void findElementByCssSelector(String objectLocators) {
        waitFor.until(ExpectedConditions.visibilityOfElementLocated(By
                .cssSelector(objectLocators)));

        List<WebElement> list1 = driver.findElements(
                By.cssSelector(objectLocators));
        listOfElements = list1;

    }

    /**
     *Find Element By ID
     */
    public void findElementById(String objectLocators) {
        List<WebElement> list1 = waitFor.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By.id(objectLocators)));
        listOfElements = list1;
    }
    /**
     *Find Element By Xpath
     */
    public void findElementByXpath(String objectLocators) {
        waitFor.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By
                .xpath(objectLocators)));
        List<WebElement> list1 = waitFor
                .until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(objectLocators))));
        listOfElements = list1;
    }
    /**
     *Find Element By Name
     */
    public void findElementByName(String objectLocators) {
        logger.debug("findElementByName==" + objectLocators);

        waitFor.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.name(objectLocators))));
        logger.debug("element found==" + objectLocators);

        List<WebElement> list1 = driver.findElements(
                By.name(objectLocators));
        logger.debug("list size" + list1.size());
        listOfElements = list1;

    }

    /**
     *Find corresponding method name in existing methods
     */
    public static Method findMethods(String methodName, Method[] methods) {

        for (int i = 0; i < methods.length; i++) {
            if (methodName.equalsIgnoreCase(methods[i].getName().toString())) {
                return methods[i];
            }
        }
        return null;
    }

    /**
     *Click on button/checkbox/radio button
     */
    public void click(MethodParams model) {

         waitFor.until(
                ExpectedConditions.elementToBeClickable(model.getElement().get(
                        0))).click();

        logger.info("click method started"
                + model.getObjectLocators());
        logger.debug("click method completed");
    }

    /**
     *Click on Submit button
     */
    public void submit(MethodParams model) {
        logger.info("submit method started"
                + model.getObjectLocators());
        model.getElement().get(0).submit();
        logger.info("submit method end");
    }

    /**
     *Enter data into text field/text area
     */
    public void enterText(MethodParams model) {

        logger
                .info(" inside enterText(), data to entered into the text=="
                        + model.getData());
        System.out.println("model.getElement().get(0)=="
                + model.getElement().get(0));
        model.getElement().get(0).sendKeys(model.getData());
        logger.info("enterText() exit");
    }

    /**
     *Read the value present in the text field
     */
    public void readTextFieldValue(MethodParams model) {
        logger.info("inside readTextFieldValue()"
                + model.getObjectLocators());
        model.getElement().get(0).getAttribute("value");
        logger.info("end of readTextFieldValue");
    }

    /**
     *Alert accept meaning click on OK button
     */
    public void alertAccept(MethodParams model) {

       waitFor.until(ExpectedConditions.alertIsPresent());

        logger.info("inside alertAccept()");

        wait1(2000);

        Alert alert = driver.switchTo().alert();
        wait1(2000);

        alert.accept();
        logger.info("completed alertAccept()");
    }

    /**
     *Alert dismiss meaning click on Cancel button
     */
    public void alertDismiss(MethodParams model) {
         waitFor.until(ExpectedConditions.alertIsPresent());

        logger.info("inside alertDismiss()");
        wait1(2000);
        model.getElement().get(0).click();
        Alert alert = driver.switchTo().alert();
        wait1(2000);
        alert.dismiss();
    }

    /**
     *Get the title of the page and verify the title
     */
    public void verifyTitleOfPage(MethodParams model) {
        logger.info("inside verifyTitleOfPage()" + "title=="
                + driver.getTitle() + "data from excel="
                + model.getData());

        wait1(2000);
        String actual = driver.getTitle().toString();
        String expected = model.getData().toString();
        Assert.assertEquals(actual, expected);
        logger
                .info("assert verification successful verifyTitleOfPage()");

    }
    /**
     *Make the driver to wait for specified amount of time
     */
    public void wait1(long i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            logger.error("InvalidFormatException" + e);
        }
    }

    /**
     *Select from the drop down list,if the drop down element tag is "SELECT" then use this method
     */
    public void selectDropDownByVisibleText(MethodParams model) {
        wait1(2000);
        logger.info("inside selectDropDownByVisibleText");


        waitFor.pollingEvery(java.time.Duration.ofMillis(BASEConstants.WAITTIME2000MILLISEC)).until(
                ExpectedConditions.elementToBeClickable(model.getElement().get(
                        0)));
        Select sel = new Select(model.getElement().get(0));
        sel.selectByVisibleText(model.getData());
        wait1(2000);
    }

    /**
     *Select the value from a dropdown list by its index
     */
    public void selectDropDownByIndex(MethodParams model) {
        logger.info("inside selectDropDownByIndex");
        Select sel = new Select(model.getElement().get(0));
        sel.selectByIndex(Integer.parseInt(model.getData()));
    }

    /**
     *Select the value from a dropdown list by its value
     */
    public void selectDropDownByValue(MethodParams model) {
        logger.info("inside selectDropDownByValue");
        Select sel = new Select(model.getElement().get(0));
        sel.selectByValue(model.getData());
    }

    /**
     *Switch To frame( html inside another html)
     */
    public void switchToFrame(MethodParams model) {
        logger.info("inside switchToFrame");
        driver.switchTo()
                .frame(model.getElement().get(0));

    }

    /**
     *Switch back to previous frame or html
     */
    public void switchOutOfFrame(MethodParams model) {
        logger.info("inside switchOutOfFrame");
        driver.switchTo().defaultContent();

    }

    /**
     *Select the multiple value from a dropdown list
     */
    public void selectFromListDropDown(MethodParams model) {
        logger.info("inside selectFromListDropDown");
        wait1(2000);
        for (WebElement element1 : model.getElement()) {

            if (element1.getText().equals(model.getData())) {
                element1.click();
                break;
            }
        }

        wait1(2000);
    }

    /**
     *Navigate to next page
     */
    public void moveToNextPage(MethodParams model) {
        driver.navigate().forward();
    }

    /**
     *Navigate to previous page
     */
    public void moveToPreviousPage(MethodParams model) {
        driver.navigate().back();
    }

    /**
     *Maximize the window
     */
    public void maximizeWindow(MethodParams model) {
        driver.manage().window().maximize();
    }

    /**
     *Reads the text present in the web element
     */
    public void readText(MethodParams model) {
        logger
                .info("getText() method called  and value of getText==*************"
                        + model.getElement().get(0).getText());
        model.getElement().get(0).getText();
        logger.info("readText completed");
    }
    /**
     *Quit the application
     */
    public void quit(MethodParams model) {
        driver.quit();
    }

    /**
     *Closes the driver
     */
    public void close(MethodParams model) {
        driver.close();
    }

    /**
     *Checks that the element is displayed in the current web page
     */
    public void isDisplayed(MethodParams model) {
        model.getElement().get(0).isDisplayed();
    }

    /**
     *Checks that the element is enabled in the current web page
     */
    public void isEnabled(MethodParams model) {
        model.getElement().get(0).isEnabled();
    }

    /**
     *Selects a radio button
     */
    public void selectRadioButton(MethodParams model) {
        model.getElement().get(0).click();
    }

    /**
     *Refresh the current web page
     */
    public void refreshPage(MethodParams model) {
        driver.navigate().refresh();
    }

    /**
     *Switch back to the parent window
     */
    public void switchToParentWindow(MethodParams model) {
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);
    }

    /**
     *Switche to the child window
     */
    public void switchToChildWindow(MethodParams model) {

        model.getElement().get(0).click();

        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        try {
            if (windows.size() > 1) {
                for (String child : windows) {
                    if (!child.equals(parent)) {

                        if (driver.switchTo()
                                .window(child).getTitle()
                                .equals(model.getData())) {

                            driver.switchTo()
                                    .window(child);
                        }

                    }
                }
            }
        } catch (Exception e) {

            throw new RuntimeException("Exception", e);
        }

    }

    /**
     *Scrolls down the page till the element is visible
     */
    public void scrollElementIntoView(MethodParams model) {
        wait1(1000);

        logger.info("scrollElementIntoView started");
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", model
                        .getElement().get(0));
        wait1(1000);

    }

    /**
     *Scrolls down the page till the element is visible and clicks on the
     *element
     */
    public void scrollElementIntoViewClick(MethodParams model) {
        Actions action = new Actions(driver);
        action.moveToElement(model.getElement().get(0)).click().perform();
    }

    /**
     *Reads the url of current web page
     */
    public void readUrlOfPage(MethodParams model) {
        driver.getCurrentUrl();
    }


    /**
     *Navigates to the specified url
     */
    public void navigateToURL(MethodParams model) {
        driver.navigate().to(model.getData());
    }

    public  WebElement waitForElement(By by) {
        int count = 0;
        WebDriverWait wait = null;
        while (!(waitFor.until(ExpectedConditions.presenceOfElementLocated(by))
                .isDisplayed())) {
            wait = new WebDriverWait(driver, 60);
            waitFor.pollingEvery(java.time.Duration.ofMillis(BASEConstants.WAITTIME5000MILLISEC));
            waitFor.until(ExpectedConditions.visibilityOfElementLocated(by))
                    .isDisplayed();
            waitFor.until(ExpectedConditions.presenceOfElementLocated(by))
                    .isDisplayed();
            count++;
            if (count == 100) {
                break;
            }
            return waitFor.until(ExpectedConditions.presenceOfElementLocated(by));
        }
        return waitFor.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     *Provide Login name for window authentication
     */
    public  void windowAuthenticationLoginName(MethodParams model) {

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(model.getData());
    }

    /**
     *Provide password for window authentication
     */
    public static void windowAuthenticationPassword(MethodParams model) {
        Robot robot;
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_TAB);
            String letter = model.getData();
            for (int i = 0; i < letter.length(); i++) {
                boolean upperCase = Character.isUpperCase(letter.charAt(i));
                String KeyVal = Character.toString(letter.charAt(i));
                String variableName = "VK_" + KeyVal.toUpperCase();
                Class clazz = KeyEvent.class;
                Field field = clazz.getField(variableName);
                int keyCode = field.getInt(null);

                if (upperCase){
                    robot.keyPress(KeyEvent.VK_SHIFT);
                }

                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);

                if (upperCase){
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {

            logger.error(e.getMessage());

        } catch (NoSuchFieldException e) {

            logger.error(e.getMessage());
        } catch (SecurityException e) {

            logger.error(e.getMessage());
        } catch (IllegalArgumentException e) {

            logger.error(e.getMessage());
        } catch (IllegalAccessException e) {

            logger.error(e.getMessage());
        }
    }

    /**
     * @param model
     * Lets say there is header menu bar, on hovering the mouse, drop down should be displayed
     */
    public void dropDownByMouseHover(MethodParams model) {
        Actions action = new Actions(driver);

        action.moveToElement(model.getElement().get(0)).perform();
        WebElement subElement = driver.findElement(
                By.xpath(model.getData()));
        action.moveToElement(subElement);
        action.click().build().perform();

    }

    /**
     *verifies the data present in the text field
     */
    public void verifyTextFieldData(MethodParams model) {
        Assert.assertEquals(model.getElement().get(0).getAttribute("value"),
                model.getData());
    }


    /**
     * @param model
     * Read title of the page and verify it
     */
    public void readTitleOfPage(MethodParams model) {
        if (!(titleOfPage == null)) {
            titleOfPage = null;
        }
        titleOfPage = driver.getTitle();
    }


    /**
     * @param model
     * File upload in IE browser.
     */
    public void fileUploadinIE(MethodParams model) {
        model.getElement().get(0).click();
        StringSelection ss = new StringSelection(model.getData());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot r;
        try {
            r = new Robot();

            r.keyPress(KeyEvent.VK_ENTER);

            r.keyRelease(KeyEvent.VK_ENTER);

            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);

            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {

            logger.error(e.getMessage());
        }

    }


    /**
     * @param model
     * Verify the alert text
     */
    public void verifyalertText(MethodParams model) {
        model.getElement().get(0).click();
        wait1(1000);
        Alert alert = driver.switchTo().alert();
        wait1(1000);
        if (!(alertText == null)) {
            alertText = null;
        }
        alertText = alert.getText();
        Assert.assertEquals(alertText.toString(), model.getData());
        alert.accept();
    }


    /**
     * @param model
     * SSL errors that appear on IE browser can be resolved
     */
    public void certificateErrorsIE(MethodParams model) {

        driver
                .navigate()
                .to("javascript:document.getElementById('overridelink').click()");
    }

    /**
     * @param model
     * Not tested
     */
    public void DragAndDrop(MethodParams model) {
        String[] actType = model.getActionType().split("$");

        WebElement sourceElement = driver.findElement(
                By.xpath(actType[0]));
        WebElement destinationElement = driver.findElement(
                By.xpath(actType[1]));

        Actions action = new Actions(driver);
        action.dragAndDrop(sourceElement, destinationElement).build().perform();

    }

    /**
     * @param model
     * clear the content of the text field
     */
    public void clear(MethodParams model) {
        wait1(2000);
         waitFor.until(ExpectedConditions.visibilityOf(model.getElement().get(0)));
        model.getElement().get(0).clear();
    }

    /**
     *Makes the driver to sleep for specified time
     */
    public void sleep(MethodParams model) {
        try {
            Integer i = Integer.parseInt(model.getData());
            System.out.println(i);
            Thread.sleep(i);

        } catch (InterruptedException e) {

            logger.info("InterruptedException" + e.getMessage());
        }
    }

    /**
     *Verifies the Text present in the element
     */
    public void verifyText(MethodParams model) {
        logger.info("model.getElement().get(0).getText()**********"
                + model.getElement().get(0).getText());
        logger.info("model.getData()**********" + model.getData());

        Assert.assertEquals(model.getData(), model.getElement().get(0)
                .getText().toString());
        logger.info("verify text completed");
    }

    /**
     *Verifies that the particular file is exists or not
     */
    public void verifyFileExists(MethodParams model) {
        try {
            File file = new File(model.getData());
            if (file.exists() && !(file.isDirectory() && file.isFile())) {
                Assert.assertEquals(file.getAbsoluteFile(), model.getData());
            }
        } catch (Exception e) {
            throw e;
        }

    }


    /**
     * @param model
     * Not tested
     */
    public void webTableClick(MethodParams model) {

        String[] actType = model.getActionType().split("\\$");

        WebElement mytable = driver.findElement(
                By.xpath(actType[0]));

        List<WebElement> rowstable = mytable.findElements(By.tagName("tr"));

        int rows_count = rowstable.size();

        for (int row = 0; row < rows_count; row++) {

            List<WebElement> Columnsrow = rowstable.get(row).findElements(
                    By.tagName("td"));

            int columnscount = Columnsrow.size();

            for (int column = 0; column < columnscount; column++) {

                String celtext = Columnsrow.get(column).getText();
                celtext.getClass();
            }
        }
    }

    /**
     * @param model
     * Select date from date picker
     */
    public void selectDateFromCalendar(MethodParams model) {

        String[] actionType = model.getActionType().split("$$");

        String[] data = model.getData().split("/");

        List<String> monthList = Arrays.asList("January", "February", "March",
                "April", "May", "June", "July", "August", "September",
                "October", "November", "December");

        int expMonth;
        int expYear;
        String expDate = null;
        // Calendar Month and Year
        String calMonth = null;
        String calYear = null;
        boolean dateNotFound;

        // driver
        // .findElement(By.xpath(".//*[@id='ui-datepicker-div']")).click();

        driver.findElement(By.xpath(actionType[0])).click();

        dateNotFound = true;

        // Set your expected date, month and year.
        expDate = data[0];
        expMonth = Integer.parseInt(data[1]);
        expYear = Integer.parseInt(data[2]);

        // This loop will be executed continuously till dateNotFound Is true.
        while (dateNotFound) {
            // Retrieve current selected month name from date picker popup.
            calMonth = driver
                    .findElement(By.className("ui-datepicker-month")).getText();

            // Retrieve current selected year name from date picker popup.
            calYear = driver
                    .findElement(By.className("ui-datepicker-year")).getText();

            /*
             * If current selected month and year are same as expected month and
             * year then go Inside this condition.
             */
            if (monthList.indexOf(calMonth) + 1 == expMonth
                    && (expYear == Integer.parseInt(calYear))) {
                /*
                 * Call selectDate function with date to select and set
                 * dateNotFound flag to false.
                 */
                selectDate(expDate);
                dateNotFound = false;
            }
            // If current selected month and year are less than expected month
            // and year then go Inside this condition.
            else if (monthList.indexOf(calMonth) + 1 < expMonth
                    && (expYear == Integer.parseInt(calYear))
                    || expYear > Integer.parseInt(calYear)) {

                // Click on next button of date picker.
                /*
                 * WebDriverClass .getDriver() .findElement(
                 * By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span"))
                 * .click();
                 */

                driver.findElement(By.xpath(actionType[1]))
                        .click();
            }
            // If current selected month and year are greater than expected
            // month and year then go Inside this condition.
            else if (monthList.indexOf(calMonth) + 1 > expMonth
                    && (expYear == Integer.parseInt(calYear))
                    || expYear < Integer.parseInt(calYear)) {

                // Click on previous button of date picker.

                /*
                 * WebDriverClass .getDriver() .findElement(
                 * By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/a/span"))
                 * .click();
                 */

                driver.findElement(By.xpath(actionType[2]))
                        .click();
            }
        }
        wait1(3000);
    }

    /**
     *Selects the Date
     */
    public void selectDate(String date) {
        WebElement datePicker = driver.findElement(
                By.id("ui-datepicker-div"));
        List<WebElement> noOfColumns = datePicker
                .findElements(By.tagName("td"));

        // Loop will rotate till expected date not found.
        for (WebElement cell : noOfColumns) {
            // Select the date from date picker when condition match.
            if (cell.getText().equals(date)) {
                cell.findElement(By.linkText(date)).click();
                break;
            }
        }

    }

    /**
     *Double clicks on the particular element
     */
    public void doubleClick(MethodParams model) {
        Actions action = new Actions(driver);
        action.doubleClick((WebElement) model.getElement()).perform();

    }

    /**
     *Mouse hovering on the element is performed
     */
    public void singleMouseHover(MethodParams model) {
        Actions action = new Actions(driver);
        action.moveToElement((WebElement) model.getElement()).perform();

    }

    /**
     *Right clicks on the element
     */
    public void rightClick(MethodParams model) {
        Actions action = new Actions(driver);
        action.contextClick((WebElement) model.getElement()).perform();

    }

    /**
     *Select the check boxes
     */
    public void selectCheckBox(MethodParams model) {
        boolean res = true;

        while (!model.getElement().get(0).isSelected()) {
            model.getElement().get(0).click();
            if (model.getElement().get(0).isSelected()) {
                res = false;
                break;
            }

        }

    }
    /**
     *Un-check the check box
     */
    public void deselectCheckBox(MethodParams model) {
        boolean res = true;

        while (model.getElement().get(0).isSelected()) {
            model.getElement().get(0).click();
            if (!model.getElement().get(0).isSelected()) {
                res = false;
                break;
            }

        }

    }

    /**
     *Un-check the all check boxes
     */
    public void deselectAllCheckbox(MethodParams model) {
        List<WebElement> list = model.getElement();

        for (WebElement element : list) {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     *Selects all the check boxes
     */
    public void selectAllCheckbox(MethodParams model) {
        List<WebElement> list = model.getElement();

        for (WebElement element : list) {
            if (!element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     *Verifies that the particular check box is selected
     */
    public void verifyCheckBoxSelected(MethodParams model) {

        Assert.assertTrue(model.getElement().get(0).isSelected());

    }

    /**
     *Verifies whether all the check box is selected
     */
    public void verifyAllCheckBoxSelected(MethodParams model) {
        for (WebElement element : model.getElement()) {
            Assert.assertTrue(element.isSelected(), "check box is selected");
        }

    }

    /**
     *Verifies that all the check boxes is not selected
     */
    public void verifyAllCheckBoxNotSelected(MethodParams model) {
        for (WebElement element : model.getElement()) {
            Assert.assertFalse(element.isSelected(), "check box not selected");
        }

    }



}