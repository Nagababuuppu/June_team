package practice01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestImplicitwaitTimeout {

	public static void main(String[] args) {

		WebDriver driver =new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("hyr");
	}

}
