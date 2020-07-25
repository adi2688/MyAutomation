package cucumberOptions;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/java/features",
		glue= "stepDefination",tags="@SmokeTest",
		plugin= {"pretty","html:target/test.html","junit:target/cukes.xml"})

public class TestRunner {

}