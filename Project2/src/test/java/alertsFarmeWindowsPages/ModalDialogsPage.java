package alertsFarmeWindowsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {
    WebDriver driver;

    public ModalDialogsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
