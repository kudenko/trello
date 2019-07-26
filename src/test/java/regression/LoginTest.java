package regression;

import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.LoginPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginTest extends BrowserFactory {
    Logger logger = LoggerFactory.getLogger(getClass());
    LoginPage loginPage = new LoginPage();
    BoardsPage boardsPage = new BoardsPage();

    @Test
    @Epic("Regression")
    @Story("Test story")
    @Step
    public void login() {
        loginPage.open();
        logger.info("Enter pass and email");
        loginPage.login("jubekamefa@first-mail.info", "312312312a");
        logger.info("Open dash");

        boardsPage.openBoard("/b/Ad39BPpI/first-table");
    }
}
