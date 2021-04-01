package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import travelinfo.TravelInfo;


public class TravelInfoStepDefinitions extends WebAPI {
    static TravelInfo travelInfo;

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
        travelInfo = PageFactory.initElements(driver, TravelInfo.class);
    }
    @After
    public void closeBrowser(){
        cleanUp();
    }

    @When("user mouse over on travelInfo")
    public void user_mouse_over_on_travel_info() {
        Actions actions = new Actions(driver);
        actions.moveToElement(travelInfo.getTravelInfoMouseOver()).build().perform();

    }
    @And("user click on Delta one links")
    public void user_click_on_delta_one_links() {
        travelInfo.clickOnDeltaOne();
    }

    @Then("user should see Delta One® | Delta Air Lines {string} window displayed")
    public void user_should_see_delta_one_delta_air_lines_window_displayed(String string) {
        travelInfo.checkTitelDeltaOne(string);
    }

    @When("user click on Delta Premium Select links")
    public void user_click_on_delta_premium_select_links() {
        travelInfo.clickOnDeltaPremiumSelect();
    }

    @Then("user should see Premium Select | Delta Air Lines {string} window displayed")
    public void user_should_see_premium_select_delta_air_lines_window_displayed(String string) {
        travelInfo.checkTitleDeltaPremiumSelect(string);
    }
}



