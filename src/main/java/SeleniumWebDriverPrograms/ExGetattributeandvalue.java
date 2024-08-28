package SeleniumWebDriverPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExGetattributeandvalue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")).click();
		driver.findElement(By.name("username")).sendKeys("prasanth");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("re_password")).sendKeys("password");
		driver.findElement(By.name("full_name")).sendKeys("full_name_pp");
		driver.findElement(By.name("email_add")).sendKeys("prasanthcbit249@gmail.com");
		
		String s = driver.findElement(By.id("username")).getAttribute("value");
		String s1 = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(s);
		System.out.println(s1);
		//driver.findElement(By.id("login")).click();
		//driver.close();
	}

}
