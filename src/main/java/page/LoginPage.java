package page;

import base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    By ePostaGirisi = By.cssSelector("#login-email#login-email");
    By sifreGirisi = By.cssSelector("#login-password-input");
    By girisYapBtn = By.cssSelector("#login-register > div.lr-container > div.q-layout.login > form > button");

    public void loginOlma() throws InterruptedException {
        driver.findElement(ePostaGirisi).sendKeys("test@gmail.com");
        driver.findElement(sifreGirisi).sendKeys("ttest");
        driver.findElement(girisYapBtn).click();
        Thread.sleep(2000);
    }


}
