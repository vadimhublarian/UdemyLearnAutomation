package Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Created by Vadim Khublarian on 6/26/20.
 */
public class SearchExercises {
    @Test
    public void openYoutubeComInIeTest() {
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://youtube.com");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
