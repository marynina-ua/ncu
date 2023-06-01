package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import static UI.pages.HomePage.*;
import static org.testng.Assert.assertTrue;

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

    public void studentDirectoryButtonIsAvailable() {
        studentDirectoryButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/student-directory"));
    }


}
