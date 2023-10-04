package classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("name")).sendKeys("naga");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("naga@gmail.com");
		
		
		
	}

}
