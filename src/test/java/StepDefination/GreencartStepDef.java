package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GreencartStepDef {

	@Given("user is on the greencart page")
	public void user_is_on_the_greencart_page() {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	}

	@When("user search with short name")
	public void user_search_with_short_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("searched product should display")
	public void searched_product_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
