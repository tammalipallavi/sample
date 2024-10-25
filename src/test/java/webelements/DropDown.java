package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	WebDriver driver;
	
	@Test
	public void ssDropDown() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		WebElement ssdd = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[2]"));
		Select select =new Select(ssdd);
		select.selectByVisibleText("Female");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[3]"));
		Select select1 =new Select(country);
		select1.selectByVisibleText("India");
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[4]"));
		Select select2 =new Select(state);
		select2.selectByVisibleText("Telangana");
		Thread.sleep(3000);
		
		WebElement city= driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[5]"));
		Select select3 =new Select(city);
		select3.selectByVisibleText("Hyderabad");
		Thread.sleep(3000);
		
		WebElement quantity = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[6]"));
		Select select4 =new Select(quantity);
		select4.selectByVisibleText("3");
		Thread.sleep(3000);
		
		driver.findElement(By.id("continuebtn")).click();
		driver.close();
	}

		@Test
	
	public void multiselectDropDown() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("keypoint")).sendKeys("9876543210");
		WebElement msdd = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[2]"));
		Select select =new Select(msdd);
		select.selectByVisibleText("Female");
		
		WebElement country = driver.findElement(By.xpath("(//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiNativeSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-h8h8y')])[1]"));
		Select select1 =new Select(country);
		
		select1.selectByVisibleText("Germany");
		select1.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.xpath("(//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiNativeSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-h8h8y')])[2]"));
		Select select2 =new Select(state);
		select2.selectByVisibleText("Tamil Nadu");
		select2.selectByVisibleText("Sikkim");
		select2.selectByVisibleText("Uttarakhand");
		
		WebElement city= driver.findElement(By.xpath("(//select[contains(@class,'MuiNativeSelect-select MuiNativeSelect-outlined MuiNativeSelect-multiple MuiInputBase-input MuiOutlinedInput-input css-h8h8y')])[3]"));
		Select select3 =new Select(city);
		select3.selectByVisibleText("North Sikkim");
		select3.selectByVisibleText("south Sikkim");
		select3.selectByVisibleText("east Sikkim");
		select3.selectByVisibleText("west Sikkim");
		select3.selectByVisibleText("Karur");
		select3.selectByVisibleText("Uttarkashi");
		
		WebElement quantity = driver.findElement(By.xpath("(//select[contains(@class,'placeholder')])[3]"));
		Select select4 =new Select(quantity);
		select4.selectByVisibleText("3");
		
		driver.findElement(By.id("continuebtn")).click();
		driver.close();
	}

		

@Test

public void searchwithselectDropDown() {
	driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
}

