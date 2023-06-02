package UI.tests;

import com.codeborne.selenide.Configuration;
import jdk.jfr.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class MyProfileTest extends BaseTest {

    @BeforeMethod
    public void beSignedIn(){
        open("https://jere237.softr.app/");
        Configuration.holdBrowserOpen=true;

        homePage.clickOnSignInButton();
        signInPage.signInAsUserUI("rtest@google.com", "12345678");
    }

    @Test(testName = "Regression Test of Updating Email")
    @Description("Update Email")
    public void changeEmailOfUserUI() {
        header.clickOnMyProfile();
        profilePage.chooseRole();
        profilePage.enterFullNameUI("ReTester");
//        profilePage.enterEmailUI("retester@google.com");
        profilePage.enterAboutDescription("A little bit about myself");
        profilePage.enterLink("tester.com");
        profilePage.setMajorPriority("Minor");
        profilePage.clickOnUpdateProfileButton();

        header.studentDirectoryButtonIsAvailable();


    }

    @Test(testName = "Regression Test of Changing Password")
    public void changePasswordOfUserUI(){
        header.clickOnMyProfile();
        profilePage.setOldPassword("12345678");
        profilePage.setNewPassword("987654321");
        profilePage.clickOnChangePasswordButton();
    }
}
