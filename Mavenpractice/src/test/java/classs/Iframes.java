package classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement iframe=driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame(iframe);
		
		WebElement  dropdown= driver.findElement(By.id("course"));
		
		Select sel =new Select(dropdown);
		
		sel.selectByIndex(1);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys("hello");
		
	}

}
