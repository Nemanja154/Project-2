package elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "item-1")
    WebElement checkBoxButton;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
    WebElement expandAllButton;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    WebElement expandHomeButton;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[2]")
    WebElement collapseAllButton;

    @FindBy(id = "tree-node-home")
    WebElement homeCheckBox;

    @FindBy(id = "tree-node-desktop")
    WebElement desktopCheckBox;

    @FindBy(id = "tree-node-documents")
    WebElement documentsCheckBox;

    @FindBy(id = "tree-node-downloads")
    WebElement downloadsCheckBox;

    @FindBy(className = "text-success")
    List<WebElement> message;

    public WebElement getHomeCheckBox(){
        return homeCheckBox;
    }

    public WebElement getDesktopCheckBox() {
        return desktopCheckBox;
    }

    public WebElement getDocumentsCheckBox() {
        return documentsCheckBox;
    }

    public WebElement getDownloadsCheckBox() {
        return downloadsCheckBox;
    }

    public void clickCheckBoxButton(){
        checkBoxButton.click();
    }

    public void clickExpandHomeButton(){
        expandHomeButton.click();
    }

    public String messageText(){
        StringBuilder message1 = new StringBuilder();
        for(WebElement m : message){
            message1.append(m.getText());
        }
        return message1.toString();
    }



}
