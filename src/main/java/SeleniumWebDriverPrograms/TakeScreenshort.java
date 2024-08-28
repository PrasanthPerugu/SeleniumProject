package SeleniumWebDriverPrograms;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshort {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");
	
		driver.findElement(By.id("email")).sendKeys("prasanth");
		driver.findElement(By.id("pass")).sendKeys("123Prasanth");
		driver.findElement(By.id("loginbutton")).click();
		
		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Screenshot/imgfacebook.png");
		FileUtils.copyFile(sourcefile, destfile);
		
		System.out.println("Screenshot saved successfully");
		
		driver.quit();

	}
}
