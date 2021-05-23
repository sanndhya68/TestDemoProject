package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions
(
		features="src/test/resources/Features" , monochrome = true,
		glue= {"Steps"},
		plugin= {"json:target/cucumber.json"}
		// the above line is for cucumber reprots and below for other junit adn html reports which is also workking fine
//		plugin= {"pretty","junit:target/JUnitsReports/report.xml",
//				"json:target/JSONReports/report.json",
//				"html:target/HtmlReports"}
//		
		)


public class TestRunner {

}


