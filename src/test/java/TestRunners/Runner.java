package TestRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",

        glue = "StepDefinitions",

        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        tags = "@Monkey"

//        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {


}


/**
 * Reporting options in Cucumber:
 *
 * 1. pretty: Outputs in a readable format in the console (for a clean view).
 * 2. monochrome: Disables color output in the console for better readability.
 * 3. html:target/cucumber-reports/index.html: Generates an HTML report at this location.
 * 4. json:target/cucumber-reports/Cucumber.json: Generates a JSON report at this location.
 * 5. junit:target/cucumber-reports/Cucumber.xml: Generates a JUnit XML report at this location.
 * 6. com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: Uses ExtentReports for detailed, customizable test reports.
 **/