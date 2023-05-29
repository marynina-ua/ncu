package UI.tests;

import org.junit.After;
import org.junit.Test;

public class SignUpTest extends BaseTest{

    //e2e
    @Test
    public void successfulSignUpAsTeacher() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsTeacher();
        signUpPage.fieldTeacherFullName();
        signUpPage.fieldValidEmail();
        signUpPage.fieldValidTeacherPassword();
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAble();
    }

    //e2e
    @Test
    public void successfulSignUpAsStudent() {
        header.clickOnSingUpButton();
        signUpPage.selectRoleAsStudent();
        signUpPage.fieldStudentFullName();
        signUpPage.fieldValidEmail();
        signUpPage.fieldValidStudentPassword();
        signUpPage.selectCheckBox();
        signUpPage.clickOnSignUpButton();
        header.userIconShouldBeVisible();
        header.studentDirectoryButtonIsAble();
    }

    //2 regration(два на основе зарегистрированных проблем(регрессионные тесты); )


    @After
    public void deleteUser(){
        // не знаю как удалить
    }

}
