package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		
		

	}

}
