package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _registerButton = By.className("ico-register");
    private By _electronicsLink = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a[@href=\"/electronics\"]");

    public void clickOnRegisterButton() {
        //click on register link
        clickOnElement(_registerButton);
    }
    public void clickOnElectronics(){
        //click on Electronics link
        clickOnElement(_electronicsLink);
    }
}
