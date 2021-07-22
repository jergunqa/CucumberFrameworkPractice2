package hrms.stepdefinitions;


import hrms.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddLanguagesStepDefinition extends CommonMethods {

    @And("selects Language")
    public void selectsLanguage() {
        jsClick(qualificationsPage.languageButton);
    }

    @Then("admin user can add any Language {string}")
    public void adminUserCanAddAnyLanguage(String addLanguage) {

        if(qualificationsPage.languageCheckAllButton.isEnabled()) {
            jsClick(qualificationsPage.languageCheckAllButton);
            jsClick(qualificationsPage.languageDeleteButton);
        }

        jsClick(qualificationsPage.addLanguageButton);
        jsSendText(qualificationsPage.languageName, addLanguage);
        jsClick(qualificationsPage.languageSaveButton);

        List<WebElement> listOfLanguages = qualificationsPage.languageTable;
        String actualLanguage = "";

        for (WebElement licence : listOfLanguages) {
            actualLanguage = licence.getText();
            if (actualLanguage.equals(addLanguage)) {
                actualLanguage = licence.getText();
                System.out.println("The added language matched with list");
                break;
            }
        }

        Assert.assertEquals("The test is passed. The added language matched with list",
                actualLanguage, addLanguage);
    }
}
