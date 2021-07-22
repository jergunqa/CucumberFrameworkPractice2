package hrms.utils;

import hrms.testbase.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class CommonMethods extends PageInitializer {
    /**
     * this method will clear a text box and send text to it
     *
     * @param element
     * @param textToSend
     */
    public static void sendText(WebElement element, String textToSend) {
        waitForElemToBeClickable(element);
        element.clear();
        element.sendKeys(textToSend);
    }

    /**
     * method will return an obj of Explicit wait with set time
     *
     * @return
     */
    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Constants.EXPLICIT_WAIT);
    }

    /**
     * method will wait until given element becomes clickable
     *
     * @param element
     */
    public static void waitForElemToBeClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * method will wait untill given element becomes visible
     *
     * @param element
     */
    public static void waitForElemToBeVisible(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * method will wait till element is clickable for set time an then click
     *
     * @param element
     */
    public static void click(WebElement element) {
        waitForElemToBeClickable(element);
        element.click();
    }

    /**
     * method returns downcast driver to JSExecutor
     *
     * @return
     */
    public static JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }

    /**
     * method click on element passed in parameters with JSExecutor
     *
     * @param element
     */
    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    public static void jsSendText(WebElement element, String text) {
        waitForElemToBeClickable(element);
        element.clear();
        getJSExecutor().executeScript("arguments[0].value='" + text + "';", element);
    }

    /**
     * method will take a screenshot
     *
     * @param fileName
     */
    public static byte[] takeScreenshot(String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File(Constants.SCREENSHOT_FILEPATH + fileName +
                    getTimeStamp("yyyy-MM-dd-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     * returns a current time in string format
     *
     * @param pattern
     * @return
     */
    public static String getTimeStamp(String pattern) {
        Date date = new Date();
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * this method will click on a radio button by the given list of elements and the value
     *
     * @param radioOrCheckBoxes
     * @param value
     */
    public static void clickRadioOnCheckbox(List<WebElement> radioOrCheckBoxes, String value) {
        for (WebElement element : radioOrCheckBoxes) {
            String actualValue = element.getAttribute("value").trim();
            if (element.isEnabled() && actualValue.equals(value)) {
                jsClick(element);
                break;
            }
        }
    }

    /**
     * this method will select a value from dropDown by the given index
     *
     * @param dd
     * @param index
     */
    public static void selectDDValue(WebElement dd, int index) {
        try {
            waitForElemToBeClickable(dd);
            Select select = new Select(dd);
            List<WebElement> listOfOptions = select.getOptions();
            int ddSize = listOfOptions.size();
            if (index > 0 && index < ddSize)
                select.selectByIndex(index);
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method will select a value from a given dropDown by the given visible text
     *
     * @param dd
     * @param visibleText
     */
    public static void selectDDValue(WebElement dd, String visibleText) {
        try {
            waitForElemToBeClickable(dd);
            Select select = new Select(dd);
            List<WebElement> listOfOptions = select.getOptions();
            for (WebElement option : listOfOptions) {
                if (option.getText().trim().equals(visibleText)) {
                    select.selectByVisibleText(visibleText);
                    break;
                }
            }
        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method will switch to a frame by the given index
     *
     * @param frameIndex
     */
    public static void switchToFrame(int frameIndex) {
        try {
            driver.switchTo().frame(frameIndex);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method will switch to a frame by the given name or id
     *
     * @param nameOrId
     */
    public static void switchToFrame(String nameOrId) {
        try {
            driver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method will switch to child window
     */
    public static void switchToChildWindow() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowID : allWindows) {
            if (!(windowID.equals(mainWindow))) {
                driver.switchTo().window(windowID);
                break;
            }
        }
    }

    /**
     * Method will return List<String> containing text from all fields found by xpath for verification purposes (used with Datatable)
     */
    public static List<String> getFields(String xpath) {
        List<WebElement> fields = driver.findElements(By.xpath(xpath));
        List<String> fieldText = new ArrayList<>();
        for (WebElement field : fields) {
            fieldText.add(field.getText());
        }
        return fieldText;
    }

    /**
     * Method will select the date from the very specific calendar in qualifications page and memberships page
     * @param String in format "yyyy-mm-dd"
     */
    public static void selectDateFromCalendar(WebElement calendar, WebElement yearDD, WebElement monthDD, List<WebElement> calendarCell, String yyyy_mm_dd) {
        jsClick(calendar);
        String[] date = yyyy_mm_dd.split("-");
        selectDDValue(yearDD, date[0]);
        String month = "";
        switch (date[1]) {
            case "01":
                month = "Jan";
                break;
            case "02":
                month = "Feb";
                break;
            case "03":
                month = "Mar";
                break;
            case "04":
                month = "Apr";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "Jun";
                break;
            case "07":
                month = "Jul";
                break;
            case "08":
                month = "Aug";
                break;
            case "09":
                month = "Sep";
                break;
            case "10":
                month = "Oct";
                break;
            case "11":
                month = "Nov";
                break;
            case "12":
                month = "Dec";
                break;
        }
        selectDDValue(monthDD, month);
        for (WebElement day : calendarCell) {
            if (day.getText().equals(date[2])) {
                day.click();
                break;
            }
        }
    }

    /**
     * Method will scroll until specified element is visible
     */
    public static void scrollIntoView (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }
}
