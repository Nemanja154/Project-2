package elementsTests;

import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheckBox extends BaseClass {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://demoqa.com/elements");
        checkBoxPage.clickCheckBoxButton();
    }

    @Test
    public void messageWhenClickOnHomeCheckBox(){
        jsClick(checkBoxPage.getHomeCheckBox());

        String expected = "home" +"desktop" + "notes" + "commands" + "documents" + "workspace" + "react" + "angular" +
                "veu" + "office" + "public" + "private" + "classified" + "general" + "downloads" + "wordFile" + "excelFile";
        System.out.println(checkBoxPage.messageText());
        Assert.assertEquals(expected,checkBoxPage.messageText());
    }

    @Test
    public void messageWhenClickOnDesktopCheckButton(){
        checkBoxPage.clickExpandHomeButton();
        jsClick(checkBoxPage.getDesktopCheckBox());

        String expected = "desktop" + "notes" + "commands";

        Assert.assertEquals(expected,checkBoxPage.messageText());


    }
}
