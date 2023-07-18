package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility{

    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']" )
    WebElement addCard;

    @CacheLookup
    @FindBy(xpath ="//p[@class='content']" )
    WebElement verifyProductShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//span[@class='close']" )
    WebElement clickElement;

    @CacheLookup
    @FindBy(xpath ="//span[text()='$2,950.00']" )
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath ="//input[@id='termsofservice']" )
    WebElement clickCheckBox;

    @CacheLookup
    @FindBy(xpath ="//button[@id='checkout']" )
    WebElement clickCheckout;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement verifyWelcome;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]" )
    WebElement clickCheckoutGuest;

    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_FirstName']" )
    WebElement name;

    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_LastName']" )
    WebElement surname;

    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_Email']" )
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath ="//select[@id='BillingNewAddress_StateProvinceId']" )
    WebElement state;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_City']" )
    WebElement city;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_Address1']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath ="//input[@id='BillingNewAddress_PhoneNumber']" )
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath ="//div[@id='billing-buttons-container']//button[text()='Continue']" )
    WebElement clickContinue;
    @CacheLookup
    @FindBy(xpath ="//input[@id='shippingoption_1']")
    WebElement clickNextDayAir;
    @CacheLookup
    @FindBy(xpath ="//div[@id='shipping-method-buttons-container']//button[text()='Continue']" )
    WebElement pressContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement selectRadioButton;
    @CacheLookup
    @FindBy(xpath ="//option[contains(text(),'Master card')]" )
    WebElement selectMasterCard;
    @CacheLookup
    @FindBy(xpath ="//input[@id='CardholderName']" )
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='CardNumber']" )
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath ="//select[@id='ExpireMonth']" )
    WebElement expireMonth;
    @CacheLookup
    @FindBy(xpath ="//select[@id='ExpireYear']" )
    WebElement expireYear;
    @CacheLookup
    @FindBy(xpath ="//input[@id='CardCode']" )
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath ="//div[@id='payment-info-buttons-container']//button[text()='Continue']" )
    WebElement enterContinue;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Payment Method:')]")
    WebElement verifyPaymentMethod;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Shipping Method:')]" )
    WebElement verifyShippingMethod;
    @CacheLookup
    @FindBy(xpath ="//td[@class='subtotal']//span[text()='$2,950.00']" )
    WebElement textTotal;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Confirm')]" )
    WebElement confirm;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Thank you')]" )
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath ="//strong[contains(text(),'Your order has been successfully processed!')]" )
    WebElement verifyProcessed;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickContinueText;
    @CacheLookup
    @FindBy(xpath ="//h2[contains(text(),'Welcome to our store')]" )
    WebElement welcomeToStore;

    public void clickAddOnCard(){
        clickOnElement(addCard);
    }
    public String VerifyShoppingCart(){

        return getTextFromElement(verifyProductShoppingCart);
    }
    public void clickOnElement(){
        clickOnElement(clickElement);
    }
    public String verifyByTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void tickOnCheckBox(){
        clickOnElement(clickCheckBox);
    }
    public void clickOnCheckout(){
        clickOnElement(clickCheckout);
    }
    public String verifyByWelcome(){
        return getTextFromElement(verifyWelcome);
    }
    public void clickOnCheckoutGuest(){
        clickOnElement(clickCheckoutGuest);
    }
    public void enterName(){
        sendTextToElement(name,"Tina");
    }
    public void enterSurname(){
        sendTextToElement(surname,"Pathak");
    }
    public void enterEmail(){
        sendTextToElement(email,"tinaPathak@yahoo.com");
    }
    public void enterCountry(){
        sendTextToElement(country,"United States");
    }
    public void enterState (){
        sendTextToElement(state,"New York");
    }
    public void enterCity(){
        sendTextToElement(city,"New York");
    }
    public void enterAddress(){
        sendTextToElement(address,"47 W 13th St, New York");
    }
    public void enterPostCode(){
        sendTextToElement(postCode,"NY 10011");
    }
    public void enterPhoneNumber(){
        sendTextToElement(phoneNumber,"2770000");
    }
    public void withContinue(){
        clickOnElement(clickContinue);
    }
    public void ButtonNextDayAir(){
        clickOnElement(clickNextDayAir);
    }
    public void clickingContinue(){
        clickOnElement(pressContinue);
    }
    public void clickCreditCard(){
        clickOnElement(selectRadioButton);
    }
    public void selectMasterCard(){
        selectByValueFromDropDown(selectMasterCard,"MasterCard");
    }
    public void enterCardHolderName(){
        sendTextToElement(cardHolderName,"T Pathak");
    }
    public void enterCardNumber(){
        sendTextToElement(cardNumber,"5425233430109903");
    }
    public void enterExpireMonth(){
        sendTextToElement(expireMonth,"12");
    }
    public void enterExpireYear(){
        sendTextToElement(expireYear,"2026");
    }
    public void enterCardCode(){
        sendTextToElement(cardCode,"0136");
    }
    public void enteringContinue(){
        clickOnElement(enterContinue);
    }
    public String byPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    public String byShippingMethod(){
        return getTextFromElement(verifyShippingMethod);
    }
    public String byTotal(){
        return getTextFromElement(textTotal);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }
    public String byThankYou(){
        return getTextFromElement(thankYouText);
    }
    public String byProcessed(){
        return getTextFromElement(verifyProcessed);
    }
    public void onContinue(){
        clickOnElement(clickContinueText);
    }
    public String byWelcomeStore(){
        return getTextFromElement(welcomeToStore);
    }
}
