package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String alertText = alert.getText();
		
		if(alertText.equals("Please enter a valid user name")) {
			System.out.println("Correct alert text!");
		}else {
			System.out.println("Incorrect alert text!");
		}
		alert.accept();
//		alert.dismiss();

	}

}
