package SeleniumWebDriverPrograms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFbPostCreation {



    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Facebook
            driver.get("https://www.facebook.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Log in
            driver.findElement(By.id("email")).sendKeys("Perugu Prasanth Yadav");
            driver.findElement(By.id("pass")).sendKeys("Subbamma@123");
            driver.findElement(By.name("login")).click();

            // Wait for page to load
            Thread.sleep(5000);

            // Navigate to the specific post URL
            driver.get("https://www.facebook.com/prasanth.perugu");

            // Wait for the post to load
            Thread.sleep(5000);

            // Click on the Share button
            WebElement shareButton = driver.findElement(By.xpath("//*[@id=\"mount_0_0_Ox\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div/div/div/div/div/div/div/div/div[13]/div/div/div[4]/div/div/div[1]/div/div/div/div[4]/div/div[2]"));
            shareButton.click();

            // Wait for the share dialog to appear
            Thread.sleep(3000);

            // Click on 'Share to a group'
            WebElement shareToGroupOption = driver.findElement(By.xpath("//span[text()='proddatur Yadavs group']"));
            shareToGroupOption.click();

            // List of group names
           // List<String> groupNames = List.of("Group 1", "Group 2", "Group 3");

			/*
			 * // Loop through each group for (String groupName : groupNames) { // Search
			 * for the group WebElement groupSearchInput =
			 * driver.findElement(By.xpath("//input[@placeholder='Search groups']"));
			 * groupSearchInput.clear(); groupSearchInput.sendKeys(groupName);
			 * Thread.sleep(2000);
			 * 
			 * // Select the group from the search results WebElement groupResult =
			 * driver.findElement(By.xpath("//div[contains(text(),'" + groupName + "')]"));
			 * groupResult.click(); Thread.sleep(2000);
			 * 
			 * // Click 'Post' to share WebElement postButton =
			 * driver.findElement(By.xpath("//div[@aria-label='Post']"));
			 * postButton.click(); Thread.sleep(3000);
			 * 
			 * // Prepare for the next group shareButton.click(); Thread.sleep(3000);
			 * shareToGroupOption.click(); Thread.sleep(3000); }
			 */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

