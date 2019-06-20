package regression;

import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BrowserFactory {
    LoginPage loginPage = new LoginPage();
    BoardsPage boardsPage = new BoardsPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("jubekamefa@first-mail.info", "312312312a");
        boardsPage.openBoard("/b/Ad39BPpI/first-table");
        Thread.sleep(10000);
    }
}
