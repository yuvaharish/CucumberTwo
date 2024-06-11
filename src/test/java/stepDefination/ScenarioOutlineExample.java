package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineExample {
	WebDriver driver;
	
	@Given("user open the chrome browser")
	public void user_open_the_chrome_browser() {
		driver = new ChromeDriver();
		   driver.manage().window().maximize();  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}
	@Given("user entering the ornhrm site name")
	public void user_entering_the_ornhrm_site_name() {
	    
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
	    
	}
	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		
		WebElement uName = driver.findElement(By.name("username"));
	    uName.sendKeys(string);
	    WebElement pWord = driver.findElement(By.name("password"));
	    pWord.sendKeys(string2);
	    
	}
	@When("click the login btn")
	public void click_the_login_btn() {
	    
		WebElement loginbtn = driver.findElement(By.cssSelector(".oxd-button"));
	    loginbtn.click();
	}
	@Then("user should be navigated to ornhrm Home page")
	public void user_should_be_navigated_to_ornhrm_home_page() {
		 String title = driver.getTitle();
		    System.out.println(title);
	    
	}
}
