package classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Changetextinwaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.findElement(By.id("populate-text")).click();
		
		WebElement changetext = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
		
		waits.until(ExpectedConditions.visibilityOf(changetext));
//		driver.findElement(By.className("target-text")).clear();
		changetext.isDisplayed();
		System.out.println(changetext.isDisplayed());
		
//		driver.findElement(By.className("target-text")).sendKeys("selenium");

	}

}
