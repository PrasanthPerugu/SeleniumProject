package SeleniumPrograms;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser");
		String browser = sc.nextLine();
		
		WebDriver driver = null;
		
		if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}else {
			if(browser.equals("chrome")) {
				driver = new ChromeDriver();
			}else {
				System.out.print("Invalid browser");
			}
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).submit();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			String title = driver.getTitle();			
			System.out.println("Title of the page:"+title);
			
			String url = driver.getCurrentUrl();
			System.out.println("Current url:"+url);
		
			driver.close();
		}
	}

}
