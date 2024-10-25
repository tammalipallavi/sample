package dateNTimePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	@Test
	public void simpledatepicker() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		driver.findElement(By.xpath("(//*[name()='svg' and @stroke='currentColor'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015 react-datepicker__day--keyboard-selected react-datepicker__day--today']")).click();
		
}
	@Test
	public void dropdowndatepicker() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/datePick/datedropdown?sublist=1");
		driver.findElement(By.xpath("//*[name()='svg' and @stroke='currentColor' and@viewBox='0 0 1024 1024']")).click();
		
		
		//WebElement yeardd = driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']"));
		//Select select1=new Select(yeardd);
		//select1.selectByVisibleText("2024");
		
		//WebElement monthdd = driver.findElement(By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']"));
		//Select select=new Select(monthdd);
		//select.selectByVisibleText("Aug");
		driver.findElement(By.xpath("//div[text()='2']")).click();
	}

}
