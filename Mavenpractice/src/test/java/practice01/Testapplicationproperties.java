package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testapplicationproperties {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		url 
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("current url -"+currentUrl);
//		
////		Title
//		String title= driver.getTitle();
//		System.out.println("Title -"+title);
//		
//		
		// html page source 
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
//		driver.quit();
		
		// 
	}
}
