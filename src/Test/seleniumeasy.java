package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumeasy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//div//div//div[1]//div[2]//select[1]"));
		Select SelectElement=new Select(dropdown);
		List<WebElement>options=SelectElement.getOptions();
		System.out.println("options.size()");
		

	}

}
