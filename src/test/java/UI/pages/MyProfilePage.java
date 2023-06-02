package UI.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage extends HomePage {


    private SelenideElement role = $(byClassName("btn dropdown-toggle btn-light"));
    private SelenideElement roleTeacher = $(byId("bs-select-1-0"));
    private SelenideElement roleStudent = $(byId("bs-select-1-1"));

    private SelenideElement fullNameUser = $(byId("sw-form-capture-full_name-input"));
    private SelenideElement emailUser = $(byId("sw-form-capture-email-input"));
    private SelenideElement introduceUser = $(byId("sw-form-capture-About"));
    private SelenideElement avatarUser = $(byXpath("//input[@type='file']"));
    private SelenideElement linkToProfileUser = $(byId("sw-form-capture-External Profile URL"));
    private SelenideElement majorUser = $(byId("sw-form-capture-Major"));
    private SelenideElement updateProfileButton = $(byId("sw-update-profile-btn"));

    //    RTest
//    rtest@google.com
    public void chooseRole(){
        roleStudent.click();
    }

    public void fieldFullName(String fullName) {
        fullNameUser.setValue(fullName);
    }

    public void changeEmail(String email) {
        emailUser.click();
        emailUser.setValue(email);
    }

}
