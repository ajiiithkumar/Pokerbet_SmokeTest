package StepDefinitions;

import java.io.IOException;

import helperclass.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.ExtentTestManager;

public class hooks {

	@Before
    public void setUp(Scenario scenario) {
        ExtentTestManager.setTest(ExtentManager.getInstance().createTest(scenario.getName()));
        HelperClass.setUpDriver();
        
    }
	

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            //ExtentTestManager.logFail("Scenario Failed", driver);
            System.out.println("Scenario Failed !");
        } else {
            //ExtentTestManager.logPass("Scenario Passed", driver);
        	System.out.println("Scenario Passed !");
        }
        //HelperClass.tearDown();
        ExtentManager.getInstance().flush();
        ExtentTestManager.removeTest();
    }
}
    

    