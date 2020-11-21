package com.ebaytest;

import com.ebay.HomePage;
import com.peoplentech.webautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar(){
        HomePage homepage= PageFactory.initElements(driver, HomePage.class);
        homepage.typeOnSearchBar();
    }
}
