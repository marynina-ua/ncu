package UI.tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MyProfileTest extends BaseTest {

    String p18 = "12345678";
    String p91 = "987654321";

    @BeforeMethod
    public void beSignedIn(){
        homePage.clickOnSignInButton();
        signInPage.signInAsUserUI("rtest@google.com", p18);
    }

    @Test(testName = "Regression Test of Updating Email", enabled = true)
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

        Assert.assertEquals("ReTester", profilePage.getTextFromFullName());
    }

    @Test(testName = "Regression Test to Check 'Major' Field", enabled = true)
    @Description("'Major' field should not be enable for Teacher")
    public void checkMajorField(){
        header.clickOnMyProfile();
        profilePage.chooseRoleAsTeacherUI();
        profilePage.enterFullNameUI("ReTester");
        profilePage.enterAboutDescription("A little bit about myself");
        profilePage.enterLink("tester.com");
        profilePage.majorFieldIsNotActive();
        profilePage.clickOnUpdateProfileButton();

        Assert.assertTrue(profilePage.majorFieldIsNotActive());
    }

    @Test(testName = "Regression Test of Changing Password", enabled = false)
    public void changePasswordOfUserUI(){
        header.clickOnMyProfile();
        profilePage.setOldPassword(p18);
        profilePage.setNewPassword(p91);
        profilePage.clickOnChangePasswordButton();

        header.clickOnSignOutButton();
        signInPage.signInAsUserUI("rtest@google.com", p18);

        Assert.assertTrue(signInPage.errorMessageIsPresent("Invalid email or password"));
    }
}
