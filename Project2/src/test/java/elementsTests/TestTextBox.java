package elementsTests;

import baseClass.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextBox extends BaseClass {

    /**Steps before method
     * 1.Scroll to Elements button
     * 2.Click on Elements button
     * 3.Click on Text Box button
     * 4.Assert is on a Text Box page
     */

    @BeforeMethod
    public void setUpPage() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/");

        scroll(homePageWebElements.getElements());
        homePageWebElements.clickElements();
        Thread.sleep(2000);
        textBoxPage.clickTextBoxButton();
        String expectedUrl = "https://demoqa.com/text-box";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl,"User does not on Text Box page");
        wait.until(ExpectedConditions.visibilityOf(textBoxPage.getAdvertisement()));
        hiddenAdvertisement(textBoxPage.getAdvertisement());
        hiddenAdvertisement(textBoxPage.getFooterAdd());
    }

    /**Verify that when is all data valid user see Text Box with all data
     * 1.Entries data in the field name (Nemanja)
     * 2.Entries data in the field email (1234@gmail.com)
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert user see Text Box with all data
     */

    @Test
    public void validData(){
        textBoxPage.fillTextBox("Nemanja","1234@gmail.com","Miroslava Antica","Cara Lazar");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertEquals(textBoxPage.outputListSize(),4,"List size for all valid data is not expected");

    }

    /**Verify that when leaves the name field blank,and fills the rest with valid data,and click on submit button user see text box with
     email,current address,and permanent address.
     * 1.Leave empty field name
     * 2.Entries data in the field email (1234@gmail.com)
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert user does not see in Text Box field name
     */

    @Test
    public void emptyNameInput(){
        textBoxPage.fillTextBox("","1234@gmail.com","Miroslava Antica","Cara Lazara");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertFalse(textBoxPage.listAttributeId().contains("name"),"User see name in box after submit");
    }

    /**Verify that when leaves the email field blank,and fills the rest with valid data,and click on submit button user see tex box with
     name,current address,and permanent address.
     * 1.Entries data in the field name (Nemanja)
     * 2.Leave empty field email
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert user does not see in Text Box field email
     * */

    @Test
    public void emptyEmailInput(){
        textBoxPage.fillTextBox("Nemanja","","Miroslava Antica","Cara Lazara");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertFalse(textBoxPage.listAttributeId().contains("email"),"User see name in box after submit");
    }

    /**Verify that when leaves the Current Address field blank,and fills the rest with valid data,and click on submit button user see tex box with
     name,email,and permanent address.
     1.Entries data in the field name (Nemanja)
     * 2.Entries data in the field email (1234@gmail.com)
     * 3.Leave empty field Current Address
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert user does not see in Text Box field Current Address
     */

    @Test
    public void emptyCurrentAddressInput(){
        textBoxPage.fillTextBox("Nemanja","1234@gmail.com","","Cara Lazara");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertFalse(textBoxPage.listAttributeId().contains("currentAddress"),"User see name in box after submit");
    }

    /**Verify that when leaves the Permanent Address field blank,and fills the rest with valid data,and click on submit button user see tex box with
     name,email,and current address.
     1.Entries data in the field name (Nemanja)
     * 2.Entries data in the field email (1234@gmail.com)
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Leave empty field Permanent Address
     * 5.Click on Submit button
     * 6.Assert user does not see in Text Box field Permanent Address
     */

    @Test
    public void emptyPermanentAddressInput(){
        textBoxPage.fillTextBox("Nemanja","1234@gmail.com","Miroslava Antica","");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();

        Assert.assertFalse(textBoxPage.listAttributeId().contains("permanentAddress"),"User see name in box after submit");

    }

    /**Verify that when input invalid email address user does not see text box
     1.Entries data in the field name (Nemanja)
     * 2.Entries data in the field email (invalid_email_address)
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert user does not see Text Box
     */

    @Test
    public void textBoxInvalidEmailAddress(){
        textBoxPage.fillTextBox("Nemanja","invalid_email_address","Miroslava Antica","Cara Lazara");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();


        Assert.assertTrue(textBoxPage.outputListSize() == 0,"User see output box");
    }

    /**Verify that when input invalid email address edges around the field are red(#ff0000)
     1.Entries data in the field name (Nemanja)
     * 2.Entries data in the field email (invalid_email_address)
     * 3.Entries data in the field Current Address (Miroslava Antica)
     * 4.Entries data in the field Permanent Address (Cara Lazara)
     * 5.Click on Submit button
     * 6.Assert that edges around the field are red(#ff0000)
     */

    @Test
    public void invalidEmailAddressBorderColor(){
        textBoxPage.fillTextBox("Nemanja","invalid_email_address","Miroslava Antica","Cara Lazara");
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmit();
        String expectedColor = "#ff0000";
        String actualColor = textBoxPage.color();

        Assert.assertEquals(actualColor,expectedColor, "Color of field border is not correct");

    }



}
