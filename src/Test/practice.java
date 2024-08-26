package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement username=driver.findElement(By.id("firstName"));
		
		username.sendKeys("laxmi");
		driver.findElement(By.id("lastName")).sendKeys("gandra");
		driver.findElement(By.id("userEmail")).sendKeys("laxmigandra@wipro.com");
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9701821557");
//		driver.findElement(By.id("subjectsContainer")).sendKeys("formfilling");
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("l-10-404hyderbad");
		driver.findElement(By.id("submit")).click();
	}

}
