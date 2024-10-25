package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormValidation {
@Test

public void defaultformvalidation() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
	WebElement required = driver.findElement(By.xpath("//input[@placeholder='Type something']"));
	required.sendKeys("pallavi");
	WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pwd.sendKeys("advaita");
	WebElement retypepwd = driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']"));
	retypepwd.sendKeys("advaita");
	WebElement email  = driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']"));
	email.sendKeys("tammali.pallavi@gmail.com");
	
	WebElement url = driver.findElement(By.xpath("//input[@placeholder='URL']"));
	url.sendKeys("www.gmail.com");
	WebElement digits  = driver.findElement(By.xpath("//input[@placeholder='Enter only digits']"));
	digits.sendKeys("12345");
	WebElement numbers = driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']"));
	numbers.sendKeys("12345678");
	WebElement alphanumeric  = driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']"));
	alphanumeric.sendKeys("123abc");
	WebElement minlength = driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']"));
	minlength.sendKeys("asdfghj");
	WebElement maxlength = driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']"));
	maxlength.sendKeys("asdfgh");
	WebElement Rangelength = driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']"));
	Rangelength.sendKeys("asdfghj");
	WebElement minvalue = driver.findElement(By.xpath("//input[@placeholder='Min value is 6']"));
	minvalue.sendKeys("7");
	WebElement maxvalue = driver.findElement(By.xpath("//input[@placeholder='Max value is 6']"));
	maxvalue.sendKeys("5");
	WebElement rangevalue = driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']"));
	rangevalue.sendKeys("34");
	WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	submit.click();
	driver.close();
	
}
}
