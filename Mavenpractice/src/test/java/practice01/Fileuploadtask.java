package practice01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadtask {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.filemail.com/share/upload-file");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[text()='Add Files']")).click();
		
		Robot rb=new Robot();
		
		rb.delay(3000);
		
		StringSelection path= new StringSelection("C:\\Users\\user\\Desktop\\folder\\9 tips for writing good test cases.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, path);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
