package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDrop {
	
	@Test
	public void defaultdragndrop() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=0");
		
		
	}
	
	@Test
	public void dragposition() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		WebElement mobcharger = driver.findElement(By.xpath("(//div[@class='draggable'])[1]"));
		Thread.sleep(3000);
		WebElement dropcolumn = driver.findElement(By.xpath("//div[contains(@class,'drop-column  min-h-[200px] bg-slate-100')]"));
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.dragAndDrop(mobcharger, dropcolumn).perform();
		//WebElement mobcover = driver.findElement(By.xpath("(//div[@class='draggable'])[3]"));
		//WebElement dropcolumn1 = driver.findElement(By.xpath("//div[contains(@class,'drop-column  min-h-[200px] bg-slate-100')]"));
		//Actions actions1=new Actions(driver);
		//actions1.dragAndDrop(mobcover, dropcolumn1).perform();
		Thread.sleep(3000);
		WebElement laptopcharger = driver.findElement(By.xpath("(//div[@class='draggable'])[2]"));
		WebElement dropcolumn2 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(laptopcharger, dropcolumn2).perform();
		
		Thread.sleep(3000);
		WebElement laptopcover = driver.findElement(By.xpath("(//div[@class='draggable'])[4]"));
		WebElement dropcolumn3 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		Actions actions3=new Actions(driver);
		actions3.dragAndDrop(laptopcover, dropcolumn3).perform();
		
	}
	@Test
	
	public void dragmultiple() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
          Actions a1=new Actions(driver);
		
		WebElement [] laptop= {
		driver.findElement(By.xpath("//div[contains(text(),'Laptop Cover')]")),
		
		driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]"))
		};
		
		WebElement [] mobile= {
       driver.findElement(By.xpath("//div[contains(text(),'Mobile Cover')]")),
		
		driver.findElement(By.xpath("//div[contains(text(),'Mobile Charger')]"))
		};
		
		WebElement column1=driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[1]"));
		WebElement column2=driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[2]"));
		

		
	}

}
