package others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElement {
WebDriver driver;
@Test
public void defaultstaleelement() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/stale?sublist=0&scenario=1");
	driver.findElement(By.linkText("Click here to enter some text")).click();
	driver.findElement(By.xpath("//input[@placeholder='enter text']")).sendKeys("abc");
}
}
