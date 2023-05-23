package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _clickOnProduct = By.xpath("//a[@class='product-name']");

    public void clickOnProductName(){
        //get name of product Leica T Mirrorless Digital Camera
        String actualProductName = getTextFromElement(_clickOnProduct);
        System.out.println("Product Name is "+actualProductName);
        //for compare actual and expected result
        Assert.assertEquals(actualProductName,loadProp.getProperty("leicaProductName"));


    }
}
