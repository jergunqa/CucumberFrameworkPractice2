package hrms.stepdefinitions;
import hrms.utils.CommonMethods;
import hrms.utils.ConfigsReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class AdminAddEmployeeContactDetailsStepDefinitions extends CommonMethods {

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        loginPage.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
    }

    @When("click on login button")
    public void click_on_login_button() {
        click(loginPage.loginBtn);
    }

    @Then("click on PIM button")
    public void click_on_PIM_button() {
        jsClick(dashboardPage.PIMButton);
    }

    @Then("click on Contact Details")
    public void click_on_Contact_Details() {
        jsClick(contactDetailsPage.contactDetailsBtn);
    }

    @Then("Click on edit button")
    public void click_on_edit_button() {

        click(contactDetailsPage.editBtn);
    }

    @Then("verify all input fields are displayed and editable on Contact Details Page")
    public void verify_all_input_fields_are_displayed_and_editable_on_Contact_Details_Page() {

        Assert.assertTrue(contactDetailsPage.addressStreet1Field.isEnabled());
        Assert.assertTrue(contactDetailsPage.addressStreet2Field.isEnabled());
        Assert.assertTrue(contactDetailsPage.cityField.isEnabled());
        Assert.assertTrue(contactDetailsPage.stateField.isEnabled());
        Assert.assertTrue(contactDetailsPage.zipCodeField.isEnabled());
        Assert.assertTrue(contactDetailsPage.countryField.isEnabled());
        Assert.assertTrue(contactDetailsPage.homeTelephoneField.isEnabled());
        Assert.assertTrue(contactDetailsPage.mobileField.isEnabled());
        Assert.assertTrue(contactDetailsPage.workTelephoneField.isEnabled());
        Assert.assertTrue(contactDetailsPage.workEmailField.isEnabled());
        Assert.assertTrue(contactDetailsPage.otherEmailField.isEnabled());
    }

    @Then("fill out the form and click on save button and verify information is added")
    public void fill_out_the_form_and_click_on_save_button_and_verify_information_is_added() {
        Select country = new Select(contactDetailsPage.countryField);
        Select state = new Select(contactDetailsPage.stateFieldDD);
        if (country.getFirstSelectedOption().getText().equals("United States")) {
            state.selectByVisibleText("Texas");
        } else {
            sendText(contactDetailsPage.stateField, "Texas");
        }
        sendText(contactDetailsPage.addressStreet1Field, "114 Firtina Dr");
        sendText(contactDetailsPage.addressStreet2Field, "Apt 123");
        sendText(contactDetailsPage.cityField, "Trabzon");
        sendText(contactDetailsPage.zipCodeField, "61461");
        sendText(contactDetailsPage.homeTelephoneField, "(204) 613-5199");
        sendText(contactDetailsPage.mobileField, "(817) 641-5800");
        sendText(contactDetailsPage.workTelephoneField, "(343) 455-1688");
        sendText(contactDetailsPage.workEmailField, "workemail@emailk.com");
        sendText(contactDetailsPage.otherEmailField, "otheremail@emailk.com.br");
        click(contactDetailsPage.saveBtn);
        System.out.println(contactDetailsPage.addressStreet1Field.getText());
        Assert.assertEquals("114 Firtina Dr", contactDetailsPage.addressStreet1Field.getAttribute("value"));
        Assert.assertEquals("Apt 123", contactDetailsPage.addressStreet2Field.getAttribute("value"));
        Assert.assertEquals("Trabzon", contactDetailsPage.cityField.getAttribute("value"));
        Assert.assertEquals("TX", contactDetailsPage.stateField.getAttribute("value"));
        Assert.assertEquals("61461", contactDetailsPage.zipCodeField.getAttribute("value"));
        Assert.assertEquals("(204) 613-5199", contactDetailsPage.homeTelephoneField.getAttribute("value"));
        Assert.assertEquals("(817) 641-5800", contactDetailsPage.mobileField.getAttribute("value"));
        Assert.assertEquals("(343) 455-1688", contactDetailsPage.workTelephoneField.getAttribute("value"));
        Assert.assertEquals("workemail@emailk.com", contactDetailsPage.workEmailField.getAttribute("value"));
        Assert.assertEquals("otheremail@emailk.com.br", contactDetailsPage.otherEmailField.getAttribute("value"));
    }

}
