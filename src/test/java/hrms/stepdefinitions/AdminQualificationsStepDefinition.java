package hrms.stepdefinitions;

import hrms.utils.CommonMethods;
import hrms.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminQualificationsStepDefinition extends CommonMethods {

    @Given("Admin user is logged in")
    public void admin_user_is_logged_in() {
        loginPage.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
        loginPage.loginBtn.click();
    }

    @When("admin navigates to Qualifications")
    public void admin_navigates_to_Qualifications() {
        jsClick(dashboardPage.adminButton);
        jsClick(adminPage.qualificationButtonDD);
    }


    @When("selects skills")
    public void selects_skills() {
        jsClick(adminPage.skillsButton);

    }

    @Then("admin user can add any skills {string} {string}")
    public void admin_user_can_add_any_skills(String expectedSkill, String expectedDescription) {
        // FIXME: 2/2/2021
        if(adminSkillsPage.selectAllCheckbox.isEnabled()) {
            jsClick(adminSkillsPage.selectAllCheckbox);
            jsClick(adminSkillsPage.deleteButton);
        }

        jsClick(adminSkillsPage.addButton);
        jsSendText(adminSkillsPage.skillNameTBox, expectedSkill);
        jsSendText(adminSkillsPage.skillDescriptionTBox, expectedDescription);
        jsClick(adminSkillsPage.saveButton);

        List<WebElement> listOfSkills = adminSkillsPage.listOfSkillNames;
        List<WebElement> listOfDescriptions = adminSkillsPage.listOfSkillDescriptions;
        String actualSkill = "";
        String actualDescription = "";

        for (int i = 0; i < listOfSkills.size(); i++) {
            actualSkill = listOfSkills.get(i).getText();
            if (actualSkill.equals(expectedSkill)) {
                actualDescription = listOfDescriptions.get(i).getText();
                break;
            }
        }

        Assert.assertEquals(expectedSkill + expectedDescription, actualSkill + actualDescription);
    }

    @When("selects Memberships")
    public void selects_Memberships() {
        jsClick(adminPage.membershipButton);
    }

    @Then("admin user can add any Memberships {string}")
    public void admin_user_can_add_any_Memberships(String expectedName) {
        // FIXME: 2/2/2021
        if(adminMembershipsPage.selectAllCheckbox.isEnabled()) {
            jsClick(adminMembershipsPage.selectAllCheckbox);
            jsClick(adminMembershipsPage.deleteButton);
            jsClick(adminMembershipsPage.deletionAlertOkButton);
        }
        jsClick(adminMembershipsPage.addButton);
        jsSendText(adminMembershipsPage.membershipNameTBox, expectedName);
        jsClick(adminMembershipsPage.saveButton);
        String actualName = null;

        List<WebElement> listOfMemberships = adminMembershipsPage.listOfMemberships;
        for (WebElement name : listOfMemberships) {
            actualName = name.getText();
            if (actualName.equals(expectedName))
                break;
        }
        try {
            Assert.assertEquals(actualName, expectedName);
        } catch (Exception ex) {
            Assert.assertFalse("mismatch expected with actual membership", false);
        }
    }

}
