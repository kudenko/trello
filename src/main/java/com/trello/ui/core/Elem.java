package com.trello.ui.core;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.trello.ui.core.BrowserFactory.*;

public class Elem {
    By by;
    String name;

    public Elem(By by, String name){
        this.by = by;
        this.name = name;
    }

    public Elem(By by){
       this(by, "");
    }

    public void click(){
        driver().findElement(by).click();
    }

    public void type(String text){
        driver().findElement(by).clear();
        driver().findElement(by).sendKeys(text);
    }

    public boolean isPresent(){
        try {
            getWebdriverWait(10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    public WebElement find(){
        return getWebdriverWait(10).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
