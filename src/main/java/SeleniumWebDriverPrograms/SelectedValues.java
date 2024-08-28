package SeleniumWebDriverPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedValues {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement	ele = driver.findElement(By.name("coffee"));
		Select sc = new Select(ele);
		List<WebElement> web= sc.getOptions();
		
		for(WebElement x:web) {
			System.out.println(x.getAttribute("value"));
			System.out.println(x.getText());
		}
	}

}
