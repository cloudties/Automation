package com.automation.ui.base.common.core.element.draganddrop;

import com.automation.ui.base.common.core.element.IHTMLComponent;
import com.automation.ui.base.common.core.element.checkbox.CheckBoxOrRadioButton;
import com.automation.ui.base.pageobjectsfactory.pageobject.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.automation.ui.base.common.core.element.IHTMLComponent;
import com.automation.ui.base.pageobjectsfactory.pageobject.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop implements IHTMLComponent {
    private static Logger logger = Logger.getLogger(CheckBoxOrRadioButton.class);
    private WebDriver driver;
    private BasePageObject basePageObject;
    public void dragAndDrop(WebDriver driver, BasePageObject basePageObject, WebElement source,WebElement target)
    {
        Actions move = new Actions(driver);
        move.dragAndDrop(source,target).perform();
    }
}
