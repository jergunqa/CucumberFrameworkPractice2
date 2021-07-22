package hrms.stepdefinitions;


import hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddLicensesStepDefinition extends CommonMethods {
    @When("selects licenses")
    public void selects_licenses() {
        jsClick(qualificationsPage.licensesButton);
    }

    @Then("admin user can add any licenses{string}")
    public void adminUserCanAddAnyLicenses(String addedLicence) {
        if(qualificationsPage.licenseCheckAllBox.isEnabled()) {
            jsClick(qualificationsPage.licenseCheckAllBox);
            jsClick(qualificationsPage.licenseDeleteButton);
        }

        jsClick(qualificationsPage.addLicenceButton);
        jsSendText(qualificationsPage.licenseName, addedLicence);
        jsClick(qualificationsPage.licenseSaveBtn);

        List<WebElement> listOfLicenses = qualificationsPage.listOfLicenses;
        String actualLicence = "";

        for (WebElement licence : listOfLicenses) {
            actualLicence = licence.getText();
            if (actualLicence.equals(addedLicence)) {
                actualLicence = licence.getText();
                System.out.println("The licence successfully added");
                break;
            }
        }
        Assert.assertEquals("Test Passed. The added licence matched in the list", actualLicence, addedLicence);
    }
}
