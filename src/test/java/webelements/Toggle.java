package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Toggle {
	@Test
	public void defaultToggle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		driver.findElement(By.xpath("(//span[contains(@class,'relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out')])[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[contains(@class,'relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(@class,'relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out')])[3]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[contains(@class,'relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out')])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("togglers")).click();
		
	}
	@Test
	public void disabledtoggle() throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/toggle/disabled?sublist=1");
			driver.navigate().refresh();
			 List<WebElement> fields = driver.findElements(By.xpath("//label[contains(@class,'inline-flex items-center cursor-not-allowed')]"));
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 for (WebElement options : fields) {
				 js.executeScript("arguments[0].removeAttribute('disabled')",options);
				 js.executeScript("arguments[0].click",options);
				 Thread.sleep(3000);
			 }
			 driver.findElement(By.id("togglers")).click();
				
			}
			
			
		
	}


