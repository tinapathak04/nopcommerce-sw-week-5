package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

    Electronics electronics;
    Computers computers;
    ShoppingCartPage cart;

    @BeforeMethod(alwaysRun = true)
    public void init(){

        electronics = new Electronics();
        computers = new Computers();
        cart = new ShoppingCartPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        //1.1 Mouse Hover on “Electronics” Tab
        electronics.hoverOnElectronics();
        electronics.clickOnElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        electronics.hoverToCellphones();
        electronics.clickOnCellphones();
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText =electronics.verifyByCellphones();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        //2.1 Mouse Hover on “Electronics” Tab
        electronics.hoverOnElectronics();
        electronics.clickOnElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        electronics.hoverToCellphones();
        electronics.clickOnCellphones();
        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText =electronics.verifyByCellphones();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
        //2.4 Click on List View Tab
        electronics.clickOnListView();
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronics.clickOnNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedText1 = "Nokia Lumia 1020";
        String actualText1 =electronics.verifyByNokiaLumia();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");
        //2.7 Verify the price “$349.00”
        String expectedText2 = "$349.00";
        String actualText2 =electronics.by$349();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");
        //2.8 Change quantity to 2
        electronics.clear();
        electronics.changeQuantity();
        //2.9 Click on “ADD TO CART” tab
        electronics.addToCart();
        electronics.hoverToShoppingCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText0 = "The product has been added to your shopping cart";
        String actualText0 =cart.VerifyShoppingCart();
        Assert.assertEquals(actualText0,expectedText0,"Message not displayed");
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronics.clickOnGoToCart();
        //2.12 Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 =electronics.byShoppingCart();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");
        //2.13 Verify the quantity is 2
        String expectedText4 = "2";
        String actualText4 =electronics.by2();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");
        //2.14 Verify the Total $698.00
        String expectedText5 = "$698.00";
        String actualText5 =electronics.byTotal();
        Assert.assertEquals(actualText5,expectedText5,"Message not displayed");
        //2.15 click on checkbox “I agree with the terms of service”
        electronics.clickOnCheckBox();
        //2.16 Click on “CHECKOUT”
        cart.clickOnCheckout();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText6 = "Welcome, Please Sign In!";
        String actualText6 =electronics.byWelcomeText();
        Assert.assertEquals(actualText6,expectedText6,"Message not displayed");
         //2.18 Click on “REGISTER” tab
        electronics.clickOnRegister();
        //2.19 Verify the text “Register”
        String expectedText7 = "Register";
        String actualText7 =electronics.byRegister();
        Assert.assertEquals(actualText7,expectedText7,"Message not displayed");
        //2.20 Fill the mandatory fields
        electronics.clickOnGender();
        //2.20 Fill the mandatory fields
        cart.enterName();
        cart.enterSurname();
        cart.enterEmail();
        electronics.enterPassword();
        electronics.enterConfirmPassword();
        //2.21 Click on “REGISTER” Button
        electronics.clickOnRegister();

        //2.22 Verify the message “Your registration completed”
        String expectedText8 = "Your registration completed";
        String actualText8 =electronics.byRegistrationCompleted();
        Assert.assertEquals(actualText8,expectedText8,"Message not displayed");
        //2.23 Click on “CONTINUE” tab
        cart.clickingContinue();
        //2.24 Verify the text “Shopping card”
        String expectedText9 = "Shopping cart";
        String actualText9 =electronics.byshoppingCart();
        Assert.assertEquals(actualText9,expectedText9,"Message not displayed");
    }



}
