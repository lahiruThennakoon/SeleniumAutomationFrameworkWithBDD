import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/lahiruthennakoon/IdeaProjects/SeleniumAutomationFrameworkWithBDD/src/test/java/Features",plugin = {"pretty","html:target/htmlReports/report.html"})
public class TestRunner {
}
