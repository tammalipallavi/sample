package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Notifications {
	
WebDriver driver;
	@Test
	public void defaultnotification() {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.findElement(By.xpath("//button[@id='browNotButton']")).click();

}

}
