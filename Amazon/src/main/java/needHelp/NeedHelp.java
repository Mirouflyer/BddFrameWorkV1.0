package needHelp;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NeedHelp extends WebAPI {

    @FindBy(xpath = "//a[@id='headSectab3']")
    public WebElement needHelpMouseHover;

    @FindBy(xpath = "//a[@id='primary-static-link-0']")
    public WebElement changeCanceHelplLink;

    @FindBy(xpath = "//a[@id='primary-static-link-1']")
    public WebElement refundHelplLink;

    @FindBy(xpath = "//a[@id='primary-static-link-2']")
    public WebElement seatsHelplLink;

    @FindBy(xpath = "//a[@id='primary-static-link-3']")
    public WebElement baggageHelplLink;

    @FindBy(xpath = "//a[@id='primary-static-link-4']")
    public WebElement commentComplaintHelplLink;

    @FindBy(xpath = "//a[@id='secondary-static-link-0']")
    public WebElement coronavirusTravelFaqs;

    @FindBy(xpath = "//a[@id='secondary-static-link-1']")
    public WebElement needHelp;

    @FindBy(xpath = "//a[@id='secondary-static-link-2']")
    public WebElement receipts;

    @FindBy(xpath = "//a[@id='secondary-static-link-3']")
    public WebElement certificatesEcredits;

    @FindBy(xpath = "//a[@id='secondary-static-link-5']")
    public WebElement childInfantTravel;


    public WebElement getNeedHelpMouseHover() {
        return needHelpMouseHover;
    }

    public WebElement getChangeCanceHelplLink() {
        return changeCanceHelplLink;
    }

    public WebElement getRefundHelplLink() {
        return refundHelplLink;
    }

    public WebElement getSeatsHelplLink() {
        return seatsHelplLink;
    }

    public WebElement getBaggageHelplLink() {
        return baggageHelplLink;
    }

    public WebElement getCommentComplaintHelplLink() {
        return commentComplaintHelplLink;
    }

    public WebElement getCoronavirusTravelFaqs() {
        return coronavirusTravelFaqs;
    }

    public WebElement getNeedHelp() {
        return needHelp;
    }

    public WebElement getReceipts() {
        return receipts;
    }

    public WebElement getCertificatesEcredits() {
        return certificatesEcredits;
    }

    public WebElement getChildInfantTravel() {
        return childInfantTravel;
    }

    public void needHelpMouseHoverAction(){
        Actions actions = new Actions(driver);
        actions.moveToElement(getNeedHelpMouseHover()).build().perform();
    }

    public void clickOnChangeCancelHelp(){
        getChangeCanceHelplLink().click();
    }

    public void checkTitleChangeCancelHelp(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    public void clickOnRefundHelp(){
        getRefundHelplLink().click();
    }

    public void checkTitleRefundlHelp(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    public void clickOnSeatsHelp(){
        getSeatsHelplLink().click();
    }

    public void checkTitleSeatsHelp(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    public void clickOnBaggageHelp(){
        getBaggageHelplLink().click();
    }

    public void checkTitleBaggageHelp(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    public void clickOnCommentComplaintHelp(){
        getCommentComplaintHelplLink().click();
    }

    public void checkTitlecommentComplaintHelp(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }

    public void clickOnCoronavirusTravelFaqs(){
        getCoronavirusTravelFaqs().click();
    }

    public void checkTitleCoronavirusTravelFaqs(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");

    }
}
