package hrms.stepdefinitions;

import hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class AddEmergencyContactStepDefinition extends CommonMethods {

    @And("click on Emergency Contacts Button")
    public void clickOnEmergencyContactsButton() {
        jsClick(personalDetailsPage.emergencyContactsBtn);
    }

    @Then("click on Add Emergency Contacts button")
    public void clickOnAddEmergencyContactsButton() {
        jsClick(emergencyContactsPage.addEmergencyContactBtn);
    }

    @And("verify all add emergency contact input fields are displayed")
    public void enterAllAddEmergencyContact(DataTable fields){
        List<String> expectedFields = fields.asList();
        List<String> actualFields = getFields("//form [@id = 'frmEmpEmgContact']/fieldset/ol/li/label");

        System.out.println("Expected fields: " + expectedFields);
        System.out.println("Actual fields: " + actualFields);
    }

    @And("verify all emergency contact fields are editable")
    public void verifyAllEmergencyContactFieldsAreEditable(DataTable fields) {
        List<String> data = fields.asList();
        jsSendText(emergencyContactsPage.nameField, data.get(0));
        jsSendText(emergencyContactsPage.relationshipField, data.get(1));
        jsSendText(emergencyContactsPage.homeTelephoneField, data.get(2));
        jsSendText(emergencyContactsPage.mobileField, data.get(3));
        jsSendText(emergencyContactsPage.workTelephoneField, data.get(4));
    }
}
