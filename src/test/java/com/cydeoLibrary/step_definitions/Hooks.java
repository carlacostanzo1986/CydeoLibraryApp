package com.cydeoLibrary.step_definitions;


import com.cydeoLibrary.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre and post conditions to each scenario and each step
 */
public class Hooks {

    //import from io.cucumber.java not from junit
    // @Before
    public void setupsScenario() {
        System.out.println("======Setting up browser using cucumber @before");
    }

    // @Before ("@login")
    public void setupsScenarioForLogins() {
        System.out.println("======this will only apply to sceanarios with @login tag");
    }

    // @Before ("@db")
    public void setupsForDatabaseScenarios() {
        System.out.println("======this will only apply to sceanarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {
       if(scenario.isFailed()) {
           byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot, "image/png", scenario.getName());
       }
       // BrowserUtils.sleep(5);
        Driver.closeDriver();
       
        // System.out.println("==========Closing browser using cucumber @After");
        //System.out.println("==========Scenario ended / Take screenshot if failed");

    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("---------------> applying setup using @BeforeSetup");

    }

    //@AfterStep
    public void afterStep() {
        System.out.println("-------------->applying tearDown using @AfterStep");
    }

}
