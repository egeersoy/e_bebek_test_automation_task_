package e_bebek_otomation_test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Actions action = new Actions(driver);

        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.id("txtSearchBox"));
        search.click();
        search.sendKeys("biberon");
        Thread.sleep(3000);
        driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement product = driver.findElement(By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[3]/eb-product-list/div/section/div/div/div/div[2]/eb-product-scroll/div/div/eb-product-list-item[1]/div/eb-generic-link/a/div"));
        product.click();
        Thread.sleep(3000);
        WebElement addToCartBtn = driver.findElement(By.id("addToCartBtn"));
        addToCartBtn.click();
        Thread.sleep(3000);
        WebElement showCartBtn = driver.findElement(By.id("btnShowCart"));
        showCartBtn.click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.e-bebek.com/cart"));

        System.out.println("Ürün sepete başarıyla eklendi.");

    }
}