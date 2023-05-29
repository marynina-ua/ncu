package UI.tests;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


import UI.pages.HomePage;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    public final String BASE_URL = "https://jere237.softr.app/";

    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Before
    public void init() {
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }


}
