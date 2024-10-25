package dateNTimePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TimePicker {
	WebDriver driver;
	@Test
	public void clock() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/timePick?sublist=0");
		WebElement clock = driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']"));
		clock.click();
		WebElement am = driver.findElement(By.xpath("(//li[contains(@class,'MuiMenuItem')])[25]"));
		am.click();
	}
	@Test
	public void timepickerclock() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/timePick/timeClock?sublist=1");
		driver.findElement(By.xpath("//input[@placeholder='hh:mm aa']")).click();
		String reqHour="5";
		String reqMins="30";
		String meridium="AM";
		
		WebElement hour = driver.findElement(By.xpath("//div[@class='MuiClock-clock css-eziifo']//span[@class='MuiClockNumber-root css-1flhz3h' and text()=' "+reqHour+"']"));
		Actions ac=new Actions(driver);
		ac.click(hour).perform();
		
		WebElement min = driver.findElement(By.xpath("//div[@class='MuiClock-clock css-eziifo']//span[@class='MuiClockNumber-root css-1flhz3h' and text()='"+reqMins+"']"));
		ac.click(min).perform();
		
		WebElement meri = driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-subtitle2 MuiTimePickerToolbar-ampmLabel MuiPickersToolbarText-root Mui-selected css-n4qtc0' and text()='"+meridium+"']"));
		ac.click(meri).perform();
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase') and text()='OK']")).click();
		
				
}
}
