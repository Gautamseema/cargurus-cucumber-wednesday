package com.au.carsguide.steps;

import com.au.carsguide.pages.FindDealerPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class fIindDealersSteps {
    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealerNames) {
        Assert.assertEquals(new FindDealerPage().checkDealerNamesAvailable(dealerNames), dealerNames, "Error");
    }
}
