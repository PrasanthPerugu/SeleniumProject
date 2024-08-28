package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPostAutomation {

    public static void main(String[] args) {

        // Set Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            // Navigate to Facebook and log in
            driver.get("https://www.facebook.com/");

            // Replace with your Facebook credentials
            String email = "Perugu Prasanth Yadav";  // Use your actual email
            String password = "Subbamma@123";        // Use your actual password

            WebElement emailElement = driver.findElement(By.id("email"));
            WebElement passwordElement = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.name("login"));

            emailElement.sendKeys(email);
            passwordElement.sendKeys(password);
            loginButton.click();

            // Define the groups you want to post to
            List<String> groupUrls = Arrays.asList(
                "https://www.facebook.com/groups/group1",
                "https://www.facebook.com/groups/group2",
                "https://www.facebook.com/groups/group3"
            );

            String postMessage = "I am hiring a java developer position for 4 years of experience";

            // Loop through each group and post
            for (String groupUrl : groupUrls) {
                driver.get(groupUrl);
                Thread.sleep(5000); // Wait for the page to load

             // Check if the post box is available and click it
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                WebElement postBox = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@aria-label, 'Write something')]")));

                // Enter the post message
                WebElement postInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='textbox']")));
                postInput.sendKeys(postMessage);

                // Handle any popups (e.g., permissions)
                handlePopup(driver);

                // Click the post button
                WebElement postButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Post']")));
                postButton.click();

                // Wait for the post to complete
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void handlePopup(WebDriver driver) {
        try {
            // Wait for a short time to allow the popup to appear
            Thread.sleep(2000);
            
            // Check for any permission pop-ups and click 'Allow' if found
            List<WebElement> allowButtons = driver.findElements(By.xpath("//button[contains(text(), 'Allow')]"));
            for (WebElement allowButton : allowButtons) {
                if (allowButton.isDisplayed() && allowButton.isEnabled()) {
                    allowButton.click();
                }
            }
        } catch (Exception e) {
            // No popup found, do nothing
        }
    }
}
