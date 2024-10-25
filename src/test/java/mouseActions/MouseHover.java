package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	WebDriver driver;
	@Test
	public void icon() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		WebElement pwdTF = driver.findElement(By.xpath("//input[@type='password']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(pwdTF);
		pwdTF.sendKeys("P@llavi1");
		
		WebElement image = driver.findElement(By.xpath("//img[contains(@class,'w-6 h-6 mt-4 absolute ml-72 cursor-pointer')]"));
		Actions actions1=new Actions(driver);
		actions1.moveToElement(image);
		image.click();
	}
		@Test
		public void image() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=1");
			
			
			
			
			
		}

		@Test
		public void Ratings() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
			//doubt
			//WebElement ratings = driver.findElement(By.xpath(""));
			Actions actions=new Actions(driver);
			//actions.moveToElement(ratings);
			WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
			actions.moveToElement(description);
			description.sendKeys("product is good");
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			
}
		
	@Test
	public void tab() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		WebElement kids = driver.findElement(By.xpath("//li[contains(@class,'kids p-4 relative')]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(kids);
		
	}
	
}
