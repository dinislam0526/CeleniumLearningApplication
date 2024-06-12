package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		driver.get("https://www.popuptest.com/goodpopups.html");//enter URL
		driver.findElement(By.xpath("//input[@id='popupwindow']")).click();
	
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id :"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("parent window id :"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window pop up Title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		System.out.println("parent window Title"+driver.getTitle());
		
		

	}

}
