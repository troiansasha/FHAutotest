package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonnelUsserPage extends ParentPage {
    public PersonnelUsserPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPerssonel() {

        try {
            WebElement personnelButton = webDriver.findElement(By.xpath(".//*[text()='Personalas']"));
            personnelButton.click();
            logger.info("Button Personnel was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void openPerssonelUsers() {
        try {
            WebElement personnelUsersButton = webDriver.findElement(By.xpath(".//*[text()='Vartotojai']"));
            personnelUsersButton.click();
            logger.info("Button Personnel/Users was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }

    public boolean headerIsCorrect() {
        try {
            return
            webDriver.findElement(By.xpath(".//span[text()='Vartotojai']")).isDisplayed();
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return false;
    }
}

