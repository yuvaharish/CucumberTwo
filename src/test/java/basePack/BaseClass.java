package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver=null;
	
	
	public void browserLaunch() {
		driver = new ChromeDriver();
		
	}

}
