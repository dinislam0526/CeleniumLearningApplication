package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("D:\\personal_folder\\personalFolder\\303.jpg");
		
		
	}

}
