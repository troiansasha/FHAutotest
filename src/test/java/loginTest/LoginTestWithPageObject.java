package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTestWithPageObject extends ParentTest {

    @Test
    public void validLogin(){
//no work
    loginPage.openPage();
        loginPage.enterTextInToInputLogin("troianwork@gmail.com");
        loginPage.enterTextInToInputPass("1q2w3e4r5t");
    loginPage.clickOnButtonEnter();
    homePage.timer10seconds();
    loginPage.clickOnButtonEnter();

    checkExpectedResult("Url is not correct", true, homePage.isItCorrectUrl());
    }
}
