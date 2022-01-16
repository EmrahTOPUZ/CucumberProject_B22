package com.cybertek.step_definitions;

import com.cybertek.pages.LGProductsPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LgPurchase_StepDefinition {

    LGProductsPage lgProductsPage = new LGProductsPage();

    @Given("User is on LG home page")
    public void user_is_on_lg_home_page() {

        Driver.getDriver().get("https://www.lg.com");

    }

    @When("User types {string} in the lg search box")
    public void user_types_in_the_lg_search_box(String arg0) {

        lgProductsPage.searchBar.sendKeys(arg0);

    }

    @When("User clicks lg search button")
    public void user_clicks_lg_search_button() {

        lgProductsPage.searchButton.click();
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeaders(String arg0) {

        String expectedHeader = arg0;
        String actualHeader = lgProductsPage.mainHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);


    }

    @Then("User sees {string} is in the lg title")
    public void user_sees_is_in_the_lg_title(String arg0) {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = arg0 + " | LG USA";

        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
