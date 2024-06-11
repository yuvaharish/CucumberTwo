package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basePack.BaseClass;
import hook.HookClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch extends BaseClass{
	
	
	@Given("user open the browser")
	public void user_open_the_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();  
	}
	@When("user enter the google.com")
	public void user_enter_the_google_com() {
	   driver.get("https://www.google.com/"); 
	     
	}
	@When("type the search term as {string}")
	public void type_the_search_term_as(String string) {
	    
		WebElement searchbar = driver.findElement(By.id("APjFqb"));
		searchbar.sendKeys(string);
		searchbar.submit();
	}
	@Then("user should see the search result for Mobile")
	public void user_should_see_the_search_result_for_mobile() {
	    String title = driver.getTitle();
	    System.out.println(title);
	     
	}

}
