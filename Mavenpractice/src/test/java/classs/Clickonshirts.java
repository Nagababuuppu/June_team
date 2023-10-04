package classs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonshirts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.meesho.com"); 
		
		
		WebElement men= driver.findElement(By.xpath("//input[@class='sc-dEVLtI eEPmTw sc-dkcEsn hYyEwD search-input-elm sc-dkcEsn hYyEwD search-input-elm']"));
		
		men.sendKeys("shirts");
		
		men.click();
		
		Thread.sleep(3000);
		
		List<WebElement>dropdown=driver.findElements(By.xpath("//div[@class='//input[@class='sc-dEVLtI eEPmTw sc-dkcEsn hYyEwD search-input-elm sc-dkcEsn hYyEwD search-input-elm']"));

		

	}

}
