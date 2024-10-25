package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgressBar {
	WebDriver driver;
	@Test
	public void defaultBar() throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		 driver.findElement(By.xpath("//button[text()='Start']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Reset']")).click();
		 driver.close();
		 
		 
		
	}
	@Test
	
	public void withtimer() throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demoapps.qspiders.com/ui/progress/timer?sublist=1");
		 driver.findElement(By.xpath("(//input [@type='text'])[1]")).sendKeys("45");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[contains(@class,'green')]")).click();
		 Thread.sleep(6000);
		 driver.close();
		 
		 
		
	}

}
