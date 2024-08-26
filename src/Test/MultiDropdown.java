package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3school.com/tags/tryit.asp?filename=tryhtml-select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement ele=driver.findElement(By.name("cars"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		sel.selectByValue("opel");
		sel.selectByVisibleText("Audi");
		Thread.sleep(3000);
      sel.deselectByIndex(0);
	}

}
