package com.trello.ui.pages;

import com.trello.ui.core.Constant;
import com.trello.ui.core.Elem;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.trello.ui.core.BrowserFactory.*;


public class LoginPage {
    private static String PATH = "/login";
    Logger logger = LoggerFactory.getLogger(getClass());

    public Elem emailFld = new Elem(By.cssSelector("#user"), "Login field");
    public Elem passFld = new Elem(By.cssSelector("#password"), "Pass field");
    public Elem loginBtn = new Elem(By.cssSelector("#login"), "Login button");

    public void open(){

        get(Constant.URL+PATH);
        logger.info("get " + Constant.URL+PATH);
        Assert.assertTrue(isOpened(), "Page 'Login' ["+PATH+"] not Opened");
    }

    public boolean isOpened(){
        return loginBtn.isPresent() && driver().getCurrentUrl().equals(Constant.URL + PATH);
    }

    public void login(String email, String pass){
        emailFld.type(email);
        passFld.type(pass);
        loginBtn.click();
    }
}
