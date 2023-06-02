package UI.tests;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test(testName = "E2E SignUp as Teacher")
    public void successfulSignUpAsTeacher() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsTeacher();
        signUpPage.fieldFullName("TeacherAutoTest");
        signUpPage.fieldValidEmail("AutoTestTeacher@gmail.com");
        signUpPage.fieldValidPassword("xQwerty123");
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAvailable();

        baseApi.deleteApiUser("AutoTestTeacher@gmail.com");
    }


    @Test(testName = "E2E SignUp as Student")
    public void successfulSignUpAsStudent() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsStudent();
        signUpPage.fieldFullName("StudentAutoTest");
        signUpPage.fieldValidEmail("AutoTestStudent@gmail.com");
        signUpPage.fieldValidPassword("Qwerty123");
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAvailable();

        baseApi.deleteApiUser("AutoTestStudent@gmail.com");
    }
}
