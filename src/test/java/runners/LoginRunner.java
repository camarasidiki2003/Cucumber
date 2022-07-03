package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
       //features = "src\\test\\java\\features\\TechfiosLogin.feature", // run the this particular url
	 features = "classpath:features", // run all the features in the project
		
		glue = "steps",
		//tags = "@Secenario1", // If you want to run a particular scenario out of many, just past the name here
		//tags = "@Regression",
		tags = "@Secenario1",
		monochrome = true,
		dryRun = false  , //dryRun = true shows the compilation run only
		plugin = {
				"pretty",
				"html:taget/cucumber",
				"json:target/cucumber.json",
		}
		
		)
public class LoginRunner {

}
