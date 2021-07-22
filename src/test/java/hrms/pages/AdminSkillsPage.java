package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminSkillsPage extends CommonMethods {

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "skill_name")
    public WebElement skillNameTBox;

    @FindBy(id = "skill_description")
    public WebElement skillDescriptionTBox;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(xpath = "//table//tbody/tr/td[2]")
    public List<WebElement> listOfSkillNames;

    @FindBy(xpath = "//table//tbody/tr/td[3]")
    public List<WebElement> listOfSkillDescriptions;

    @FindBy(xpath = "//table//thead/tr/th/input")
    public WebElement selectAllCheckbox;

    @FindBy(id = "btnDel")
    public WebElement deleteButton;


    public AdminSkillsPage(){
        PageFactory.initElements(driver,this);
    }
}
