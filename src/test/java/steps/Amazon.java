package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	
WebDriver driver;


@Given("I open the amazon page")
public void i_open_the_amazon_page() {
	driver.get("https://www.amazon.in/");
}



@When("I click on signin button")
public void I_click_on_signin_button() {
	driver.findElement(By.linkText("Sign in")).click();
}

@Then("I Signin  using emailid and password")
public void I_Sigin_using_emailid_and_password(String emailid, String password){
		driver.findElement(By.id("ap_email")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
	}


@Then("I click on submit button")
public void i_click_on_submit_button() {
	driver.findElement(By.id("signInSubmit")).click();
}

@Then("I start searching item")
public void I_start_searching_item() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Shirts");
	driver.findElement(By.id("twotabsearchtextbox")).submit();
	
}

@Then("now i click on searched item")
public void now_i_click_on_searched_item() {
	driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
}

@Then("i add the item to wishlist for further booking")
public void i_add_the_item_to_wishlist_for_further_booking() {
	driver.findElement(By.id("wishlistButtonStack")).click();
}

@Then("i close the browser")
public void i_close_the_browser() {
    driver.close();
}

}
