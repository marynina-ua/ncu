package UI.tests;

import org.testng.annotations.Test;

public class MyProfileTest extends BaseTest {
    //    RTest
//    rtest@google.com
//

    @Test
    public void changeUserEmail() {
        header.clickOnSignInButton();
        signInPage.signInAsUser("rtest@google.com", "12345678");

        header.clickOnMyProfile();
        myProfilePage.chooseRole();
        myProfilePage.fieldFullName("Tester");
        myProfilePage.changeEmail("retester@google.com");
    }
}
