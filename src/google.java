import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class google {

    public static void main(String[] args) throws InterruptedException{
    //int count = 0;
// Instantiate a SafariDriver class.
        WebDriver driver = new SafariDriver();
// Launch Website
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
// Click on the search text box and send value
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");

      Thread.sleep(3000);
      // to open the list of file in the search bar
      List<WebElement> optionList=driver.findElements(By.cssSelector("div.s-suggestion-container"));

      //To know the list of size
      System.out.println(optionList.size());

      //To traverse the option list size
      for (int i=0;i<optionList.size();i++)
      {
          // to checking the each element from list
          WebElement ele= optionList.get(i);
          String text=ele.getText();

          // To print the text that we are finding
          System.out.println(text);
          if (text.contentEquals("iphone 13"))
          {
              // To click on that required text
              ele.click();
              break;
          }
      }
        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;
      // using javascript executor trying to click on iphone 13 pro
        js.executeScript("arguments[0].click(),iphone 13 pro");
      //js.executeScript("document.querySelector('[data-component-type=\"s-product-image\"] .s-image').click()");
//        Thread.sleep(500);
//        List<WebElement> searchList = driver.findElements(By.cssSelector("[data-component-type=\"s-product-image\"] .s-image"));
//        Thread.sleep(500);
//      System.out.println("Length  "+searchList.size());
//        Thread.sleep(500);
//      if(searchList.get(0).isDisplayed())
//      {
//          Thread.sleep(500);
//          searchList.get(0).click();
//      }
      //driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (128GB) - Silver']")).click();
       //driver.findElement(By.xpath("//span[contains(text(), 'Apple iPhone 13 Pro (128GB) - Sierra Blue')]")).click();
      }
}


