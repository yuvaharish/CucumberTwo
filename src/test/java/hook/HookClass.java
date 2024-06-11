package hook;



import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basePack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{
	
	@Before
	public void ontestStart() {
		System.out.println("Code will execute");
	}
	
	@After("@fail")
	public void ontestfinish(io.cucumber.java.Scenario sc) {
	System.out.println("code execuation completed");
	
	TakesScreenshot tk = (TakesScreenshot)driver;
	byte [] screenshot=tk.getScreenshotAs(OutputType.BYTES);
	sc.attach(screenshot, "image/png", "screen shot mobile");
	
	}

}
