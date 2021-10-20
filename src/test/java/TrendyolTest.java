import base.BaseTest;
import org.junit.Test;
import page.BasketPage;
import page.LoginPage;
import page.MainPage;

public class TrendyolTest extends BaseTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    BasketPage basketPage = new BasketPage();

    @Test
    public void test() throws InterruptedException {

        mainPage.loginSayfasınaGiris();
        loginPage.loginOlma();
        mainPage.kazakSayfasınaGit();
        mainPage.deleteOverlay();
        mainPage.urunSec();
        mainPage.switchToTest();
        //mainPage.bedenSec();
        mainPage.setSepeteEkle();
        basketPage.setSepeteGit();

    }

}
