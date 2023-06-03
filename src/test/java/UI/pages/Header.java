package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static UI.pages.HomePage.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.sleep;


public class Header {

    private SelenideElement userIcon = $(byXpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1s7t6r0']"));
    private SelenideElement userIconMyProfile = $(byXpath("//span[normalize-space()='My Profile']"));
    public static final SelenideElement signOutButton = $(byXpath("//span[normalize-space()='Sign Out']"));

    public void clickOnSingUpButton (){
        singUpButtons.get(1).click();
    }

    public void userIconShouldBeVisible() {
        userIcon.shouldBe(Condition.visible);
    }

    public void clickOnMyProfile() {
        userIcon.click();
        userIconMyProfile.click();
        sleep(3000);
    }

    public void clickOnSignOutButton(){
        userIcon.click();
        signOutButton.click();
        sleep(2000);
    }

    public void studentDirectoryButtonIsAvailable() {
        studentDirectoryButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/student-directory"));
    }
}
