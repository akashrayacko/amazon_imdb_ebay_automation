import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class googlesearchpom {

    private static WebElement element= null;
     public static WebElement textbox_search(WebDriver driver) {

         element=driver.findElement(By.name("q"));
         if(element.isDisplayed()) element.sendKeys("aakash ray lovely professional university");
         return element;
     }

     public static WebElement button_search(WebDriver driver) {
         element = driver.findElement(By.name("btnk"));
         return element;
     }
}
