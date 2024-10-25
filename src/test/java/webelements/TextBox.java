package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TextBox {
	WebDriver driver;
	@Test
	public void withPlaceHolder() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions=new Actions(driver);
		WebElement placeholder = driver.findElement(By.xpath("//li[contains(text(),'With placeholder')]"));
		actions.moveToElement(placeholder).perform();
		driver.findElement(By.id("name")).sendKeys("pallavi");
		driver.findElement(By.id("email")).sendKeys("pallavi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Advaita");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}
	@Test
	public void withoutPlaceHolder() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions1=new Actions(driver);
		WebElement withoutplaceholder = driver.findElement(By.xpath("//li[contains(text(),'Without placeholder')]"));
		
		actions1.moveToElement(withoutplaceholder).perform();
		driver.findElement(By.id("name")).sendKeys("pallavi1");
		driver.findElement(By.id("email")).sendKeys("pallavi1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Advaita1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}

	@Test
	public void withToolTip() {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions2=new Actions(driver);
		WebElement tooltip = driver.findElement(By.xpath("//li[contains(text(),'With ToolTip')]"));

		actions2.moveToElement(tooltip).perform();
		driver.findElement(By.id("name")).sendKeys("pallavi1");
		driver.findElement(By.id("email")).sendKeys("pallavi1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Advaita1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
}
	
	
	
	
	@Test
	public void MultilineTextArea() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions actions2=new Actions(driver);
		WebElement multilinetextarea = driver.findElement(By.xpath("//li[contains(text(),'Multiline Text Area')]"));
        
		actions2.moveToElement(multilinetextarea).perform();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("pallavi1");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("pallavi1@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Advaita1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
}

	@Test
	public void disabled() {
		driver=new ChromeDriver();
		driver.get("");
}
	
}
