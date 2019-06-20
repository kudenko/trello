package com.trello.ui.pages;
import com.trello.ui.core.Elem;
import org.openqa.selenium.By;

import static com.trello.ui.core.BrowserFactory.*;

public class BoardsPage {
    private static final String PATH = "/grey237/boards";

    public Elem boardByUrlElm(String urlName){
        return new Elem(By.cssSelector(".board-tile[href='"+urlName+"']"));

    }

    public void open(){

    }

    public void isOpened(){

    }

    public void openBoard(String urlName){
        boardByUrlElm(urlName).find().click();

    }
}
