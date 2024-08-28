package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDataShare2 {

    public static void main(String[] args) {
        
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2); // 1: Allow, 2: Block
        options.setExperimentalOption("prefs", prefs);

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            // Log in to Facebook
            driver.get("https://www.facebook.com/");
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.name("login"));

            emailField.sendKeys("Perugu Prasanth Yadav");
            passwordField.sendKeys("Subbamma@123");
            loginButton.click();

            // Wait for the page to load after login
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("facebook.com"));

            // Navigate to groups
            driver.get("https://www.facebook.com/groups/feed/");

            // Handle or bypass the "Allow" button using JavaScript
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            try {
                WebElement allowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Allow']")));
                jsExecutor.executeScript("arguments[0].click();", allowButton);
            } catch (Exception e) {
                System.out.println("Allow button not found or already handled.");
            }

            // Additional Facebook group posting actions...
            // Navigate to a specific group and post
            WebElement groupLink = driver.findElement(By.xpath("//a[@aria-label='Groups' and @href='/groups/']"));
            jsExecutor.executeScript("arguments[0].click();", groupLink);

            // Wait for the group page to load
            wait.until(ExpectedConditions.urlContains("/groups/"));

            // Click on the post area and send a message
            WebElement postBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[role='textbox']")));
            jsExecutor.executeScript("arguments[0].click();", postBox);
            postBox.sendKeys("Hello, this is an automated post!");

            // Click the post button
            WebElement postButton = driver.findElement(By.xpath("//div[@aria-label='Post']"));
            jsExecutor.executeScript("arguments[0].click();", postButton);

            // Wait to ensure the post is submitted
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up and close the browser
            //driver.quit();
        }
    }
}
