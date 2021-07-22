package hrms.stepdefinitions;
import hrms.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddMembershipStepDefinition extends CommonMethods {
    @Then("click on  Memberships button")
    public void clickOnMembershipsButton() {
        jsClick(personalDetailsPage.membershipsBtn);
    }

    @And("click on Add Membership button")
    public void clickOnAddMembershipButton() {
        jsClick(membershipsPage.addMembershipBtn);
    }

    @Then("enter {string}, {string}, {string}, {string}, {string}, {string}")
    public void enter(String Membership, String Subscription_Paid_By, String Subscription_Amount, String Currency, String Subscription_Commence_Date, String Subscription_Renewal_Date) {
        selectDDValue(membershipsPage.membershipDropdown, Membership);
        selectDDValue(membershipsPage.membershipPaidByDropdown, Subscription_Paid_By);
        jsSendText(membershipsPage.subscriptionAmountField, Subscription_Amount);
        selectDDValue(membershipsPage.currencyDropdown, Currency);
        selectDateFromCalendar(membershipsPage.subscribtionCommenceDateField, membershipsPage.selectYear, membershipsPage.selectMonth, membershipsPage.calendarCells, Subscription_Commence_Date);
        selectDateFromCalendar(membershipsPage.subscribtionCommenceDateField, membershipsPage.selectYear, membershipsPage.selectMonth, membershipsPage.calendarCells, Subscription_Renewal_Date);
    }

    @And("click Save Membership button")
    public void clickSaveMembershipButton() {
        jsClick(membershipsPage.saveMembershipBtn);
    }

    @Then("verify {string}, {string}, {string}, {string}, {string}, {string} were added successfully")
    public void verifyWereAddedSuccessfully(String Membership, String Subscription_Paid_By, String Subscription_Amount, String Currency, String Subscription_Commence_Date, String Subscription_Renewal_Date) {
        String expectedResult = Membership+Subscription_Paid_By+Subscription_Amount+"USD";
        String actualResult = membershipsPage.membershipList.get(0).getText();
        actualResult = actualResult.replaceAll(" ", "");
        expectedResult = expectedResult.replaceAll(" ", "");

        System.out.println("Expected: " + expectedResult);
        System.out.println("Actual: " + actualResult);
        Assert.assertTrue("Verifying that membership is added", expectedResult.equals(actualResult));
    }
}
