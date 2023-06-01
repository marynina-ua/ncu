package UI.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public static final ElementsCollection singUpButtons = $$(byAttribute("href", "/sign-up"));

    public static final SelenideElement userIcon = $(byXpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1s7t6r0']"));
    public static final SelenideElement studentDirectoryButton = $(byAttribute("href", "/student-directory"));

    public static final SelenideElement signInButton = $(byXpath("//span[normalize-space()='Sign in']"));
    public static final SelenideElement signUpButton = $ (byId("sw-sign-up-submit-btn"));
    public static final SelenideElement searchField = $(byId(":r0:"));
//    public static final SelenideElement containerOfUsers = $(byXpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-8 css-wh0kks']"));
    public static final SelenideElement containerOfUser = $(byXpath("//h3[contains(@class,'sw-font-size-3xl sw-text-color-0A0A0A sw-font-family-default sw-font-weight-semibold sw-text-align-left sw-letter-spacing-normal sw-padding-top-3xs sw-padding-bottom-6xs sw-padding-left-none sw-padding-right-none')]"));

    public void clickOnSignInButton(){
        signInButton.click();
        sleep(2000);
    }

    public void searchApiUser(){
        searchField.setValue("ApiAutoTest");
        sleep(3000);
    }

    public String container(){
        String striing = containerOfUser.getText();
        System.out.println(striing);
        sleep(3000);
        return striing;
    }

}
