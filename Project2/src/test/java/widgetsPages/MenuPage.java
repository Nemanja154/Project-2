package widgetsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
