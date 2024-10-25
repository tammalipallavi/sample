package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindow {
	WebDriver driver;
	@Test
	public void newwindow() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.linkText("Open in new window")).click();
		String parentid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String cid : ids) {
			if(!cid.equals(parentid)) {
				driver.switchTo().window(cid);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavi@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pallavi");
				driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("pallavi");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.quit();
				
				}
			
		}
	}
	@Test
	public void newtab() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='browserButton4']")).click();
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/SignUpPage");
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pallavi@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pallavi");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("pallavi");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
	}
			
	@Test
	public void multiplewindow() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
	}
	@Test
	public void multipletabs() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	}

}
