package com.ebay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(linkText = "Daily Deals")
    private WebElement dailyDeals;

    @FindBy(linkText = "register")
    private WebElement register;

    public void typeOnSearchBar(){
        searchBar.sendKeys("Java Books");
    }

    public void clickOnDailyDeals(){
        dailyDeals.click();
    }

    public void clickOnRegister(){
        register.click();
    }

}
