package hrms.pages;
import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DependentsPage extends CommonMethods {
    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;
    @FindBy(id = "searchBtn")
    public WebElement searchBtn;
    @FindBy(xpath ="//*[@id=\"sidenav\"]/li[4]/a" )
    public WebElement dependentsBtn;
    @FindBy(id = "dependent_name")
    public WebElement nameField;
    @FindBy(id = "dependent_relationshipType")
    public WebElement relationshipField;
    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dateOfBirthField;
    @FindBy(id = "btnSaveDependent")
    public WebElement saveBtn;


    public DependentsPage(){
        PageFactory.initElements(driver, this);
    }
}
