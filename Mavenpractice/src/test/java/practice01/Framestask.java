package practice01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framestask {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement frame=driver.findElement(By.id("frm2"));

		driver.switchTo().frame(frame);

		driver.findElement(By.id("firstName")).sendKeys("naga");

		driver.findElement(By.id("lastName")).sendKeys("babu");

		driver.findElement(By.id("malerb")).click();

		driver.findElement(By.id("englishchbx")).click();

		driver.findElement(By.name("email")).sendKeys("nagababu88@gmail.com");

		driver.findElement(By.id("password")).sendKeys("naga123");

		driver.switchTo().defaultContent();

		driver.findElement(By.id("name")).sendKeys("nagababu");

	}
}
