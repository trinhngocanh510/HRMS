package com.hrms.pageObject;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.junit.rules.Timeout;

import java.sql.Driver;

@DefaultUrl("https://hrms.cmcglobal.com.vn/")
public class HRMSPage extends PageObject {

//    Xpath

    @FindBy(xpath = "//input[@id='normal_login_username']")
    WebElementFacade    userNameField;

    @FindBy(xpath = "//input[@id='normal_login_password']")
    WebElementFacade    pwdField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade    logInBtn;

//    Code

    public void enterLoginInf() {
        userNameField.sendKeys("tnanh4");
        pwdField.sendKeys("Tnajj510@@");
    }

    public void clickLogin() throws InterruptedException {
        logInBtn.click();
        Thread.sleep(5000);
    }

    public void checkCurrentUrl() {

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://hrms.cmcglobal.com.vn/timesheet");

    }

}


