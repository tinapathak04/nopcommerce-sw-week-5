package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Electronics extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement hoverElectronicsTab;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']" )
    WebElement clickElectronicsTab;

    @CacheLookup
    @FindBy(xpath ="//h1[normalize-space()='Cell phones']" )
    WebElement hoverOnCellPhones;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement clickCellphones;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Cell phones')]" )
    WebElement verifyCellPhones;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'List')]" )
    WebElement clickListView;

    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Nokia Lumia 1020')]" )
    WebElement clickNokiaLumia;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyNokiaLumia;

    @CacheLookup
    @FindBy(xpath ="//span[@id='price-value-20']" )
    WebElement verify$349;

    @CacheLookup
    @FindBy(xpath ="//input[@id='product_enteredQuantity_20']" )
    WebElement clearQty;
    @CacheLookup
    @FindBy(xpath ="//input[@id='product_enteredQuantity_20']" )
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-20']" )
    WebElement clickAddCart;

    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Shopping cart')]" )
    WebElement hoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Go to cart')]" )
    WebElement clickGoToCart;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Shopping cart')]" )
    WebElement verifyShoppingCart;

    @CacheLookup
    @FindBy(xpath ="//input[@id='itemquantity11222']" )
    WebElement verifyQty2;

    @CacheLookup
    @FindBy(xpath ="//td[@class='subtotal']//span[text()='$698.00']" )
    WebElement verify$698;

    @CacheLookup
    @FindBy(xpath ="//input[@id='termsofservice']" )
    WebElement tickCheckBox;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Register')]" )
    WebElement clickRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegister;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement clickGender;

    @CacheLookup
    @FindBy(xpath ="//input[@id='Password']" )
    WebElement password;

    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']" )
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath ="//div[contains(text(),'Your registration completed')]" )
    WebElement verifyRegistrationCompleted;

    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Shopping cart')]" )
    WebElement textShoppingCart;



    public void hoverOnElectronics(){
        mouseHoverToElement(hoverElectronicsTab);
    }
    public void clickOnElectronics(){
        clickOnElement(clickElectronicsTab);
    }
    public void hoverToCellphones(){
        mouseHoverToElement(hoverOnCellPhones);
    }
    public void clickOnCellphones(){
       clickOnElement(clickCellphones);
    }
    public String verifyByCellphones(){
        return getTextFromElement(verifyCellPhones);
    }
    public void clickOnListView(){
       clickOnElement(clickListView);
    }
    public void clickOnNokiaLumia(){
        clickOnElement(clickNokiaLumia);
    }
    public String verifyByNokiaLumia(){
         return getTextFromElement(verifyNokiaLumia);
    }
    public String by$349(){
         return getTextFromElement(verify$349);
    }
    public void clear(){
        changeQty.clear();
    }
    public void changeQuantity(){
        sendTextToElement(changeQty,"2");
    }
    public void addToCart(){
       clickOnElement(clickAddCart);
    }
    public void hoverToShoppingCart(){
        mouseHoverToElement(hoverOnShoppingCart);
    }
    public void clickOnGoToCart(){
         clickOnElement(clickGoToCart);
    }
    public String byShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }
    public String by2(){
        return getTextFromElement(verifyQty2);
    }
    public String byTotal(){
        return getTextFromElement(verify$698);
    }
    public void clickOnCheckBox(){
        clickOnElement(tickCheckBox);
    }
    public String byWelcomeText(){
        return getTextFromElement(verifyWelcomeText);
    }
    public void clickOnRegister(){
        clickOnElement(clickRegister);
    }
    public String byRegister(){
        return getTextFromElement(verifyRegister);
    }
    public void clickOnGender(){
        clickOnElement(clickGender);
    }
    public void enterPassword(){
        sendTextToElement(password,"tina123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword,"tina123");
    }
    public String byRegistrationCompleted(){
        return getTextFromElement(verifyRegistrationCompleted);
    }
    public String byshoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }



}
