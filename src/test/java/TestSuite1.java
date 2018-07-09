import GoogleTestFramework.LoadFirefoxDriver;
import GoogleTestFramework.MainPage;
import org.junit.Assert;
import org.testng.annotations.Test;

@Test
public class TestSuite1 extends LoadFirefoxDriver{

    @Test (priority=2)
    public void testSearchResult(){
        MainPage mainpage=new MainPage(driver);
//        Assert.assertEquals("Google Search",mainpage.getSearchButton().getText());
        mainpage.clickSearchField();
        mainpage.clearSearchField();
        mainpage.enterTextToSearchField("aimp");
        mainpage.submitSearchField();
//        mainpage.clickSearchButton();
        Assert.assertEquals("www.aimp.ru/",mainpage.getSearchResults().getText());

    }
    @Test (priority=1)
    public void testUIelementsMainPageNotLogin(){
        MainPage mainpage=new MainPage(driver);
        Assert.assertTrue(mainpage.getGmailLink().isDisplayed());
        Assert.assertTrue(mainpage.getImagesLink().isDisplayed());
        Assert.assertTrue(mainpage.getMenuDropDown().isDisplayed());
        Assert.assertTrue(mainpage.getPrivacyButton().isDisplayed());
        Assert.assertTrue(mainpage.getSearchButton().isDisplayed());
        Assert.assertTrue(mainpage.getSearchField().isDisplayed());
        Assert.assertTrue(mainpage.getSettingsButton().isDisplayed());
        Assert.assertTrue(mainpage.getTermsButton().isDisplayed());
        Assert.assertTrue(mainpage.getAboutButton().isDisplayed());
        Assert.assertTrue(mainpage.getAdvertisingButton().isDisplayed());
        Assert.assertTrue(mainpage.getBuisnessButton().isDisplayed());
        Assert.assertTrue(mainpage.getLogo().isDisplayed());
        //Assert.assertTrue(mainpage.getNotificationButton().isDisplayed());
        Assert.assertTrue(mainpage.getSignInButton().isDisplayed());
    }
    @Test (priority=2)
    public void testGmailLink(){
        MainPage mainpage=new MainPage(driver);
        mainpage.clickGmailLink();
    }
    @Test (priority=2)
    public void testImagesLink(){
        MainPage mainpage=new MainPage(driver);
        mainpage.clickImagesLink();
    }
    @Test (priority=2)
    public void testSettingsLink(){
        MainPage mainpage=new MainPage(driver);
        mainpage.clickSettingsButton();
    }

}

