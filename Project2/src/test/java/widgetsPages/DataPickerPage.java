package widgetsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DataPickerPage {
    WebDriver driver;

    public DataPickerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}