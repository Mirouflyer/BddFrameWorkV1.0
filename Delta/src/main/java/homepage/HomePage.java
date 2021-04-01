package homepage;

import common.WebAPI;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends WebAPI {



    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[2]/ngc-search[1]/div[1]/a[1]")
    public WebElement serachButton;

    @FindBy(xpath= "//input[@id='search_input']")
    public WebElement searchBox;

    public WebElement getSearchButton() {
        return serachButton;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void clickOnSearchButton(){
        getSearchButton().click();
    }

    public void sendKeysAndEnterInSearchBox(String topic){
        getSearchBox().sendKeys(topic, Keys.ENTER);
    }

    public void checkTitleSearchResults(String expectedResult) {
        String actualResults = driver.getTitle();
        Assert.assertEquals(actualResults,expectedResult,"title does not match");

    }



}
