package UI.tests;
import static com.codeborne.selenide.Selenide.open;

import API.BaseApi;
import UI.pages.Header;
import UI.pages.HomePage;
import UI.pages.SignUpPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {

    public final String BASE_URL = "https://jere237.softr.app/";

    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    Header header = new Header();
    BaseApi baseApi = new BaseApi();

    @BeforeMethod
    public void init() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }
}
