package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		driver.get("https://freecrm.com/pricing.html");//enter URL
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("dinislam2698@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Din@98test");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);
		
		//if uses frame tag.so,at first we have to switch to frame
//		driver.switchTo().frame("frameName");
//		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();

	
	}

}
