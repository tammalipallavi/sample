package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authentication {
	WebDriver driver;
	@Test
	public void defaultAuthenticpopup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
		
        driver.navigate().to("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
        Thread.sleep(3000);
        
}

}
