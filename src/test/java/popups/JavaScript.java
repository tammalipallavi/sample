package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
	WebDriver driver;
	@Test
	public void defaultalert() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		WebElement alertbox = driver.findElement(By.xpath("//button[@id='buttonAlert2']"));
		alertbox.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		driver.close();
		
		
		
		
	}
	
	@Test
	public void alert() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		WebElement alertbox = driver.findElement(By.xpath("//button[contains(text(),'Confirm ')]"));
		alertbox.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		driver.close();
		
	}
	@Test
	public void prompttalert() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
		alertbox.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.sendKeys("yes");
		a.accept();
		driver.close();
		
}
}
