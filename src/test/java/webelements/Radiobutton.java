package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobutton {
	@Test
	public void defaultradiobutton() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Upi']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='home']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
	}

}
