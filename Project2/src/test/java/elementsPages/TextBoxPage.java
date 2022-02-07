package elementsPages;

import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(className = "main-header")
    WebElement headerTitle;

    @FindBy(className = "mb-1")
    List<WebElement> outputList;


    //Advertisement --------------------------------------------------------

    @FindBy(id = "adplus-anchor")
    WebElement advertisement;

    @FindBy(xpath = "//*[@id=\"app\"]/footer")
    WebElement footerAdd;

    public WebElement getFooterAdd() {
        return footerAdd;
    }

    public WebElement getAdvertisement() {
        return advertisement;
    }

    //------------------------------------------------------------------------

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

    public String getHeaderTitleText(){
       return headerTitle.getText();
    }

    public void fillTextBox(String uName,String email,String cAddress,String pAddress){
        userName.sendKeys(uName);
        userEmail.sendKeys(email);
        currentAddress.sendKeys(cAddress);
        permanentAddress.sendKeys(pAddress);

    }

    public int outputListSize(){
        return outputList.size();
    }

    public List<String> listAttributeId(){
        List<String> listAttribute = new ArrayList<>();
        for(int i = 0; i < outputList.size()-1;i++){
           listAttribute.add(outputList.get(i).getAttribute("id"));
        }
        return listAttribute;
    }

    public String color(){
//       return userEmail.getCssValue("border-color");
        String button = userEmail.getCssValue("border-color");
        String hex = Color.fromString(button).asHex();
        return hex;
    }


}
