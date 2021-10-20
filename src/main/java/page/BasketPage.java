package page;

import base.BaseTest;
import org.openqa.selenium.By;

public class BasketPage extends BaseTest {

    By sepeteGit = By.cssSelector("#account-navigation-container > div > div.account-nav-item.basket-preview > a > p");

    public void setSepeteGit() throws InterruptedException {
        driver.findElement(sepeteGit).click();
        Thread.sleep(3000);
    }

    public void sepetKontrolu() throws InterruptedException {



    }
}
