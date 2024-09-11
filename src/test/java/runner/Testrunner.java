package runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)@CucumberOptions(features = "classpath:Features/", glue = { "StepDefinitions" }, plugin = { "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true // ,dryRun=true
)
public class Testrunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Testrunner.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests passed successfully!");
		} else {
			System.out.println("Some tests failed.");
		}
	}
}
