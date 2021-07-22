package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactDetailsPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;
    @FindBy(id = "searchBtn")
    public WebElement searchBtn;
    // @FindBy(linkText ="Contact Details")
    @FindBy(xpath = "(//ul[@id='sidenav']/li)[2]/a")
    public WebElement contactDetailsBtn;
    @FindBy(id = "btnSave")
    public WebElement editBtn;
    @FindBy(id = "contact_street1")
    public WebElement addressStreet1Field;
    @FindBy(id = "contact_street2")
    public WebElement addressStreet2Field;
    @FindBy(id = "contact_city")
    public WebElement cityField;
    @FindBy(id = "contact_province")
    public WebElement stateField;
    @FindBy(id = "contact_state")
    public WebElement stateFieldDD;

    @FindBy(id = "contact_emp_zipcode")
    public WebElement zipCodeField;

    @FindBy(id = "contact_country")
    public WebElement countryField;
    @FindBy(id = "contact_emp_hm_telephone")
    public WebElement homeTelephoneField;
    @FindBy(id = "contact_emp_mobile")
    public WebElement mobileField;
    @FindBy(id = "contact_emp_work_telephone")
    public WebElement workTelephoneField;
    @FindBy(id = "contact_emp_work_email")
    public WebElement workEmailField;
    @FindBy(id = "contact_emp_oth_email")
    public WebElement otherEmailField;
    @FindBy(id = "btnSave")
    public WebElement saveBtn;
    @FindBy(xpath = "//select[@id='contact_country']//option[@selected='selected']")
    public WebElement countrySelected;


    public ContactDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}

