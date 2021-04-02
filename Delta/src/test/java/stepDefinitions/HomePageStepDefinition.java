package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {

    static HomePage homePage;

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){

        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("user is on the Delta Home Page")
    public void user_is_on_the_delta_home_page() throws IOException {
       openBrowser("https://www.delta.com");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
       homePage.clickOnSearchButton();
    }
    @When("user enter {string} in the search box")
    public void user_enter_in_the_search_box(String string) {
        homePage.sendKeysAndEnterInSearchBox(string);
    }
    @Then("user should see search results {string} window displayed")
    public void user_should_see_search_results_window_displayed(String string) {
       homePage.checkTitleSearchResults(string);
    }





}
