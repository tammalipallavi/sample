package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button {
	WebDriver driver;
	@Test
	public void defaultclick() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button1 = driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[1]"));
		WebElement button2 = driver.findElement(By.xpath("(//button[contains(text(),'No')])[2]"));
		WebElement button3 = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
		
		Actions actions=new Actions(driver);
		actions.click(button1).perform();
		actions.click(button2).perform();
		actions.click(button3).perform();
	}

	
	@Test
	public void Rightclick() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button1 = driver.findElement(By.xpath("(//button[contains(text(),'Right Click')])[1]"));
		WebElement button2 = driver.findElement(By.xpath("(//button[contains(text(),'Right Click')])[2]"));
		WebElement button3 = driver.findElement(By.xpath("(//button[contains(text(),'Right Click')])[3]"));
		
		
		Actions actions=new Actions(driver);
		actions.contextClick(button1).perform();
		actions.contextClick(button2).perform();
		actions.contextClick(button3).perform();
}
	
	@Test
	public void doubleclick() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button1 = driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[1]"));
		WebElement button2 = driver.findElement(By.xpath("(//button[contains(text(),'No')])[2]"));
		WebElement button3 = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
		
		
		Actions actions=new Actions(driver);
		actions.doubleClick(button1).perform();
		actions.doubleClick(button2).perform();
		actions.doubleClick(button3).perform();
}
	
	
	@Test
	public void submit() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[9]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();	
	}
	
	@Test
	public void disabled() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button1 = driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[1]"));
		
		//use jse
	}
}
