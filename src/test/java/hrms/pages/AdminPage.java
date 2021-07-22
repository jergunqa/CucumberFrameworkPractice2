package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends CommonMethods {

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationButtonDD;

    @FindBy(id = "menu_admin_viewSkills")
    public WebElement skillsButton;


    @FindBy(id = "menu_admin_membership")
    public WebElement membershipButton;



    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
}
