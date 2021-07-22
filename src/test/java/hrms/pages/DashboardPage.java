package hrms.pages;
import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement PIMButton;

    @FindBy (id = "menu_pim_viewEmployeeList")
    public WebElement employeeListBtn;

    @FindBy(xpath = "//div[@class = 'menu']/ul/li")
    public List<WebElement> dashTabs;


    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;



    public void clickOnPIM() {
        jsClick(PIMButton);
    }

    public void clickOnEmployeeList() {
        jsClick(employeeListBtn);
    }


    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

}
