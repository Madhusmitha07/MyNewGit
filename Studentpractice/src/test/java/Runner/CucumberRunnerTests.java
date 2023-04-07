package Runner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
features = "src/test/resources/features/tags.feature", 
glue = { "Gluecode"},
plugin={"pretty","html:target/cucumber_reports/cucumber.html","rerun:target/Failedscenario.txt",
		"junit:target/junitreport.xml","json:target/jsonreport.json"},

publish=true,

tags= "")
 

//https://stackoverflow.com/questions/41034116/how-to-execute-cucumber-feature-file-parallel
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
 
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
}