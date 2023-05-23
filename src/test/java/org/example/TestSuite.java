package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    public  void verifyToUserShouldBeAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registration details
        registrationPage.enterRegistrationDetails();

        //verify register successful
        registrationResultPage.verifyToUserShouldRegisterSuccessfully();
    }
    @Test
    public void verifyUserShouldBeAbleToSeeProductInShoppingCartSuccessfully(){
        //click on electronics
        homePage.clickOnElectronics();

        //click on camera and photo
        electronicsPage.clickOnCamaraAndPhotos();

        //click on leica camera
        cameraAndPhotoPage.clickOnAddToCart();

        //click on shopping cart pop up window
        cameraAndPhotoPage.clickonShoppingCart();

        //compare product name in shopping cart
        shoppingCartPage.clickOnProductName();
    }
}
