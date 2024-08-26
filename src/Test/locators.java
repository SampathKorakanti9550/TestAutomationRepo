package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
     WebDriver driver = new ChromeDriver() ;
	 driver.get("https://github.com/login");
	 Thread.sleep(3000);
	driver.findElements(By.id("login_field"));
	highlight(driver,driver.findElements(By.id("login_field")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.name("password")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.className("header-logo")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.linkText("Forgot password?")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.partialLinkText("Create an")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.tagName("h1")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.xpath("\\label[contains(text(),'Username or email address')]")));
	Thread.sleep(3000);
	highlight(driver,driver.findElements(By.cssSelector("input[name='commit']")));
	
	
	
	}

	private static void highlight(WebDriver driver, List<WebElement> findElements) {
		// TODO Auto-generated method stub
		
	}

}
