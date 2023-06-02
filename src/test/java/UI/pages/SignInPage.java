package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SignInPage {

    private SelenideElement emailField = $(byId("sw-form-capture-email-input"));
    private SelenideElement passwordField = $(byId("sw-form-password-input"));
    private SelenideElement signInButton = $(byId("sw-sign-in-submit-btn"));
    private SelenideElement errorMessage = $(byXpath("//div[@class='error-message login-error d-block']"));

    public void enterAsApiUser(String apiUserEmail, String password){
        emailField.setValue(apiUserEmail);
        passwordField.setValue(password);
        signInButton.click();
        sleep(2000);
    }

    public void signInAsUserUI(String emailUI, String passwordUI){
        emailField.setValue(emailUI);
        passwordField.setValue(passwordUI);
        signInButton.click();
        sleep(2000);
    }

    public boolean errorMessageIsPresent(String errorMsg){
       errorMessage.shouldHave(Condition.text(errorMsg));
       System.out.println(errorMsg);
       return true;
    }


}
