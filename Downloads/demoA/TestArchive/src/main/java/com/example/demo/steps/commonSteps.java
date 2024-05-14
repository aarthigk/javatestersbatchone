package com.example.demo.steps;
import com.example.demo.base.TestBase;
import com.example.demo.page.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;

public class commonSteps extends TestBase {
    HomePage hp;
    private static final Logger logger = LoggerFactory.getLogger(commonSteps.class);

    @Given("the user opens a browser")
    public void openBrowser() {
        setBrowser();

    }

    //new this gets called and opens google
     @When("the user navigates to {string}")
     public void navigateTo(String engine) {
        // Code to navigate to the specified URL
         hp = new HomePage(driver);
         hp.navigatetoGoogle(driver,engine);
       }

    @Then("user should see an {string}")
    public void user_should_see_an(String string) {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    }


    private Response response;

    @Given("the Petstore API is accessible")
    public void petstoreApiAccessible() {
        // No additional setup needed for RestAssured
    }

    @When("a request is made to the {string} endpoint with the status parameter set to {string}")
    public void makeApiRequest(String endpoint, String status) {
        response = RestAssured.given()
                .param("status", status)
                .when()
                .get("https://petstore.swagger.io/v2/pet/" + endpoint);
    }

    @Then("the response status code should be {int}")
    public void verifyResponseStatusCode(int expectedStatusCode) {

        response.then().statusCode(expectedStatusCode);
        System.out.println("The output from the reposnse is"+ response.statusCode());
        System.out.println("The output "+ response.asPrettyString());
    }

    @Then("the response should contain a list of pets with status {string}")
    public void verifyResponseContainsPetsWithStatus(String status) {
        response.then().body("status", everyItem(equalTo(status)));

    }

    @Then("each pet in the response should have the required fields")
    public void verifyPetFieldsInResponse() {
        response.then().body("id", everyItem(notNullValue()))
                .body("name", everyItem(notNullValue()))
                .body("status", everyItem(notNullValue()));
    }

    @Then("each pet in the response should have the required fields such as id, name, and status")
    public void each_pet_in_the_response_should_have_the_required_fields_such_as_id_name_and_status() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
    }

}
