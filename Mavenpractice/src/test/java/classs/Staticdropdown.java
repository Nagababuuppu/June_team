package classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement dropdown = driver.findElement(By.id("country"));

		Select sel = new Select(dropdown);

		sel.selectByIndex(9);

	}

}
