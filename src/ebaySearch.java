import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class ebaySearch {
    WebDriver driver;
    public void launchbrowser() {

        // Instantiate a SafariDriver class.
         driver = new SafariDriver();
        // Launch Website
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

    }
    public void searchProduct() throws InterruptedException {
        Thread.sleep(2000);
       //it redirect to homepagesearch for searching JBL speakers
        EbayHomePageSearch.search(driver,"JBL speakers");

        // it redirect to homepage and select category by index
        EbayHomePageSearch.selectCategoryByIndex(driver,22);

        //it rediret to homepage and click on the search button
        EbayHomePageSearch.clickSearchButton(driver);

        Thread.sleep(5000);

        //it redirect to homepage and search item
        EbayHomePageSearch.searchItem(driver);

        //List<WebElement> list = driver.findElements(By.xpath("//li[@class='s-item s-item__pl-on-bottom s-item--watch-at-corner']"));
        //System.out.println(list.size());
        //list.get(list.size()-1).click();

        Thread.sleep(2000);
        //driver.findElement(By.linkText(" Daily Deals")).click();

    }
    public static void main(String[] args) throws InterruptedException {

     ebaySearch obj = new ebaySearch();
     obj.launchbrowser();
     obj.searchProduct();
    }
}