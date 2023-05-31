package UI.tests;

import API.DeleteUserTest;
import org.junit.Test;

public class SignUpTest extends BaseTest{

    //e2e
    @Test
    public void successfulSignUpAsTeacher() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsTeacher();
        signUpPage.fieldFullName("TeacherAutoTest");
        signUpPage.fieldValidEmail("AutoTestTeacher@gmail.com");
        signUpPage.fieldValidPassword("xQwerty123");
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAble();

        DeleteUserTest.deleteApi("AutoTestTeacher@gmail.com");
    }

    //e2e
    @Test
    public void successfulSignUpAsStudent() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsStudent();
        signUpPage.fieldFullName("StudentAutoTest");
        signUpPage.fieldValidEmail("AutoTestStudent@gmail.com");
        signUpPage.fieldValidPassword("Qwerty123");
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAble();

        DeleteUserTest.deleteApi("AutoTestStudent@gmail.com");
    }

    //2 regration(два на основе зарегистрированных проблем(регрессионные тесты); )
}
