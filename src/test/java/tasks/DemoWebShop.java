package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop {
	WebDriver driver;
	@Test
	public void register() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("pallavi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("tammali");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ummer@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("advaita");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("advaita");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit' and@class='button-1 register-next-step-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @class='button-1 register-continue-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/books' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(4000);
		 WebElement quantity = driver.findElement(By.xpath("//tbody/descendant::input[@value='1']"));
		quantity.click();
		quantity.clear();
		Thread.sleep(2000);
		quantity.sendKeys("2");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		
	}
	
	public void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("pallavi123456@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("advaita");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//input[@type='button' and @class='button-1 register-continue-button']")).click();
		
	}
}
