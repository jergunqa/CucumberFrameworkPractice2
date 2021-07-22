package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MembershipsPage extends CommonMethods {

    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addMembershipBtn;

    @FindBy(xpath = "//label [@for = 'membership_membership']")
    public WebElement membershipLabel;

    @FindBy(id = "membership_membership")
    public WebElement membershipDropdown;

    @FindBy(xpath = "//label [@for = 'membership_subscriptionPaidBy']")
    public WebElement membershipPaidByLabel;

    @FindBy(id = "membership_subscriptionPaidBy")
    public WebElement membershipPaidByDropdown;

    @FindBy(xpath = "membership_subscriptionAmount")
    public WebElement subscriptionAmountLabel;

    @FindBy(id = "membership_subscriptionAmount")
    public WebElement subscriptionAmountField;

    @FindBy(xpath = "//label [@for = 'membership_currency']")
    public WebElement currencyLabel;

    @FindBy(id = "membership_currency")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//label [@for = 'membership_currency']")
    public WebElement subscribtionCommenceDateLabel;

    //this field opens calendar
    @FindBy(id = "membership_subscriptionCommenceDate")
    public WebElement subscribtionCommenceDateField;

    @FindBy(xpath = "//label [@for = 'membership_subscriptionRenewalDate']")
    public WebElement subscribtionRenewalDateLabel;

    //this field opens calendar
    @FindBy(id = "membership_subscriptionRenewalDate")
    public WebElement subscribtionRenewalDateField;

    @FindBy(className = "ui-datepicker-month")
    public WebElement selectMonth;

    @FindBy(className = "ui-datepicker-year")
    public WebElement selectYear;

    @FindBy(xpath = "//table [@class = 'ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> calendarCells;

    @FindBy(id = "btnSaveMembership")
    public WebElement saveMembershipBtn;

    //use this table for verification
    @FindBy(xpath = "//form [@id = 'frmEmpDelMemberships']/table/tbody/tr")
    public List<WebElement> membershipList;


    public MembershipsPage(){
        PageFactory.initElements(driver, this);
    }

}
