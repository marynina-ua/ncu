package UI.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MyProfilePage {

    private SelenideElement roleUI = $(byClassName("filter-option-inner-inner"));
    private SelenideElement roleTeacherUI = $(byId("bs-select-1-0"));
    private SelenideElement roleStudentUI = $(byId("bs-select-1-1"));

    private SelenideElement fullNameUI = $(byId("sw-form-capture-full_name-input"));
    private SelenideElement emailUI = $(byId("sw-form-capture-email-input"));

    private SelenideElement aboutUI = $(byId("sw-form-capture-About"));
    private SelenideElement fileImg = $x("//input[@type='file']");

    private SelenideElement linkToProfile = $(byId("sw-form-capture-External Profile URL"));
    private SelenideElement majorPriority = $(byId("sw-form-capture-Major"));

    private SelenideElement updateProfileButton = $(byId("sw-update-profile-btn"));

    private SelenideElement oldPassword = $(byId("sw-form-password-input"));
    private SelenideElement newPassword = $(byId("sw-new-password-input"));
    private SelenideElement changePasswordButton = $(byId("sw-change-password-btn"));

    private SelenideElement errorMessage = $(byXpath("//div[@class='error-message required-errors d-block']"));

    public void chooseRoleAsTeacherUI(){
        roleUI.click();
        roleTeacherUI.click();
        sleep(3000);
    }
    public void chooseRoleAsStudentUI(){
        roleUI.click();
        roleStudentUI.click();
        sleep(3000);
    }

    public void enterFullNameUI(String name){
        fullNameUI.setValue(name);
    }

    public void enterEmailUI(String mail) {
        emailUI.click();
        emailUI.setValue(mail);
    }

    public void enterAboutDescription(String aboutInfo){
        aboutUI.setValue(aboutInfo);
    }


    public void enterLink(String link){
        linkToProfile.setValue(link);
    }

    public void majorFieldIsActive(String priority){
//        проверить что поле активно
        majorPriority.setValue(priority);
    }

    public void majorFieldIsNotActive(){
        majorPriority.shouldBe(disabled);
    }

    public void clickOnUpdateProfileButton(){
        updateProfileButton.click();
        errorMessage.shouldNot(visible);
//      errorMessage.shouldNotHave(text("Please make sure there are no empty required fields."));
    }

    public void setOldPassword(String oldPwd){
        oldPassword.setValue(oldPwd);
    }

    public void setNewPassword(String newPwd){
        newPassword.setValue(newPwd);
    }

    public void clickOnChangePasswordButton(){
        changePasswordButton.click();
    }
}
