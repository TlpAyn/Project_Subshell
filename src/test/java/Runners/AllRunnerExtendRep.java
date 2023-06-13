package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, // buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"} ,  // Step definitions ın klasörü yazılıyor.
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class AllRunnerExtendRep extends AbstractTestNGCucumberTests {
}