package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/pricing.html");//enter URL
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
//		driver.findElement(By.name("email")).sendKeys("dindnet2698@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Din@98fat");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-MJoBVe']")).click();
		
	}

}
