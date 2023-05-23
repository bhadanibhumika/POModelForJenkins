package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private  By _email = By.name("Email");
    private By _password = By.id("Password");
    private By _conformPassword = By.name("ConfirmPassword");
    private By _clickRegisterButton = By.name("register-button");
    private By _dayOfBirth = By.cssSelector("select[name='DateOfBirthDay']");
    private By _monthOfBirth = By.cssSelector("select[name='DateOfBirthMonth']");
    private By _yearOfBirth = By.cssSelector("select[name='DateOfBirthYear']");
    public void enterRegistrationDetails(){
        //type first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //type last name
        typeText(_lastName,loadProp.getProperty("lastName"));
        //select day  from dropdown
        selectElementByValue(_dayOfBirth,loadProp.getProperty("dayOfBirth"));
        //select month from dropdown
        selectElementByValue(_monthOfBirth,loadProp.getProperty("mothOfBirth"));
        //select year from dropdown year
        selectElementByText(_yearOfBirth,loadProp.getProperty("yearOfBirth"));
        //type email
        typeText(_email,loadProp.getProperty("email")+timestamp()+loadProp.getProperty("emailDomain"));
        //type password
        typeText(_password,loadProp.getProperty("password"));
        //type  conform password
        typeText(_conformPassword,loadProp.getProperty("conformPassword"));
        //click on register button
        clickOnElement(_clickRegisterButton);

    }
}
