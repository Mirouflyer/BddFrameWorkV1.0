package travelinfo;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class TravelInfo extends WebAPI {


    @FindBy(xpath ="//a[@id=\"headSectab1\"]")
    public WebElement travelInfoMouseOver;
    @FindBy(css = "#primary-static-link-0")
    public WebElement deltaOne;
    @FindBy(css =  "#primary-static-link-1")
    public WebElement deltaPremiumSelect;
    @FindBy(css = "#primary-static-link-2")
    public WebElement firstClass;
    @FindBy(css = "#primary-static-link-3")
    public WebElement deltaConfortPlus;
    @FindBy(css = "#primary-static-link-4")
    public WebElement mainCabin;
    @FindBy(css = "#secondary-static-link-0")
    public WebElement travelPlanningCenter;
    @FindBy()
    public WebElement saferTravel;
    @FindBy()
    public WebElement airLinesPartners;
    @FindBy()
    public WebElement baggage;
    @FindBy()
    public WebElement checkInSecurity;
    @FindBy()
    public WebElement deltaSkyClub;
    @FindBy()
    public WebElement airportMapsLocations;
    @FindBy()
    public WebElement flightDeals;
    @FindBy()
    public WebElement flightSchedule;
    @FindBy()
    public WebElement destinations;
    @FindBy()
    public WebElement onboardExperience;
    @FindBy()
    public WebElement giftCards;
    @FindBy()
    public WebElement aircraft;
    @FindBy()
    public WebElement deltaVacations;
    @FindBy()
    public WebElement rentACar;
    @FindBy()
    public WebElement shopHotels;
    @FindBy()
    public WebElement inFlightWifi;
    @FindBy()
    public WebElement tripProtection;

    public WebElement getTravelInfoMouseOver() {
        return travelInfoMouseOver;
    }

    public WebElement getDeltaOne() {
        return deltaOne;
    }

    public WebElement getDeltaPremiumSelect() {
        return deltaPremiumSelect;
    }

    public WebElement getFirstClass() {
        return firstClass;
    }

    public WebElement getDeltaConfortPlus() {
        return deltaConfortPlus;
    }

    public WebElement getMainCabin() {
        return mainCabin;
    }

    public WebElement getTravelPlanningCenter() {
        return travelPlanningCenter;
    }

    public WebElement getSaferTravel() {
        return saferTravel;
    }

    public WebElement getAirLinesPartners() {
        return airLinesPartners;
    }

    public WebElement getBaggage() {
        return baggage;
    }

    public WebElement getCheckInSecurity() {
        return checkInSecurity;
    }

    public WebElement getDeltaSkyClub() {
        return deltaSkyClub;
    }

    public WebElement getAirportMapsLocations() {
        return airportMapsLocations;
    }

    public WebElement getFlightDeals() {
        return flightDeals;
    }

    public WebElement getFlightSchedule() {
        return flightSchedule;
    }

    public WebElement getDestinations() {
        return destinations;
    }

    public WebElement getOnboardExperience() {
        return onboardExperience;
    }

    public WebElement getGiftCards() {
        return giftCards;
    }

    public WebElement getAircraft() {
        return aircraft;
    }

    public WebElement getDeltaVacations() {
        return deltaVacations;
    }

    public WebElement getRentACar() {
        return rentACar;
    }

    public WebElement getShopHotels() {
        return shopHotels;
    }

    public WebElement getInFlightWifi() {
        return inFlightWifi;
    }

    public WebElement getTripProtection() {
        return tripProtection;
    }


    public void mouseHoverToTravelInfo(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getTravelInfoMouseOver());
    }

    public void clickOnDeltaOne(){
        getDeltaOne().click();
    }

    public void checkTitelDeltaOne(String expectedText){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedText,"title does not match");

    }

    public void clickOnDeltaPremiumSelect(){
        getDeltaPremiumSelect().click();
    }

    public void checkTitleDeltaPremiumSelect(String expectedText){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedText,"title does not match");
    }
}
