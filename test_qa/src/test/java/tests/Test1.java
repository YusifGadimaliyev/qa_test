package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("http://www.qanun.az");
//        WebElement divx = driver.findElement(By.name("filter_name"));
//        divx.sendKeys("roman");
//        divx.sendKeys(Keys.ENTER);
//        Thread.sleep(5000);
//
////        WebElement increase = driver.findElement(By.xpath("//*[contains(@class, 'countable')]/button[last()]"));
////        increase.click();
////    after increasing product
//        WebElement product = driver.findElement(By.xpath("//div[last()]/div/button"));
//        product.click();
//        Thread.sleep(5000);
//
//        WebElement basket = driver.findElement(By.xpath("//p[contains(text(), 'Səbət')]"));
//        basket.click();



        driver.get("http://www.qanun.az");
        WebElement divx = driver.findElement(By.name("keyword"));
        divx.sendKeys("roman");
        divx.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        WebElement increase = driver.findElement(By.xpath("//*[contains(@class, 'countable')]/button[last()]"));
        increase.click();
        Thread.sleep(2000);
//    after increasing product
        WebElement product = driver.findElement(By.xpath("//div[last()]/div/button"));
        product.click();
        Thread.sleep(3000);

        WebElement basket = driver.findElement(By.xpath("//p[contains(text(), 'Səbət')]"));
        basket.click();
    }
}