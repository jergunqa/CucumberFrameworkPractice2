package hrms.pages;
import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminMembershipsPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "membership_name")
    public WebElement membershipNameTBox;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table//tbody/tr/td[2]")
    public List<WebElement> listOfMemberships;

    @FindBy(xpath = "//table//thead/tr/th/input")
    public WebElement selectAllCheckbox;

    @FindBy(id = "btnDelete")
    public WebElement deleteButton;

    @FindBy(id = "dialogDeleteBtn")
    public WebElement deletionAlertOkButton;

    public AdminMembershipsPage(){
        PageFactory.initElements(driver,this);
    }
}
