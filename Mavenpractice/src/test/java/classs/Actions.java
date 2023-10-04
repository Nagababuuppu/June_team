package classs;

import java.time.Duration;


import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	
    
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogsp	ot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		Thread.sleep(2000);
		

	

	}

}
