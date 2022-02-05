package widgetsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AutoCompletePage {
    WebDriver driver;

    public AutoCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
