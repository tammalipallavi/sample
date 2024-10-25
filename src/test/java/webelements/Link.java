package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {
	WebDriver driver;
	@Test
	public void defaultlink() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		List<WebElement> countalllinks = driver.findElements(By.tagName("a"));
		int size=countalllinks.size();
		for(int i=0;i<size;i++) {
			System.out.println(countalllinks);
			//countalllinks.get(i).click();
		}

}
	@Test
	public void linkinnewtab() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1");
		List<WebElement> countalllinks = driver.findElements(By.tagName("a"));
		int size=countalllinks.size();
		for(int i=0;i<size;i++) {
			System.out.println(countalllinks);
		}
		

}

}
