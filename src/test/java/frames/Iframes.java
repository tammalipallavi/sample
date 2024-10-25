package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
	WebDriver driver;
	@Test
	public void defaultframe() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pallavi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("advaitha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
	}
	
	@Test
	public void nestediframe() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
	}
	
	@Test
	public void multipleframes() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);
		
		//sign up
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).submit();
		
		//login
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		
	}

	@Test
	public void nestedwithmultipleiframe() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("Admin@1234");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		
	}
	

}
