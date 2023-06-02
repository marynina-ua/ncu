package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static UI.pages.HomePage.*;
import static UI.pages.HomePage.userIconMyProfile;
import static org.testng.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.sleep;


public class Header {

    public void clickOnSingUpButton (){
        singUpButtons.get(1).click();
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }

    public void userIconShouldBeVisible() {
        userIcon.shouldBe(Condition.visible);
    }

    public void clickOnMyProfile() {
        userIcon.click();
        userIconMyProfile.click();
        sleep(3000);
    }

    public void studentDirectoryButtonIsAvailable() {
        studentDirectoryButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/student-directory"));
    }


}
