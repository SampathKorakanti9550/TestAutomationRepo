package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenuimhq {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
	WebElement textBox=driver.findElement(By.xpath("//input[@title='Search']"));
	textBox.sendKeys("selenium");
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.xpath("//cite[@role='text']")).click();
	
	
	
	
	
	
	
	       
	      
		
		

	}

}
