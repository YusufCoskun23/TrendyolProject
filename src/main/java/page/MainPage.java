package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.util.Set;


public class MainPage extends BaseTest {

    By girisYapButton = By.cssSelector("#account-navigation-container > div > div.account-nav-item.user-login-container > div.login-dropdown > div > div.login-button");
    By erkekSec = By.cssSelector("#gender-popup-modal > div > div > div.homepage-popup > div:nth-child(4) > a > span.homepage-popup-gender");
    By girisYapHover = By.cssSelector("#account-navigation-container > div > div.account-nav-item.user-login-container > div.link.account-user");
    By aramaBtn = By.cssSelector("#auto-complete-app > div > div > input");
    By aramayaTıkla = By.cssSelector(".search-box-container > input");
    By onuncuUrunFavorilereEkle = By.cssSelector("#search-app > div > div.srch-rslt-cntnt > div.srch-prdcts-cntnr > div:nth-child(2) > div > div:nth-child(10) > div.fvrt-btn-wrppr > i");
    By onuncuUrunuSec = By.cssSelector(".p-card-wrppr:nth-child(1)");
    By sepeteEkle = By.cssSelector("#product-detail-app > div > div.flex-container > div.product-container > div.container-right-content > div.product-button-container > button > div.add-to-basket-button-text");
    By bedenSec = By.cssSelector("");




    public void loginSayfasınaGiris() throws InterruptedException {

        driver.findElement(erkekSec).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(girisYapHover)).perform();
        driver.findElement(girisYapButton).click();
    }

    public void kazakSayfasınaGit() throws InterruptedException {

        driver.findElement(aramaBtn).sendKeys("kazak");
        driver.findElement(aramayaTıkla).sendKeys(Keys.ENTER);
        Thread.sleep(2000);


    }

    public void deleteOverlay() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0 , 1000)");
        String overlayString = "return document.querySelector(\".overlay\").remove();";
        js.executeScript(overlayString);
    }

    public void urunSec() throws InterruptedException {
        driver.findElement(onuncuUrunFavorilereEkle).click();
        driver.findElement(onuncuUrunuSec).click();
        Thread.sleep(3000);
    }

    public void switchToTest() throws InterruptedException {
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window :windowHandles) {
            if (!currentWindow.equals(window)) {
                driver.switchTo().window(window);
            }
        }
    }

    public void bedenSec() throws InterruptedException {
        driver.findElement(bedenSec).click();
        Thread.sleep(2000);
    }

    public void setSepeteEkle() throws InterruptedException {
        driver.findElement(sepeteEkle).click();
        Thread.sleep(3000);
    }



}
