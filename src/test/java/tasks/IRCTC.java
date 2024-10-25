package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IRCTC {
	WebDriver driver;
	@Test
	public void register() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//li[@role='option']/../descendant::li[contains(@class,'ng-tns-c57-8 ui-autocomplete-list-item ui-corner-all ng-star-inserted')]")).click();
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//li[@role='option']/../descendant::span[@class='ng-star-inserted']")).click();
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");
		//Thread.sleep(2000);

}
}
