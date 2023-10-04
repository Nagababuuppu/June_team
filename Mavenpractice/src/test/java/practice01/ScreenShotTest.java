package practice01;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.internal.ThrowableUtil;

public class ScreenShotTest {

	public static void main(String[] args) throws Throwable {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationstepbystep.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./target/demo.png");
		
        FileUtils.copyFile(source,destination);
	}

}
