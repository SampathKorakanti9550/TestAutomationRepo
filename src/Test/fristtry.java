package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fristtry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://meesho.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saree");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@alt,'Sia Trendy Women')]")).click();
		driver.findElement(By.xpath("//span[@color=Text__StyledText-sc-oo0kvp-0 kJpMBl")).click();
	}
	
}
