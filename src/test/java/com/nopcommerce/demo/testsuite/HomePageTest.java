package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {


    HomePage homepage;


    @BeforeMethod(alwaysRun = true)
    public void init(){
        homepage = new HomePage();

    }




   @Test(groups = {"sanity","regression"})

    public void verifyPageNavigation(){

        homepage.selectMenu("Computers");
   }

}
