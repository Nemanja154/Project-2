package elementsTests;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextBox extends BaseClass {

    @BeforeMethod
    public void setUpPage(){
        driver.navigate().to("https://demoqa.com/");
        js.executeScript("arguments[0].scrollIntoView();",homePageWebElements.getElements());
        homePageWebElements.clickElements();
    }

    @Test
    public void textBoxValidValidData(){
        textBoxPage.clickTextBoxButton();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("adplus-anchor"))));
        js.executeScript("arguments[0].style.visibility='hidden'", driver.findElement(By.id("adplus-anchor")));
        js.executeScript("arguments[0].style.visibility='hidden'", driver.findElement(By.xpath("//*[@id=\"app\"]/footer")));

        textBoxPage.fillTextBox("Nemanja","1234@gmail.com","Miroslava Antica","Cara Lazar");
        js.executeScript("arguments[0].scrollIntoView();",textBoxPage.getSubmitButton());

        textBoxPage.clickSubmit();

    }
}
