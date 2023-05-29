package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class Header {

    private ElementsCollection singUpButtons = $$(byAttribute("href", "/sign-up"));

    private SelenideElement userIcon = $(byXpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1s7t6r0']"));
    private SelenideElement studentDirectoryButton = $(byAttribute("href", "/student-directory"));


    public void clickOnSingUpButton (){
        singUpButtons.get(1).click();
    }

    public void userIconShouldBeVisible() {
        userIcon.shouldBe(Condition.visible);
    }

    public void studentDirectoryButtonIsAble() {
        studentDirectoryButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/student-directory"));
    }
}
