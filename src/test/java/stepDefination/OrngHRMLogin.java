package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrngHRMLogin {
	WebDriver driver;
	
	@Given("user open the browser2")
	public void user_open_the_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();  
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("user entering the URL")
	public void user_entering_the_url() {
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	/*
	 * @When("user enter the valid userName and password") public void
	 * user_enter_the_valid_user_name_and_password() {
	 * 
	 * 
	 * }
	 */
	@When("click the login button")
	public void click_the_login_button() {
	    WebElement loginbtn = driver.findElement(By.cssSelector(".oxd-button"));
	    loginbtn.click();
	}
	@Then("user should be navigated to Home page")
	public void user_should_be_navigated_to_home_page() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}
	
	/*
	 * @When("user enter the valid {string} and {string}") public void
	 * user_enter_the_valid_and(String string, String string2) { WebElement uName =
	 * driver.findElement(By.name("username")); uName.sendKeys(string); WebElement
	 * pWord = driver.findElement(By.name("password")); pWord.sendKeys(string2); }
	 */
	
	@When("user enter the valid userName and passWord")
	public void user_enter_the_valid_user_name_and_pass_word(io.cucumber.datatable.DataTable dataTable) {
		
		String userName = dataTable.cell(0, 0);
		String passWord = dataTable.cell(1, 1);
		WebElement uName = driver.findElement(By.name("username"));
	    uName.sendKeys(userName);
	    WebElement pWord = driver.findElement(By.name("password"));
	    pWord.sendKeys(passWord);
		
	}
}
