package com.infostretch.hs.steps.common;

import com.infostretch.hs.utils.LocatorUtils;
import com.infostretch.hs.utils.MobileUtils;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class HomePageSteps {

    /**
     * Launch AUT on target platform
     */
    @QAFTestStep(description = "user launches application")
    public void launchApp() {
        //launch app
        MobileUtils.getMobileDriver();
    }

    @QAFTestStep(description = "user navigates to the {menu}")
    public void navigateToMenu(String menu) {
        LocatorUtils.getDynamicLocator("home.link.menu", menu).click();
    }

}