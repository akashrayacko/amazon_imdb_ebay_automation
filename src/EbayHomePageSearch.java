import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EbayHomePageSearch
{
    public static void search(WebDriver driver,String searchQuery){
        driver.findElement(By.id("gh-ac")).sendKeys(searchQuery);
    }

    public static void selectCategoryByValue(WebDriver driver,String category){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        select.selectByValue(category);
    }

    public static void selectCategoryByIndex(WebDriver driver,int index){
        Select select=new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        select.selectByIndex(index);
    }

    public static void clickSearchButton(WebDriver driver) {
        driver.findElement(By.id("gh-btn")).click();
    }
    public static void searchItem(WebDriver driver) {
        List<WebElement> list = driver.findElements(By.xpath("//li[@class='s-item s-item__pl-on-bottom s-item--watch-at-corner']"));
        System.out.println(list.size());
        list.get(list.size()-1).click();
    }
}
