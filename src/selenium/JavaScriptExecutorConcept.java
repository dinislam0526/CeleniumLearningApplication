package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\personalProject\\SeleniumFolder\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		driver.get("https://freecrm.com/pricing.html");//enter URL
		WebElement loginBtn = driver.findElement(By.xpath("//a[contains(@class,'btn')]"));
		
		flash(loginBtn,driver);//highlight the element
		drawBorder(loginBtn,driver);// draw border
		
		//take screenshot and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copy //method
	    Files.copy(src,new File("D:\\personalProject\\SeleniumFolder\\seleniumLarningApplication\\src\\selenium\\element.png"));
	    
	    generatedAlert(driver,"This is a problem");
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(1000);
	    alert.accept();
	    
	    clickElementByJs(loginBtn, driver);
		

	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i<50; i++) {
			changeColor(bgcolor,element,driver);//2
			changeColor("rgb(0,0,0)",element,driver);//1
		}
	}
	
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e){
			
		}
	}
	
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
	
	public static void generatedAlert(WebDriver driver,String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJs(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	
	
	}
