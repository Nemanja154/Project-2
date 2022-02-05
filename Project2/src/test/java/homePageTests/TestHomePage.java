package homePageTests;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends BaseClass {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://demoqa.com/");
    }

    /**Test click on Elements button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Elements button
     * 3.Click on Elements button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void elementsButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getElements());
        homePageWebElements.clickElements();
        String expectedUrl = "https://demoqa.com/elements";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }

    /**Test click on Forms button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Forms button
     * 3.Click on Form button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void formsButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getForms());
        homePageWebElements.clickForms();
        String expectedUrl = "https://demoqa.com/forms";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }

    /**Test click on Alerts,Frame&Windows button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Alerts,Frame&Windows button
     * 3.Click on Elements button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void alertsFrameWindowsButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getAlertsFarmWindows());
        homePageWebElements.clickAlertsFarmWindows();
        String expectedUrl = "https://demoqa.com/alertsWindows";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }

    /**Test click on Widgets button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Widgets button
     * 3.Click on Elements button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void widgetsButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getWidgets());
        homePageWebElements.clickWidgets();
        String expectedUrl = "https://demoqa.com/widgets";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }

    /**Test click on Interactions button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Interactions button
     * 3.Click on Elements button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void interactionsButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getInteractions());
        homePageWebElements.clickInteractions();
        String expectedUrl = "https://demoqa.com/interaction";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }

    /**Test click on Book Store Application button
     * 1.Go on Website url = https://demoqa.com/
     * 2.Scroll to element Book Store Application button
     * 3.Click on Elements button
     * 4.Asser is actual url equals expected url
     */

    @Test
    public void bookStoreApplicationButton(){
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getBookStoreApplication());
        homePageWebElements.clickBookStoreApplication();
        String expectedUrl = "https://demoqa.com/books";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"The user is not on the elements page");
    }
}
