package hrms.pages;

import hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class QualificationsPage extends CommonMethods {

    //skills section

    @FindBy(id = "addSkill")
    public WebElement addSkillBtn;

    @FindBy(xpath = "//label [@for = 'skill_code']")
    public WebElement skillsDDLabel;

    @FindBy(id = "skill_code")
    public WebElement skillsDropdown;

    @FindBy(xpath = "//label [@for = 'skill_years_of_exp']")
    public WebElement yearsOfExperienceLabel;

    @FindBy(id = "skill_years_of_exp")
    public WebElement yearsOfExperienceField;

    @FindBy(xpath = "//label [@for = 'skill_comments']")
    public WebElement skillCommentsLabel;

    @FindBy(id = "skill_comments")
    public WebElement skillCommentsField;

    @FindBy(id = "btnSkillSave")
    public WebElement skillSaveBtn;

    //use this table for verifying that the skill was added
    @FindBy(xpath = "//form [@id = 'frmDelSkill']/table/tbody")
    public WebElement skillsTable;


    //licenses section

    @FindBy(id = "menu_admin_viewLicenses")
    public WebElement licensesButton;

    @FindBy(id = "checkAll")
    public WebElement licenseCheckAllBox;

    @FindBy(id = "btnDel")
    public WebElement licenseDeleteButton;

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;

    @FindBy(id = "btnAdd")
    public WebElement addLicenceButton;

    @FindBy(id = "addLicense")
    public WebElement addLicenceBtn;

    @FindBy(id = "license_name")
    public WebElement licenseName;

    @FindBy(id = "btnSave")
    public WebElement licenseSaveBtn;

    @FindBy(xpath = "//table[@id = 'recordsListTable']/tbody/tr")
    public List<WebElement> listOfLicenses;

    @FindBy(xpath = "//label [@for = 'license_code']")
    public WebElement licenseTypeLabel;

    @FindBy(id = "license_code")
    public WebElement licenseTypeDropdown;

    @FindBy(xpath = "//label [@for = 'license_license_no']")
    public WebElement licenseNumberLabel;

    @FindBy(id = "license_license_no")
    public WebElement licenseNumberField;

    @FindBy(xpath = "//label [@for = 'license_date']")
    public WebElement issueDateLabel;

    @FindBy(id = "license_date")
    public WebElement issueDateField;

    @FindBy(id = "license_renewal_date")
    public WebElement expiryDateField;

    @FindBy(xpath = "//select[@class = 'ui-datepicker-month']")
    public WebElement monthDropdown;

    @FindBy(xpath = "//select[@class = 'ui-datepicker-year']")
    public WebElement yearDropdown;

    //all elements (cells) from calendar
    @FindBy(xpath = "//table [@class = 'ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> calendarCell;


    // languages section
    @FindBy(id = "btnAdd")
    public WebElement addLanguageButton;

    @FindBy(id = "addLanguage")
    public WebElement addLanguageBtn;

    @FindBy(id = "checkAll")
    public WebElement languageCheckAllButton;

    @FindBy(id = "btnDel")
    public WebElement languageDeleteButton;

    @FindBy(xpath = "//label [@for = 'language_code']")
    public WebElement languageLabel;

    @FindBy(id = "language_code")
    public WebElement languageDropdown;

    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languageButton;

    @FindBy(id = "language_name")
    public WebElement languageName;

    @FindBy(id = "btnSave")
    public WebElement languageSaveButton;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> languageTable;

    @FindBy(xpath = "//label [@for = 'language_lang_type']")
    public WebElement fluencyLabel;

    @FindBy(id = "language_lang_type")
    public WebElement fluencyDropdown;

    @FindBy(xpath = "//label [@for = 'language_competency']")
    public WebElement competencyLabel;

    @FindBy(id = "language_competency")
    public WebElement competencyDropdown;

    @FindBy(xpath = "//label [@for = 'language_comments']")
    public WebElement commentLabel;

    @FindBy(id = "skill_comments")
    public WebElement commentsField;


    public QualificationsPage(){
        PageFactory.initElements(driver, this);
    }
}
