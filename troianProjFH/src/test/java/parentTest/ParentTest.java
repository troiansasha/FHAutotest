package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.PersonnelUsserPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    protected WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected PersonnelUsserPage personnelUsserPage;

    //Precondition
    @Before
    public void setUp() {
        File file = new File("./src/olddrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    loginPage = new LoginPage(webDriver);
    homePage = new HomePage(webDriver);
    }
    @After
    public void tearDown () {
        webDriver.quit();
    }



    public void checkExpectedResult (String message, boolean expectedResult, boolean actualResalt){

        Assert.assertEquals(message, expectedResult, actualResalt);

    }

//    public void checkExpectedResult (String message, boolean actualResalt){
//        checkExpectedResult();
//    }
}
