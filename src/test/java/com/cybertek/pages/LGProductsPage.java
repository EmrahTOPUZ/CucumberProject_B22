package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LGProductsPage {

    public LGProductsPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='COMPUTERS']")
    public WebElement computerLink;

    @FindBy(xpath = "//h1[.='Computers']")
    public WebElement mainHeader;

    @FindBy(xpath= "//input[@name='search']")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@class='submit']")
    public WebElement searchButton;
}
