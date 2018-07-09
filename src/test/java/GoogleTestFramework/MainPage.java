package GoogleTestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){this.driver=driver; }

//List of components
    private By searchField=By.id("lst-ib");
    private By searchResults=By.className("iUh30");//only for "aimp" request
    private By menuDropDown=By.cssSelector("a.gb_b.gb_hc");
    private By imagesLink=By.xpath("//a[@data-pid='2' and @class='gb_P']");
    private By gmailLink=By.xpath("//a[@data-pid='23' and @class='gb_P']");
    private By notificationButton=By.cssSelector("div.gb_Tc.gb_Uc.gb_hc");
    private By logo=By.id("hplogo");
    private By signInButton=By.cssSelector("a.gb_7f.gb_Fa.gb_Jb");
    private By termsButton=By.xpath("//a[contains(text(),'Terms')]");
    private By settingsButton=By.xpath("//a[contains(text(),'Settings')]");
    private By privacyButton=By.xpath("//a[contains(text(),'Privacy')]");
    private By aboutButton=By.xpath("//a[contains(text(),'About')]");
    private By businessButton=By.xpath("//a[contains(text(),'Business')]");
    private By advertisingButton=By.xpath("//a[contains(text(),'Advertising')]");
    private By searchButton=By.xpath("//div[@class='jsb']//center//input[@name='btnK']");

    private ArrayList components = new ArrayList();




//List of methods for components
    public WebElement getSearchField() {
        WebElement element=driver.findElement(searchField);
        return element;
    }

    public WebElement getSearchResults() {
        WebElement element=driver.findElement(searchResults);
        return element;
    }
    public WebElement getSearchButton(){
        WebElement element=driver.findElement(searchButton);
        return element;
    }
    public void clickSearchField() {
        driver.findElement(searchField).click();
    }
    public void clearSearchField() {
        driver.findElement(searchField).clear();
    }
    public void submitSearchField() {
        driver.findElement(searchField).submit();
    }
    public void enterTextToSearchField(String searchText) {
        driver.findElement(searchField).sendKeys(searchText);
    }
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
    public void clickMenuDropDown(){
        driver.findElement(menuDropDown).click();
    }
    public WebElement getMenuDropDown(){
        WebElement element=driver.findElement(menuDropDown);
        return element;
    }
    public void clickImagesLink(){
        driver.findElement(imagesLink).click();
    }
    public WebElement getImagesLink(){
        WebElement element=driver.findElement(imagesLink);
        return element;
    }
    public void clickGmailLink(){
        driver.findElement(gmailLink).click();
    }
    public WebElement getGmailLink() {
        WebElement element = driver.findElement(gmailLink);
        return element;
    }
    public void clickSettingsButton(){
        driver.findElement(settingsButton).click();
    }
    public WebElement getSettingsButton() {
        WebElement element = driver.findElement(settingsButton);
        return element;
    }
    public void clickTermsButton(){
        driver.findElement(termsButton).click();
    }
    public WebElement getTermsButton() {
        WebElement element = driver.findElement(termsButton);
        return element;
    }
    public void clickPrivacyButton(){
        driver.findElement(privacyButton).click();
    }
    public WebElement getPrivacyButton() {
        WebElement element = driver.findElement(privacyButton);
        return element;
    }
    public void clickNotificationButton(){
        driver.findElement(notificationButton).click();
    }
    public WebElement getNotificationButton() {
        WebElement element = driver.findElement(notificationButton);
        return element;
    }

    public WebElement getLogo() {
        WebElement element = driver.findElement(logo);
        return element;
    }
    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }
    public WebElement getSignInButton() {
        WebElement element = driver.findElement(signInButton);
        return element;
    }
    public void clickAboutButton(){
        driver.findElement(aboutButton).click();
    }
    public WebElement getAboutButton() {
        WebElement element = driver.findElement(aboutButton);
        return element;
    }
    public void clickBuisnessButton(){
        driver.findElement(businessButton).click();
    }
    public WebElement getBuisnessButton() {
        WebElement element = driver.findElement(businessButton);
        return element;
    }
    public void clickAdvertisingButton(){
        driver.findElement(advertisingButton).click();
    }
    public WebElement getAdvertisingButton() {
        WebElement element = driver.findElement(advertisingButton);
        return element;
    }
    public void listComponents(){
        ArrayList components = new ArrayList();
        components.addAll(driver.findElements(By.cssSelector("input")));
        for (int i=0; i<components.size();i++) {
            System.out.println(i+" "+components.get(i) + " " + '\n');
        }
    }

}
