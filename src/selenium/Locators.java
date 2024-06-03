package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sbl.com.bd:7070/CollegeFee/Payment/FormFillUp");
		driver.findElement(By.xpath("//*[@id=\"Degree\"]")).click();
		Select select = new Select(driver.findElement(By.id("ST_Year")));
		select.selectByVisibleText("3rd");
		
//		driver.findElement(By.linkText("এক নজরে")).click();
//		driver.findElement(By.xpath("//*[@href=\"/eprocure/plan\"]")).click();
//		driver.findElement(By.xpath("//*[@formcontrolname=\"ministryId\"]")).click();
//		driver.findElement(By.partialLinkText("//*[@id=\"a1b30921b2cf-1\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("btn-success")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("What is Java? - Java Programming Language Explained")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("What is Java technology and why do I need it?")).click();
//		
		
		
		
		System.out.print(driver.getTitle());
	}

}
