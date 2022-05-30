package weeek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.driver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("First Name");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Last Name");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
		
		WebElement eleddday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ddday = new Select(eleddday);
		ddday.selectByValue("19");
		
		WebElement eleddmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select ddmonth = new Select(eleddmonth);
		ddmonth.selectByValue("1");
		
		WebElement eleddyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ddyear = new Select(eleddyear);
		ddyear.selectByValue("1980");
		
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//h2[contains(text(),'Login')]
		
	
	}

}
