package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest
{  
	@Test
	public void LaunchTest()
	{
		WebDriver dc =new ChromeDriver();
		dc.manage().window().maximize();
		dc.get("https://www.myntra.com/");
		String actualtitle = dc.getTitle();
		System.out.println(actualtitle);
	}

}
