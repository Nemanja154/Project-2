package alertsFarmeWindowsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPage {
    WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
