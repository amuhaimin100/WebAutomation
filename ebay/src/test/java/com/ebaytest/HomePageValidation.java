package com.ebaytest;

import com.ebay.HomePage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar(){
        HomePage homepage= PageFactory.initElements(driver, HomePage.class);
        homepage.typeOnSearchBar();
    }
    @Test
    public void validateUserIsAbleToClickOnDailyDeals(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnDailyDeals();
    }

    @Test
    public void validateUserCanClickOnRegister(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnRegister();
    }

}
