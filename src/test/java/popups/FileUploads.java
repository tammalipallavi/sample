package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploads {
	WebDriver driver;
	@Test
	public void defaultfileupload() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement fileinput = driver.findElement(By.xpath("//input[@id='fileInput']"));
		fileinput.sendKeys("C:\\Users\\mtamm\\OneDrive\\Documents");
	}
	@Test
	public void custombutton() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		WebElement upload = driver.findElement(By.xpath("//div[text()='Upload File']"));
		upload.click();
		//doubt
		WebElement fileinput = driver.findElement(By.xpath("//input[@id='fileInput']"));
		fileinput.sendKeys("C:\\Users\\mtamm\\OneDrive\\Documents");
	}
		
		
	
	public void dragndrop() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/drag?sublist=2");
		driver.findElement(By.xpath("")).click();
		
	}
	public void multipleselect() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		driver.findElement(By.xpath("")).click();
		
	}
}
