package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Image {
	WebDriver driver;
	@Test
	public void defaultimage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/image?sublist=0");
		driver.findElement(By.xpath("//img[@src='/assets/orderPlaced-fB7gNxPF.jpg']")).click();

}
	@Test
	public void broken() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
		driver.findElement(By.xpath("")).click();

}
	
	@Test
	public void linkimage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/image/linkImage?sublist=2");
		driver.findElement(By.linkText("//img[@src='/assets/men-TXh4fRVF.jpg']")).click();

}
	@Test
	public void images() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
		driver.findElement(By.xpath("")).click();

}
	@Test
	public void withoutimgtag() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
		driver.findElement(By.xpath("")).click();

}
}
