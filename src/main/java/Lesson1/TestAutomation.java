package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
        Thread.sleep(10000);

        WebElement dressStile = driver.findElement(By.id("//input[@id=layered_id_attribute_group_2]"));


        dressStile.click();
        driver.findElement(By.id("//input[@id=layered_category_11]")).click();

        driver.quit();


    }
}

