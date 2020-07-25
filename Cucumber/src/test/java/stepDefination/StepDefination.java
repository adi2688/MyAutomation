package stepDefination;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*@RunWith(Cucumber.class)*/
public class StepDefination 
{
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page()
	{
		//System.out.println("Netbanking Page");	
	}

	@When("^user login ito application with username and password$")
	public void user_login_ito_application_with_username_and_password() 
	{
		System.out.println("user login ito application");		
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated() 
	{
		//System.out.println("Home Page Displayed");		
	}

	@And("^Cards are displayed$")
	public void Cards_are_displayed() 
	{
		//System.out.println("Cards are displayed");		
	}

	@When("^user login ito application following Datils$")
	public void user_login_ito_application_following_datils(DataTable datatable) throws Throwable 
	{
		//List<List<String>> objTable = datatable.asLists();
		
		List<Map<String, String>> objTable = datatable.asMaps();
		
		System.out.println(objTable.get(0).get("Username"));
		System.out.println(objTable.get(0).get("Password"));
		System.out.println(objTable.get(1).get("Username"));
		System.out.println(objTable.get(1).get("Password"));
	}
	
	 @When("^user login ito application With (.+) and (.+)$")
	    public void user_login_ito_application_with_and(String username, String password) throws Throwable 
	 {
	        System.out.println(username);
	        System.out.println(password);
	    }
}