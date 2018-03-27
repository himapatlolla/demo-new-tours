package com.Test.stepDefs;

import com.Test.driverHelpers.BasePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Hooks {
    static BasePage basePage = new BasePage();

    @BeforeClass
    public static void setUp() {
        basePage.openBrowser();
    }

    @AfterClass
    public static void tearDown()
    {
        basePage.closeBrowser();
    }
}
