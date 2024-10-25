package scroll;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll {
	WebDriver driver;
	@Test
	public void newtabVertical() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Open In New Tab")).click();
		Thread.sleep(3000);
		
		String parentid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if(!id.equals(parentid)) {
				driver.switchTo().window(id);
			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			WebElement accept = driver.findElement(By.xpath("//button[text()='Accept Our Policy']"));
				Actions actions =new Actions(driver);
				actions.scrollToElement(checkbox).perform();
				actions.click(checkbox).perform();
				actions.click(accept).perform();
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
		//doubt
		@Test
		public void framevertical() throws InterruptedException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/scroll/vertical");
			Thread.sleep(3000);
				WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
				WebElement accept = driver.findElement(By.xpath("//button[text()='Accept Our Policy']"));
					Actions actions =new Actions(driver);
					actions.scrollToElement(checkbox).perform();
					actions.click(checkbox).perform();
					actions.click(accept).perform();
					Thread.sleep(3000);
					driver.close();
				}
			
		
		
	}

			
		
			
		
		
		
		
	

