package UI.tests;

import org.junit.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void successfulSignUpAsTeacher() {
        homePage.clickOnSingUpButton();
        signUpPage.selectRoleAsTeacher();
        signUpPage.fieldFullName();
        signUpPage.fieldValidEmail();
        signUpPage.fieldValidPassword();
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAble();
    }
}
