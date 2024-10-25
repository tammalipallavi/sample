package others;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print {
	WebDriver driver;
	@Test
	public void print1() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/print?sublist=0");
		driver.findElement(By.xpath("//button[text()='Print this out!']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if(!id.equals(parentid)) {
				driver.switchTo().window(id);
		
		driver.findElement(By.xpath("//span[text()='Print']")).click();
			}
	
		}

}
}
