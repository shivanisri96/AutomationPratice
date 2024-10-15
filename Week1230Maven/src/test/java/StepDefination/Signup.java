package StepDefination;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
	

WebDriver driver;
	@Given("user is navigate the sign page")
	public void user_is_navigate_the_sign_page() {
	    driver = new ChromeDriver();
	    driver.get("https://automationexercise.com/login");
	    driver.manage().window().maximize();
	    
	}

	@When("user enter the name and email")
	public void user_enter_the_name_and_email() {
		
	    driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("shivani");
	    driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("shivani122@gmail.com");
	}

	@When("click the sign button")
	public void click_the_sign_button() {
	    driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
	}

	@Then("user navigate to the information page")
	public void user_navigate_to_the_information_page() {
		String act=driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
		String exp= "ENTER ACCOUNT INFORMATION";
	    assertEquals(act, exp);
	}




}
