package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;
    @FindBy(id = "searchBtn")
    public WebElement searchBtn;
    @FindBy(xpath = "//table/tbody/tr/td/a")
    public List<WebElement> employeeList;

    public EmployeeListPage(){
        PageFactory.initElements(driver, this);
    }
}
