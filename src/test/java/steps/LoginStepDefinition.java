package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;
import sun.security.util.Password;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	
	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		initDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/s");

	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage =PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		
		
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage =PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterPassword(password);
		
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage =PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickSignInButton();
		
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling",loginPage.getPageTitle());

		

	}

}
