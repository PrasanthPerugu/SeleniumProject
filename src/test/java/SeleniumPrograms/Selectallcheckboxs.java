package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectallcheckboxs {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get(" https://demoqa.com/register");
		driver.manage().window().maximize();
//		List<WebElement> w = 
//		driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<w.size();i++){
//		w.get(i).click();
//		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("http://ironspider.ca/forms/dropdowns.htm");
//		WebElement w = driver.findElement(By.name("coffee2"));
//		Select s=new Select(w);
//		boolean b = s.isMultiple();
//		System.out.println(b);
		
//		driver.get("http://ironspider.ca/forms/dropdowns.htm");
//		WebElement w = driver.findElement(By.name("coffee"));
//		Select s=new Select(w);
//		List<WebElement> web = s.getAllSelectedOptions();
//		for(WebElement x:web){
//		System.out.println(x.getText());
//		} 
		
//		driver.get("https://www.seleniumhq.org/download/");
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		//To scroll down
//		//j.executeScript("window.scrollBy(0,800)");
//		j.executeAsyncScript("window.scrollBy(0,500)");
//		//To scroll up
//		j.executeAsyncScript("window.scrollBy(0,-500)");
		
		driver.close();
	}
	

}
