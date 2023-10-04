package practice01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcalenders {

	public static void main(String[] args) throws ParseException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//			int day=15;
		
		// first calender
		
//		driver.findElement(By.id("first_date_picker")).click();
		
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='+day+']]")).click();
		
//		driver.findElement(By.id("second_date_picker")).click();
		
		String targetDate =" 30/Feb/2023";
		
		SimpleDateFormat targetDateFormat =new SimpleDateFormat("dd/MMM/yyyy");
		targetDateFormat.setLenient(false);
	   Date formattedTargetDate = targetDateFormat.parse(targetDate);
	   
	   System.out.println(formattedTargetDate);
	}

}
