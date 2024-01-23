package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TiraTest
{ 
	@Test
	public void PerfumeTest()
	{
		WebDriver dc =new ChromeDriver();
		dc.manage().window().maximize();
		dc.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dc.get("https://www.tirabeauty.com/");
		WebElement searchtf = dc.findElement(By.id("search"));
		searchtf.sendKeys("Perfumes");
		searchtf.sendKeys(Keys.ENTER);
		
		
	}

}
