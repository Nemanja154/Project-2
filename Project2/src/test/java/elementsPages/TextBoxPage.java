package elementsPages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseClass {
    private WebDriver driver;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "item-0")
    WebElement texBoxButton;

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void clickTextBoxButton(){
        texBoxButton.click();
    }

    public void inputUserName(String uName){
        userName.sendKeys(uName);
    }

    public void inputUserEmail(String email){
        userEmail.sendKeys(email);
    }

    public void inputCurrentAddress(String cAddress){
        currentAddress.sendKeys(cAddress);
    }

    public void inputPermanentAddress(String pAddress){
        permanentAddress.sendKeys(pAddress);
    }

    public void clickSubmit(){
        submitButton.click();
    }

    public void fillTextBox(String uName,String email,String cAddress,String pAddress){
        userName.sendKeys(uName);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(cAddress);
        permanentAddress.sendKeys(pAddress);

    }


}
