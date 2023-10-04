package classs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> data =driver.findElements(By.tagName("tr"));
		
		System.out.println(data.size());
		
//		for(WebElement dataa:data) {
//			System.out.println(dataa.getSize());
		}
	}


