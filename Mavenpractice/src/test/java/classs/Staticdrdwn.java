package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdrdwn {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdown);
//		sel.selectByVisibleText("Software");
//		sel.selectByValue("search-alias=shoes");
	     sel.selectByIndex(1);
	     
	}

}
