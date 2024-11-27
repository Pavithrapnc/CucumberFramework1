package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",glue="StepDefination"
,monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
