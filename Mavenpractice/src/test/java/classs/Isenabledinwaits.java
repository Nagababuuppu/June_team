package classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Isenabledinwaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));

		
		driver.findElement(By.id("enable-button")).click();
		
		WebElement enablebtn = driver.findElement(By.id("disable"));
		
		waits.until(ExpectedConditions.elementToBeClickable(enablebtn));
		
		System.out.println(enablebtn.isEnabled());
		

		
		

	}

}
