package UI.tests;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


import UI.pages.Header;
import UI.pages.HomePage;
import UI.pages.SignUpPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class BaseTest {

    public final String BASE_URL = "https://jere237.softr.app/";

    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    Header header = new Header();

    @Before
    public void init() {
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }


}
