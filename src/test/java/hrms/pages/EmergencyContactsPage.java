package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmergencyContactsPage extends CommonMethods{

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;
    @FindBy(id = "searchBtn")
    public WebElement searchBtn;
    @FindBy(xpath ="//*[@id=\"sidenav\"]/li[3]/a" )
    public WebElement emergencyContactsBtn;
    @FindBy(id = "btnAddContact")
    public WebElement addEmergencyContactBtn;
    @FindBy(id = "emgcontacts_name")
    public WebElement nameField;
    @FindBy(id = "emgcontacts_relationship")
    public WebElement relationshipField;
    @FindBy(id = "emgcontacts_homePhone")
    public WebElement homeTelephoneField;
    @FindBy(id = "emgcontacts_mobilePhone")
    public WebElement mobileField;
    @FindBy(id = "emgcontacts_workPhone")
    public WebElement workTelephoneField;

    public void enterAllAddEmergencyContactFields(String name, String relationship, String homePhone, String mobilePhone, String workPhone){
        sendText(nameField,name);
        sendText(relationshipField,relationship);
        sendText(homeTelephoneField,homePhone);
        sendText(mobileField,mobilePhone);
        sendText(workTelephoneField,workPhone);
    }

    @FindBy(id = "btnSaveEContact")
    public WebElement saveEmergencyContactBtn;


    public EmergencyContactsPage(){
        PageFactory.initElements(driver, this);
    }


}
