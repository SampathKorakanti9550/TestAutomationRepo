package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formfilling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("laxmigandra");
		driver.findElement(By.id("userEmail")).sendKeys("laxmigandra@wipro.com");
		driver.findElement(By.id("currentAddress")).sendKeys("l-10-404hyderbad");
		driver.findElement(By.id("permanentAddress")).sendKeys("karimnagar");
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String txt=driver.findElement(By.id("userName-label")).getText();
		String txt1=driver.findElement(By.id("userEmail-label")).getText();
		String txt2=driver.findElement(By.id("currentAddress-label")).getText();
		String txt3=driver.findElement(By.id("permanentAddress-label")).getText();
		System.out.println(txt);
		System.out.println(txt1);
		System.out.println(txt2);
		System.out.println(txt3);
		
		
	}

}
