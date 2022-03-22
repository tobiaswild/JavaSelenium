import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Email {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://gmail.com");
        driver.findElement(By.name("identifier")).sendKeys("tobias.m.wild" + Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("j8Y8mYCouUv0" + Keys.ENTER);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        if (driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/#inbox")) {
            System.out.println("Du bist jetzt angemeldet!");
        }
        QuitMethod.goQuit(driver);
    }

}
