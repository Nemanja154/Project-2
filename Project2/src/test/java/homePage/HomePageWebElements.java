package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWebElements {
    WebDriver driver;

    public HomePageWebElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    WebElement elements;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    WebElement forms;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]")
    WebElement alertsFarmWindows;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]")
    WebElement widgets;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[5]")
    WebElement interactions;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement bookStoreApplication;

    //--------------------------------------------------------------
    //Getters

    public WebElement getElements() {
        return elements;
    }

    public WebElement getForms() {
        return forms;
    }

    public WebElement getAlertsFarmWindows() {
        return alertsFarmWindows;
    }

    public WebElement getWidgets() {
        return widgets;
    }

    public WebElement getInteractions() {
        return interactions;
    }

    public WebElement getBookStoreApplication() {
        return bookStoreApplication;
    }


    //----------------------------------------------------
    //Methods


    public void clickElements(){
        elements.click();
    }

    public void clickForms(){
        forms.click();
    }

    public void clickAlertsFarmWindows(){
        alertsFarmWindows.click();
    }

    public void clickWidgets(){
        widgets.click();
    }

    public void clickInteractions(){
        interactions.click();
    }

    public void clickBookStoreApplication(){
        bookStoreApplication.click();
    }


    //--------------------------------------------------------------------------
    // Elements on the second home page


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]")
    WebElement elements1;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]")
    WebElement forms1;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]")
    WebElement alertsFarmWindows1;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]")
    WebElement widgets1;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]")
    WebElement interactions1;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]")
    WebElement bookStoreApplication1;

    //------------------------------------------------------------------
    //Getters1



    public WebElement getElements1() {
        return elements1;
    }

    public WebElement getForms1() {
        return forms1;
    }

    public WebElement getAlertsFarmWindows1() {
        return alertsFarmWindows1;
    }

    public WebElement getWidgets1() {
        return widgets1;
    }

    public WebElement getInteractions1() {
        return interactions1;
    }

    public WebElement getBookStoreApplication1() {
        return bookStoreApplication1;
    }

    //---------------------------------------------------------------
    //Methods1

    public void clickElements1(){
        elements1.click();
    }

    public void clickForms1(){
        forms1.click();
    }

    public void clickAlertsFarmWindows1(){
        alertsFarmWindows1.click();
    }

    public void clickWidgets1(){
        widgets1.click();
    }

    public void clickInteractions1(){
        interactions1.click();
    }

    public void clickBookStoreApplication1(){
        bookStoreApplication1.click();
    }

}
