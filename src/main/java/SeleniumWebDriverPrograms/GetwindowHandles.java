package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandles {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		// get window handles
		
		 String window = driver.getWindowHandle();
		System.out.println(window);
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		Thread.sleep(3000);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Thread.sleep(3000);
		
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			String w = itr.next();
			driver.switchTo().window(w);
			if(driver.getTitle().equals("New Window")) {
			driver.close();
		}
		}
		Thread.sleep(3000);
		
		driver.switchTo().window(window);
		driver.findElement(By.name("q")).sendKeys("prasanth");
		driver.quit();
	}

}
