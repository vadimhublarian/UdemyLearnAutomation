import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by MasterJedi on 05.04.2020.
 * LearnAutomation
 */
public class SearchTest {

    @Test
    public void openGoogleComInChromeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void openYoutubeComInIeTest() {
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://youtube.com");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
