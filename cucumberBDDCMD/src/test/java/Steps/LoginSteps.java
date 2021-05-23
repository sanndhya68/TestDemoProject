package Steps;

import cucumber.api.java.en.*;

public class LoginSteps
{


@Given("^user caluculate (\\d+)/(\\d+)$")
public void user_caluculate(int arg1, int arg2) throws Throwable
{
	int i=1/0;
	System.out.println(i);
}

@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
}

@When("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
}

@When("^click on login buttomn$")
public void click_on_login_buttomn() throws Throwable {
}

@Then("^user is navigate to home page$")
public void user_is_navigate_to_home_page() throws Throwable {
}

@Given("^user is in login page$")
public void user_is_in_login_page() throws Throwable {
}

@When("^user enters invalid username and password$")
public void user_enters_invalid_username_and_password() throws Throwable {
}

@When("^click on login button on this npage$")
public void click_on_login_button_on_this_npage() throws Throwable {
}

@Then("^error validations messgae is displayed$")
public void error_validations_messgae_is_displayed() throws Throwable {
}


}
