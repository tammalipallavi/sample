package keyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VirtualKeyBoard {
	WebDriver driver;
	@Test
	public void notarobotcaptcha() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/virtual?sublist=0");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavi@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[name()='svg' and @viewBox='0 0 24 24'])[1]")).click();
	    //doubt
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='a']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='d']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='v']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='a']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='i']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='t']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='a']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='hg-button hg-functionBtn hg-button-enter']")).click();
	
	
	
	
	
	
	
	
	
	}
}
