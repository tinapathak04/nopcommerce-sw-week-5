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
public class ComputersTest extends BaseTest {

    Computers computer;
    Electronics electronics;
    ShoppingCartPage cart;

    @BeforeMethod(alwaysRun = true)
    public  void init(){

        computer = new Computers();
        electronics = new Electronics();
       cart = new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        //1.1 Click on Computer Menu.
        computer.clickOnComputerMenu();
        computer.hoverOnDesktop();
        //1.2 Click on Desktop
        computer.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A"
        computer.selectNameZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        String expectedText = "Name: Z to A";
        String actualText =computer.descendingOrder();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully(){
        //2.1 Click on Computer Menu.
        computer.clickOnComputer();
        //2.2 Click on Desktop
        computer.clickOnDesktop();
//        computer.hoverOnDesktop();
//        computer.clickOnDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        computer.selectNameAtoZ();
        //2.4 Click on "Add To Cart"
        computer.addOnCart();
         //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText =computer.verifyByText();
        Assert.assertEquals(actualText,expectedText,"Message not displayed");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computer.selectOnGHzDualE2200();
        //2.7.Select "8GB [+$60.00]" using Select class.
        computer.selectOn8GB();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        computer.clickOnRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computer.OsRadioVistaPremium();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        computer.tickOnMicrosoft();
        computer.tickOnTotalCommander();
        //2.11 Verify the price "$1,475.00"
        String expectedText1 = "$1,425.00";
        String actualText1 =computer.verifyThePrice();
        Assert.assertEquals(actualText1,expectedText1,"Message not displayed");
        //2.12 Click on "ADD TO CARD" Button.
        cart.clickAddOnCard();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText0 = "The product has been added to your shopping cart";
        String actualText0 =cart.VerifyShoppingCart();
        Assert.assertEquals(actualText0,expectedText0,"Message not displayed");
        //2.12 Click on "ADD TO CARD" Button.
        electronics.clickOnGoToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText10 = "Shopping cart";
        String actualText10 =electronics.byShoppingCart();
        Assert.assertEquals(actualText10,expectedText10,"Message not displayed");
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronics.clickOnGoToCart();
        //2.15 Verify the message "Shopping cart"
        String expectedMassage = "Shopping cart";
        String actualMassage =electronics.byShoppingCart();
        Assert.assertEquals(actualMassage,expectedMassage,"Message not displayed");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        electronics.clear();
        electronics.changeQuantity();
        //Click on "Update shopping cart"
       cart.clickOnElement();
        //2.17 Verify the Total"$2,950.00"
        String expectedText9 = "$2,950.00";
        String actualText9 =cart.verifyByTotal();
        Assert.assertEquals(actualText9,expectedText9,"Message not displayed");

        //2.18 click on checkbox “I agree with the terms of service”
        cart.tickOnCheckBox();
        //2.19 Click on “CHECKOUT”
        cart.clickOnCheckout();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText2 = "Welcome, Please Sign In!";
        String actualText2 =cart.verifyByWelcome();
        Assert.assertEquals(actualText2,expectedText2,"Message not displayed");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        cart.clickOnCheckoutGuest();
        //2.22 Fill the all mandatory field
        cart.enterName();
        cart.enterSurname();
        cart.enterEmail();
        cart.enterCountry();
        cart.enterState();
        cart.enterCity();
        cart.enterAddress();
        cart.enterPostCode();
        cart.enterPhoneNumber();
        //2.23 Click on “CONTINUE”
        cart.withContinue();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        cart.ButtonNextDayAir();
        //2.25 Click on “CONTINUE”
        cart.clickingContinue();
        //2.26 Select Radio Button “Credit Card”
        cart.clickCreditCard();
        //2.27 Select “Master card” From Select credit card dropdown
        cart.selectMasterCard();
        //2.28 Fill all the details
        cart.enterCardHolderName();
        cart.enterCardNumber();
        cart.enterExpireMonth();
        cart.enterExpireYear();
        cart.enterCardCode();
        //2.29 Click on “CONTINUE”
        cart.enteringContinue();
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedText3 = "Payment Method: Credit Card";
        String actualText3 =cart.byPaymentMethod();
        Assert.assertEquals(actualText3,expectedText3,"Message not displayed");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedText4 = "Shipping Method: Next Day Air";
        String actualText4 =cart.byShippingMethod();
        Assert.assertEquals(actualText4,expectedText4,"Message not displayed");
        //2.33 Verify Total is “$2,950.00”
        String expectedText5 = "$2,950.00";
        String actualText5 =cart.byTotal();
        Assert.assertEquals(actualText5,expectedText5,"Message not displayed");
        //2.34 Click on “CONFIRM”
        cart.clickOnConfirm();
        //2.35 Verify the Text “Thank You”
        String expectedText6 = "Thank you";
        String actualText6 =cart.byThankYou();
        Assert.assertEquals(actualText6,expectedText6,"Message not displayed");
        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedText7 = "Your order has been successfully processed!";
        String actualText7 =cart.byProcessed();
        Assert.assertEquals(actualText7,expectedText7,"Message not displayed");
        //2.37 Click on “CONTINUE”
        cart.onContinue();
        //2.37 Verify the text “Welcome to our store”
        String expectedText8 = "Welcome to our store";
        String actualText8 =cart.byWelcomeStore();
        Assert.assertEquals(actualText8,expectedText8,"Message not displayed");

    }

}
