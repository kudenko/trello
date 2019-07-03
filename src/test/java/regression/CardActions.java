package regression;

import com.trello.ui.pages.CardPage;
import com.trello.ui.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CardActions {
    LoginPage loginPage = new LoginPage();
    CardPage cardPage = new CardPage();

    @BeforeTest
    public void prepareData(){
        //createCardFor tests
    }

    @AfterTest
    public void deleteData(){
        //delete test card
    }

    @Test
    public void login(){

    }

    @Test
    public void openCard(){
        cardPage.open("");
    }

    @Test
    public void moveCard(){

    }

    @Test
    public void renameCard(){

    }
}
