package webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	@Test
	public void StaticWebTable() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table");
		String coldata=driver.findElement(By.xpath("//td[text()='4.5 Star']")).getText();
		System.out.println(coldata);
		List<WebElement> tHead = driver.findElements(By.xpath("//table[contains(@class,'w-full text-sm text-left text-gray-500 ')]/thead/tr/th"));
		for (WebElement list : tHead) {
			System.out.println(list.getText()+  "\t");
			
		}
		System.out.println();
		List<WebElement> tBody = driver.findElements(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 ']/tbody"));
		for (WebElement listdata : tBody) {
			System.out.println(listdata.getText()+  "\t");
			
		}
		
	}
	
	@Test
	public void dynamicwebtable() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		String coldata=driver.findElement(By.xpath("//th[text()='Apple iPhone']/../td[4]")).getText();
		System.out.println(coldata);
		List<WebElement> tHead = driver.findElements(By.xpath("//table[contains(@class,'w-full text-sm text-left text-gray-500 h-64')]/thead/tr/th"));
		for (WebElement list : tHead) {
			System.out.println(list.getText()+  "\t");
			
		}
		System.out.println();
		List<WebElement> tdynBody = driver.findElements(By.xpath("//table[contains(@class,'w-full text-sm text-left text-gray-500 h-64')]/tbody/tr"));
		for (WebElement listdata : tdynBody) {
			System.out.println(listdata.getText()+  "\t");
			
		}
		
	}
	@Test
	public void tablepagenation() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table/tablePagination");
		String hprating=driver.findElement(By.xpath("")).getText();
		System.out.println(hprating);
		 List<WebElement> pages = driver.findElements(By.xpath("//li[contains(@class,'cursor-pointer bg-orange-500 text-white px-3 py-1 rounded')]"));
	}
		

}
