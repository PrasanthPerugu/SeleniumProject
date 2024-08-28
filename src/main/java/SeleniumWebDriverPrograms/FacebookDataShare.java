package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDataShare {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
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
			Thread.sleep(5000);

			// Navigate to groups
			driver.get("https://www.facebook.com/groups/feed/");
			
			// Allow notifications
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		       WebElement allowButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Allow']")));
		        allowButton.click();
		       
			// Select the first group (you might need to customize the selector)
			List<WebElement> groups = driver.findElements(By.cssSelector("a[role='link'][href*='/groups/']"));
			if (groups.size() > 0) {
				groups.get(0).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
				// Click on the post area and send a message
				WebElement postBox = driver.findElement(By.cssSelector("div[aria-label='Write something...']"));
				postBox.click();
				postBox.sendKeys("Hello, this is an automated post!");
				
				// Click the post button
				WebElement postButton = driver.findElement(By.xpath("//button[contains(text(), 'Post')]"));
				postButton.click();

				// Wait to ensure the post is submitted
				Thread.sleep(5000);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Clean up and close the browser
			//driver.quit();
		}
	}
}
