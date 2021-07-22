package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PersonalDetailsPage extends CommonMethods {

    @FindBy(xpath = "//h1[text() = 'Personal Details']")
    public WebElement personalDetail;

    @FindBy (id = "personal_txtEmployeeId")
    public WebElement employeeIDtxt;

    @FindBy (id = "personal_txtEmpFirstName")
    public WebElement firstNameText;

    @FindBy (id = "personal_txtEmpMiddleName")
    public WebElement middleNameText;

    @FindBy (id = "personal_txtEmpLastName")
    public WebElement lastNameText;

    @FindBy(xpath = "//div[@id = 'profile-pic']//following-sibling::h1")
    public static WebElement userProfileName;

    @FindBy(xpath = "//ul [@id = 'sidenav']/li/a [text() = 'Qualifications']")
    public WebElement qualificationsBtn;

    @FindBy(xpath = "//ul [@id = 'sidenav']/li/a [text() = 'Memberships']")
    public WebElement membershipsBtn;


    @FindBy(xpath = "//ul [@id = 'sidenav']/li/a [text() = 'Emergency Contacts']")
    public WebElement emergencyContactsBtn;




    public PersonalDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}
