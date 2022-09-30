import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class acko {

    public static void main(String[] args) throws InterruptedException{

// Instantiate a SafariDriver class.
        WebDriver driver = new SafariDriver();
// Launch Website
        driver.navigate().to("https://www.acko.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='bike icon']")).click();
        Thread.sleep(200);
        driver.findElement(By.id("bikeNumber")).sendKeys("UP53 DC 3033");
        driver.findElement(By.cssSelector("button.sc-hzNEM.sc-kxynE.hIBnmR")).click();
        driver.findElement(By.cssSelector("sc-brqgnP jFWeyI")).click();

       driver.findElement(By.xpath("//div[contains(text(),'Expired or not')]")).click();

        //driver.findElement(By.xpath("//div[text()='Policy not expired']")).click();
        //driver.findElement(By.className("sc-dkzDqf sc-kjoXOD fseCie")).click();
        driver.close();
        }
}

