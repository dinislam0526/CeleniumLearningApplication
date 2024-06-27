package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		driver.get("https://api.cogmento.com/register/?lang=en-GB");//enter URL
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@id,'submitButton')]"));
		
		//1.isDiplayed() method : applicable for all the elements
		boolean btn = loginBtn.isDisplayed();
		System.out.println(btn);//true
		
		//2.isEnabled() method
		boolean b2 = loginBtn.isEnabled();//loginBtn is enable now 
		System.out.println(b2);//true
		
		//3.isSelected() method: only applicable for checkbox, dropdown, radiobutton
		
		boolean b3 = driver.findElement(By.id("terms")).isSelected();//checkbox is not select
		System.out.println(b3);//false
		
		driver.findElement(By.id("terms")).click();//checbox is selected
		boolean b4 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);//true
		

	}

}
