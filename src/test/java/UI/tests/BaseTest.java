package UI.tests;
import static com.codeborne.selenide.Selenide.open;

import API.BaseApi;
import UI.pages.*;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public final String BASE_URL = "https://jere237.softr.app/";

    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    SignInPage signInPage = new SignInPage();
    MyProfilePage profilePage = new MyProfilePage();
    Header header = new Header();
    BaseApi baseApi = new BaseApi();

    @BeforeMethod
    public void init() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }

//    @AfterMethod
//    public void teardown() {
//        WebDriverRunner.closeWebDriver();
//    }
}
