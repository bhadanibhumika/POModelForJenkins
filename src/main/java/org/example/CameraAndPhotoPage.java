package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils{
    private By _clickOnAddToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private  By _clickOnShoppingCartLink = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/cart\"]");


    public void clickOnAddToCart(){
        //click on leica t mirrorless
        clickOnElement(_clickOnAddToCartButton);
    }
    public void clickonShoppingCart(){
        //click on green popup window

        clickOnElement(_clickOnShoppingCartLink);
    }

}
