package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features", glue = {"Leaft_StepDefination"}, monochrome = true,  
plugin = { "json:target/cucumber.json", 
    "pretty",
    "html:target/HtmlReports/default-cucumber-reports", //generates every time we run the cukes runner
    "json:target/JSONreport/cucumber.json",  // thats just naming the report
    "junit:target/JUNITreport/cucumber.xml"

}, tags = "@Run" )

public class TestLeaftRunner {
	

}
