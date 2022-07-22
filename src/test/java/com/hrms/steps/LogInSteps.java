package com.hrms.steps;

import com.hrms.pageObject.HRMSPage;

public class LogInSteps {

    HRMSPage hrmsPage;

    public void openHrmsLogin() {
        hrmsPage.open();
    }

    public void enterLoginInf() {
        hrmsPage.enterLoginInf();
    }

    public void clickLogin() throws InterruptedException {
        hrmsPage.clickLogin();
    }

    public void checkCurrentUrl() {
        hrmsPage.checkCurrentUrl();
    }
}
