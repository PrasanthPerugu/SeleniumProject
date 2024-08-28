package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileuploadusingSelenium {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/upload#google_vignette");
		WebElement fileInput = driver.findElement(By.id("fileInput"));
		String path = "C:\\Users\\prasa\\Downloads\\Selenium-prasanthperuguyadav.doc";
		fileInput.sendKeys(path);

		String inputText = fileInput.getAttribute("value");
        if (inputText.contains("Selenium-prasanthperuguyadav.doc")) {
            System.out.println("File path set correctly: " + inputText);
        } else {
            System.out.println("Failed to set file path.");
        }
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("fileSubmit")));
		uploadButton.click();

	}

}
