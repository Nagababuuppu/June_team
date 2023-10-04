package practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElementProperties {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		System.out.println(driver.findElement(By.name("commit")).getTagName());
		
		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));		
		
	}
}
