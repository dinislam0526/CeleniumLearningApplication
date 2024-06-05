package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		driver.get("https://www.ebay.com/");//enter URL
		
		List<WebElement> elementsList =  driver.findElements(By.tagName("a"));
		System.out.println(elementsList.size());
		
		for(int i = 0; i<elementsList.size(); i++) {
			String linkText = elementsList.get(i).getText();
			System.out.println(linkText);
		}
		
//		for (WebElement webElement : elementsList) {
//			System.out.println(webElement.getText());
//		}
		
		
	}

}
