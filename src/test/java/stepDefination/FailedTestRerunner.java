package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FailedTestRerunner {

	@Given("test the failed test")
	public void test_the_failed_test() {
		Assert.assertTrue(true);
		System.out.println("Failed");
	}

	@When("test the pass test")
	public void test_the_pass_test() {
		Assert.assertTrue(true);
		System.out.println("pass");
	}

}
