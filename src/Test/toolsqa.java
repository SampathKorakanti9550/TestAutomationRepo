package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.className("css-1hwfws3")).click();
	driver.findElement(By.className("css-1uccc91-singleValue")).click();
	driver.findElement(By.className("css-1hwfws3")).click();
	driver.findElement(By.className("css-1uccc91-singleValue")).click();

	}

}
