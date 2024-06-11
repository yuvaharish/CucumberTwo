package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundExample {
	
	@Given("the student finished high school")
	public void the_student_finished_high_school() {
	    
	   System.out.println("the_student_finished_high_school");
	}
	@Given("the student finished high secondary school")
	public void the_student_finished_high_secondary_school() {
	    System.out.println("the_student_finished_high_secondary_school");
	   
	}
	@Given("the student applied for the medicine course")
	public void the_student_applied_for_the_medicine_course() {
	    System.out.println("the_student_applied_for_the_medicine_course");
	   
	}
	@When("the student cleared the enterance exame")
	public void the_student_cleared_the_enterance_exame() {
	    
	   System.out.println("the_student_cleared_the_enterance_exame");
	}
	@Then("the student is eligible for joing medicine")
	public void the_student_is_eligible_for_joing_medicine() {
	    System.out.println("the_student_is_eligible_for_joing_medicine");
	   
	}

	@Given("the student applied for the enginnering course")
	public void the_student_applied_for_the_enginnering_course() {
	    System.out.println("the_student_applied_for_the_enginnering_course");
	}
	@When("the student has a cutoff mark")
	public void the_student_has_a_cutoff_mark() {
	    System.out.println("the_student_has_a_cutoff_mark");
	}
	@Then("the student is eligible for joing enginnering")
	public void the_student_is_eligible_for_joing_enginnering() {
	    System.out.println("the_student_is_eligible_for_joing_enginnering");
	}


}
