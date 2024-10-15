package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Background;

public class Multipal {
	
	WebDriver driver;
	//Background steup
	@Before
	public void setups() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	 
	@After
	public void close() {
		driver.close();
	}
	
		@Given("User is navigated to the signup page")
		public void user_is_navigated_to_the_signup_page() {
		    driver.get("https://automationexercise.com/login");
		}

		@When("click on signup Button")
		public void click_on_signup_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("user enter the <fullname>and <emailid>")
		public void user_enter_the_fullname_and_emailid() {
		   
		}

		@When("click on the signup button")
		public void click_on_the_signup_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("user should navigate to the information page with  valid data")
		public void user_should_navigate_to_the_information_page_with_valid_data() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}




	}


