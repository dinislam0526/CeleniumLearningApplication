package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");//enter URL
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SpiceCafé")).click();
		System.out.println(driver.getTitle());
		

	}

}
