package UI.tests;

import com.codeborne.selenide.Configuration;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MyProfileTest extends BaseTest {

    String p18 = "12345678";
    String p91 = "987654321";
    @BeforeMethod
    public void beSignedIn(){
//        Configuration.holdBrowserOpen=true;
//        open(BASE_URL);
        homePage.clickOnSignInButton();
        signInPage.signInAsUserUI("rtest@google.com", p91);
    }

    @Test(testName = "Regression Test of Updating Email")
    @Description("Update Email")
    public void changeEmailOfUserUI() {
        header.clickOnMyProfile();
        profilePage.chooseRoleAsStudentUI();
        profilePage.enterFullNameUI("ReTester");
        profilePage.enterEmailUI("retester@google.com");
        profilePage.enterAboutDescription("A little bit about myself");
        profilePage.enterLink("tester.com");
        profilePage.majorFieldIsActive("Minor");
        profilePage.clickOnUpdateProfileButton();

        header.studentDirectoryButtonIsAvailable(); //todo дописать проверку
    }

    @Test(testName = "Regression Test to Check 'Major' Field")
    @Description("'Major' field should not be enable for Teacher")
    public void checkMajorField(){
        header.clickOnMyProfile();
        profilePage.chooseRoleAsTeacherUI();
        profilePage.enterFullNameUI("ReTester");
        profilePage.enterAboutDescription("A little bit about myself");
        profilePage.enterLink("tester.com");
        profilePage.majorFieldIsNotActive();
        profilePage.clickOnUpdateProfileButton();
    }

    @Test(testName = "Regression Test of Changing Password")
    public void changePasswordOfUserUI(){
        header.clickOnMyProfile();
        profilePage.setOldPassword(p91);
        profilePage.setNewPassword(p18);
        profilePage.clickOnChangePasswordButton();

        header.clickOnSignOutButton();
        signInPage.signInAsUserUI("rtest@google.com", p91); // залогиниться
        Assert.assertTrue(signInPage.errorMessageIsPresent("Invalid email or password"));
    }
}
