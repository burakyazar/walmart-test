package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"}, glue = {"stepDefinition"},
                      tags = "", monochrome = true, dryRun = false,
                        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class MainRunner extends AbstractTestNGCucumberTests {


}
//runner
