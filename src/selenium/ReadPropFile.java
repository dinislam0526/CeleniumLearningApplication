package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("D:\\personalProject\\SeleniumFolder\\seleniumLarningApplication\\src\\selenium\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		String url = prop.getProperty("URL");
		
		String browser = prop.getProperty("browser");
		
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();//launch chrome
		}else if(browser.equals("ff")) {
			System.setProperty("webdriver.geckodriver.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		

	}

}
