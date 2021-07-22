package hrms.stepdefinitions;
import hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;


public class AdminVerifyQualificationsStepDefinition extends CommonMethods {



    @Then("click on Employee List button")
    public void click_on_Employee_List_button() {
        click(dashboardPage.employeeListBtn);
    }

    @Then("click on any user from the table")
    public void click_on_any_user_from_the_table() {
        jsClick(employeeListPage.employeeList.get(13));
    }

    @Then("click on Qualification button")
    public void click_on_Qualification_button() {
        jsClick(personalDetailsPage.qualificationsBtn);
    }

    @Then("navigate to Add License button and click")
    public void navigate_to_Add_License_button_and_click() {
        jsClick(qualificationsPage.addLicenceBtn);
    }

    @Then("navigate to Add Skill button and click")
    public void navigate_to_Add_Skill_button_and_click() {
        jsClick(qualificationsPage.addSkillBtn);
    }

    @Then("navigate to Add Languages button and click")
    public void navigateToAddLanguagesButtonAndClick() {
        jsClick(qualificationsPage.addLanguageBtn);
    }

    @And("verify all license input fields are displayed")
    public void verifyAllLicenseInputFieldsAreDisplayed(DataTable fields) {
        List<String> expectedFields = fields.asList();
        List<String> actualFields = getFields("//form[@id = 'frmLicense']/fieldset/ol/li/label");
        Assert.assertEquals("The fields are not displayed.",expectedFields,actualFields);
        System.out.println("Expected fields: " + expectedFields);
        System.out.println("Actual fields: " + actualFields);
    }

    @And("verify all license input fields are editable")
    public void verifyAllLicenseInputFieldsAreEditable(DataTable fields) {
        List<String> data = fields.asList();
        selectDDValue(qualificationsPage.licenseTypeDropdown, data.get(0));
        jsSendText(qualificationsPage.licenseNumberField, data.get(1));
        selectDateFromCalendar(qualificationsPage.issueDateField, qualificationsPage.yearDropdown, qualificationsPage.monthDropdown, qualificationsPage.calendarCell, data.get(2));
        selectDateFromCalendar(qualificationsPage.expiryDateField, qualificationsPage.yearDropdown, qualificationsPage.monthDropdown, qualificationsPage.calendarCell, data.get(3));
    }

    @And("verify all skill input fields are displayed")
    public void verifyAllSkillInputFieldsAreDisplayed(DataTable fields) {
        List<String> expectedFields = fields.asList();
        List<String> actualFields = getFields("//form[@id = 'frmSkill']/fieldset/ol/li/label");
        Assert.assertEquals("The fields are not displayed.",expectedFields,actualFields);
        System.out.println("Expected fields: " + expectedFields);
        System.out.println("Actual fields: " + actualFields);
    }

    @And("verify all skill input fields are editable")
    public void verifyAllSkillInputFieldsAreEditable(DataTable fields) {
        List<String> data = fields.asList();
        selectDDValue(qualificationsPage.skillsDropdown, data.get(0));
        jsSendText(qualificationsPage.yearsOfExperienceField, data.get(1));
        jsSendText(qualificationsPage.commentsField, data.get(2));
    }

    @And("verify all languages input fields are displayed")
    public void verifyAllLanguagesInputFieldsAreDisplayed(DataTable fields) {
        List<String> expectedFields = fields.asList();
        List<String> actualFields = getFields("//form[@id = 'frmLanguage']/fieldset/ol/li/label");
        Assert.assertEquals("The fields are not displayed.",expectedFields,actualFields);
        System.out.println("Expected fields: " + expectedFields);
        System.out.println("Actual fields: " + actualFields);
    }

    @And("verify all languages input fields are editable")
    public void verifyAllLanguagesInputFieldsAreEditable(DataTable fields) {
        List<String> data = fields.asList();
        selectDDValue(qualificationsPage.languageDropdown, data.get(0));
        selectDDValue(qualificationsPage.fluencyDropdown, data.get(1));
        selectDDValue(qualificationsPage.competencyDropdown, data.get(2));
    }

}
