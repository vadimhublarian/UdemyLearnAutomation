package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Test
    public void searchWithEnterButtonTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle() + " page has been opened");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.clear();
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);

        WebElement resultStatsDiv = driver.findElement(By.cssSelector("div#result-stats"));
        System.out.println("Number of results and time the search took: " + resultStatsDiv.getText());

        driver.quit();
    }
}
