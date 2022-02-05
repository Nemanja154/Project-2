package elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicProperties {
    WebDriver driver;

    public DynamicProperties(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
