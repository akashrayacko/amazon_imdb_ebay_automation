
//import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

//import pages.googlesearchpom;

public class ggoglepom {

    private static WebDriver driver = null;
    public static void main(String[] args) {
        googlesearch();
    }
    public static void googlesearch() {
        driver = new SafariDriver();

        //go to google.com
        driver.get("Https://google.com");

        //enter text in search textbox
       // driver.findElement(By.name("q")).sendKeys("Automation Step by step");

        googlesearchpom.textbox_search(driver).sendKeys("Automation Step By Step");


        //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        googlesearchpom.button_search(driver).sendKeys(Keys.RETURN);

        //CLOSE BROWSER
        driver.close();

        System.out.println("Test Completed Successfully");



    }
}
