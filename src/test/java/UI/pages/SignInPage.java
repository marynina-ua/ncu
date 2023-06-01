package UI.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SignInPage {

    private SelenideElement emailField = $(byId("sw-form-capture-email-input"));
    private SelenideElement passwordField = $(byId("sw-form-password-input"));
    private SelenideElement signInButton = $(byId("sw-sign-in-submit-btn"));

    public void enterAsApiUser(String apiUserEmail, String password){
        emailField.setValue(apiUserEmail);
        passwordField.setValue(password);
        signInButton.click();
        sleep(2000);
    }


}
