package UI.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SignUpPage {

    private SelenideElement selectRole = $(byClassName("filter-option-inner-inner"));
    private SelenideElement roleTeacher = $(byId("bs-select-1-0"));
    private SelenideElement roleStudent = $ (byId("bs-select-1-1"));

    private SelenideElement inputFieldFullName = $ (byId("sw-form-capture-full_name-input"));
    private SelenideElement inputFieldEmail = $ (byId("sw-form-capture-email-input"));
    private SelenideElement inputFieldPassword = $ (byId("sw-form-password-input"));
    private SelenideElement checkBox = $ (byXpath("//*[@id=\"signup\"]/div[4]/div[2]/label/span[1]"));
    private SelenideElement signUpButton = $ (byId("sw-sign-up-submit-btn"));

    Faker faker = new Faker();
    String email = faker.internet().emailAddress();

    public void selectRoleAsTeacher (){
        selectRole.click();
        roleTeacher.click();
    }

    public void fieldFullName(){
        inputFieldFullName.setValue("TeacherAutoTest");
    }


    public void fieldValidEmail() {
        inputFieldEmail.setValue(email);
        System.out.println(email);
    }

    public void fieldValidPassword() {
        inputFieldPassword.setValue("xQwerty123");
    }

    public void selectCheckBox() {
        checkBox.click();
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
        sleep(2000);
    }


    //----------------------------------------------

    public void selectRoleAsStudent (){
        selectRole.click();
        roleStudent.click();
    }


}
