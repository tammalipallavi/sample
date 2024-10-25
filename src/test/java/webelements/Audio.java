package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Audio {
	WebDriver driver;
	@Test
	public void defaultAudio() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/audio");
		WebElement audio = driver.findElement(By.xpath("//audio[@src='/assets/audiofile-zzjK-tOl.mp3']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].play()",audio);
		Thread.sleep(5000);
		js.executeScript("arguments[0].pause()",audio);
		Thread.sleep(2000);
		driver.close();
	}


}


