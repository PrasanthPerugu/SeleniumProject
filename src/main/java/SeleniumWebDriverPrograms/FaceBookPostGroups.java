package SeleniumWebDriverPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookPostGroups {

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
            
            //clicking the new window post creation
            WebElement clickingElement = driver.findElement(By.className("x6s0dn4 x1jx94hy x8cjs6t x1ch86jh x80vd3b xckqwgs x1lq5wgf xgqcy7u x30kzoy x9jhf4c x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x178xt8z xm81vs4 xso031l xy80clv xev17xk x9f619 x78zum5 x1qughib xktsk01 x1d52u69 x1y1aw1k x1sxyh0 xwib8y2 xurb0ha"));
            clickingElement.click();
            
         //  Capture current window handle
            String mainWindowHandle = driver.getWindowHandle();
            System.out.println("Main window handle: " + mainWindowHandle);
            
         //  Switch to the new window
            driver.switchTo().window(mainWindowHandle);
            System.out.println("Switched to new window");
            
            WebElement clickImg = driver.findElement(By.xpath("//div[@class='x6s0dn4 x1jx94hy x8cjs6t x1ch86jh x80vd3b xckqwgs x1lq5wgf xgqcy7u x30kzoy x9jhf4c x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x178xt8z xm81vs4 xso031l xy80clv xev17xk x9f619 x78zum5 x1qughib xktsk01 x1d52u69 x1y1aw1k x1sxyh0 xwib8y2 xurb0ha']"));
            clickImg.click();
            
          WebElement fileuploding = driver.findElement(By.xpath("//*[text()='Add Photos/Videos']"));
          fileuploding.click();
          
       // upload the file using AutoIT
          Runtime.getRuntime().exec("C:\\Users\\prasa\\OneDrive\\Documents\\FileuploadfacebookPost.exe");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
          
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the browser
        //driver.quit();
    }
}

}
