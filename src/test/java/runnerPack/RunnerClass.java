package runnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\jacki\\eclipse-workspace\\April 2024\\CucucmberLearning\\src\\test\\resources\\Feature\\"},
glue = {"stepDefination","hook"},dryRun = false,tags = "@somke",
plugin ={"html:report/webReport.html","rerun:target/rerun.txt","json:report/jsonreport.json"}  )
public class RunnerClass {

}
