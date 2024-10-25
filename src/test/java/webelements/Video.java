package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video {
	WebDriver driver;
	@Test
	public void defaultvideo() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/video");
		WebElement video = driver.findElement(By.xpath("//video[@src='/assets/videofile-PWMPKjmv.mp4']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].play()", video);
		Thread.sleep(10000);
		js.executeScript("arguments[0].pause()", video);
		Thread.sleep(2000);
		js.executeScript("arguments[0].play()", video);
		Thread.sleep(3000);
		js.executeScript("arguments[0].pause()", video);
		driver.close();
		


}

}
