package practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowserMaximization  {

	public static void main(String[] args) throws Exception{

//		way 1
//		chrome
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/watch?v=h1Mj-V_onP8&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=20");
		
		
		// firefox
		
//		WebDriver driver =new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/watch?v=h1Mj-V_onP8&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=20");
		
		//edge
//		WebDriver driver =new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/watch?v=h1Mj-V_onP8&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=20");
		
//		way  2  chrome 
//		ChromeOptions options= new ChromeOptions();
//		options.addArguments("start-maximized");
//		WebDriver driver =new ChromeDriver();
//		Thread.sleep(3000);
//		driver.get("https://www.facebook.com/");
		
//		way  2  edge
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver =new EdgeDriver(options);
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
