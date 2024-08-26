package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("youtube");
		
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//cite[@class='iUh30 tjvcx']")).click();
	}

}
