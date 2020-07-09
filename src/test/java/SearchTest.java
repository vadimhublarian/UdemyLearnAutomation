import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by MasterJedi on 05.04.2020.
 * LearnAutomation
 */
public class SearchTest {

    @Test
    public void openGoogleComInChromeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle() + " page has been opened");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();

        WebElement googleAppsButton = driver.findElement(By.cssSelector("div#gbwa a"));
        googleAppsButton.click();

        List<WebElement> iAmFeelingLuckyButtons = driver.findElements(By.xpath("//input[@name='btnI']"));
        iAmFeelingLuckyButtons.get(1).click();

        driver.quit();
    }

}
