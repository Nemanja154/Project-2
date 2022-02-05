package alertsFarmeWindowsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
