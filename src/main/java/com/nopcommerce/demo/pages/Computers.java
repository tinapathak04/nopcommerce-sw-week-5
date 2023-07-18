package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Computers extends Utility {

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile'] //a[text()='Computers ']" )
    WebElement clickComputerMenu;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile'] //a[text()='Computers ']" )
   WebElement hoverDesktop;

    @CacheLookup
    @FindBy(xpath ="//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement clickDesktop;

    @CacheLookup
    @FindBy(xpath ="//select[@id='products-orderby']" )
    WebElement selectSortPosition;

    @CacheLookup
    @FindBy(xpath ="//option[contains(text(),'Name: Z to A')]" )
    WebElement verifyProductArrangeDescendingOrder;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile'] //a[text()='Computers ']" )
    WebElement clickComputer;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectSortName;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement clickAddCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath ="//select[@id='product_attribute_1']" )
    WebElement selectGHzIntel;

    @CacheLookup
    @FindBy(xpath ="//select[@id='product_attribute_2']" )
    WebElement select8GB;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_3_7']" )
    WebElement selectHDDradio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement clickVistPremium;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_5_12']" )
    WebElement totalCommander;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;

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





    public void clickOnComputerMenu(){
        clickOnElement(clickComputerMenu);
    }
    public void hoverOnDesktop(){
        mouseHoverToElement(hoverDesktop);
    }
    public void clickOnDesktop(){
        clickOnElement(clickDesktop);
    }
    public void selectNameZtoA(){
        selectByContainsTextFromDropDown((By) selectSortPosition,"Name: Z to A");
    }
    public String descendingOrder(){
        return getTextFromElement(verifyProductArrangeDescendingOrder);
    }
    public void clickOnComputer(){
        clickOnElement(clickComputer);
    }
    public void selectNameAtoZ(){
        selectByIndexFromDropDown(selectSortName,1);
    }
    public void addOnCart(){
        clickOnElement(clickAddCart);
    }
    public String verifyByText(){
        return getTextFromElement(verifyText);
    }
    public void selectOnGHzDualE2200(){
        selectByValueFromDropDown(selectGHzIntel,"1");
    }
    public void selectOn8GB(){
        selectByValueFromDropDown(select8GB,"5");
    }
    public void clickOnRadio(){
        clickOnElement(selectHDDradio);
    }
    public void OsRadioVistaPremium(){
        clickOnElement(clickVistPremium);
    }
    public void tickOnMicrosoft(){
        clickOnElement(MicrosoftOffice);
    }
    public void tickOnTotalCommander(){
        clickOnElement(totalCommander);
    }
    public String verifyThePrice(){
        return getTextFromElement(verifyPrice);
    }





}
