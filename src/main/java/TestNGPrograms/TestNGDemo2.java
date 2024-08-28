package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test
	public void faceboob() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String tittle = driver.getTitle();

		System.out.println(tittle);
		
		driver.close();
	}
	@Test
	public void google() {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String tittle = driver.getTitle();

		System.out.println(tittle);
		
		driver.close();
		
	}

}
