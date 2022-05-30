package weeek2.day1;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("10088");		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("682");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2084048682-207-3636");
		   

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		
		String firstLead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).getText();
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/parent::div//input")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		//String expMsg = ;
		String actMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(actMsg);
		String expMsg = "No records to display";
		
		
		
	if(actMsg.equals(expMsg))
	//		if(actMsg == "No records to display")
		{
			System.out.println("hhhhh");
			System.out.println("Deletion of Records is succesfull");
		}
		else
			System.out.println("Record deletion Unsuccesfull");
		

	}

}
