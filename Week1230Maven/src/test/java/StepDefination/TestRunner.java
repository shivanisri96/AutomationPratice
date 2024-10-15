package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

//@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Week1230Maven\\src\\test\\resources\\FeaturesFile\\signup.feature" ,
@CucumberOptions(features=""
glue="StepDefination",
monochrome = true,

plugin={"html:src/test/resources/target/reports.html"})
public class TestRunner {
	
	
}