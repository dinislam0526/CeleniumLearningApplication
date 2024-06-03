package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");//enter URL
		
		//absolute xpath: not recommended
		//*[@id="gh-eb-My"]/div/a[1]
		//1. performance issue
		//2. not reliable
		//3. can be changed at any time in future
		
//		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java books");
		
		//dynamic id:input
		//id = test_123
	    //By.id("test_123");
		
		//--starts-with
		//id = test_123
		//id = test_124
		//id = test_test_125_test
		
		//--ends-with
		//id = 234_test_t
		//id = 235_test_t

//		driver.findElement(By.xpath("//input[contains(@id,'test_123')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
//		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
		
		//for links:custom xpath:
		//all the links are represented by <a> html tag:
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		
	}

}
