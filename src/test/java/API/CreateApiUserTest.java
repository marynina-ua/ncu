package API;

import API.dto.UserData;
import com.codeborne.selenide.Configuration;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CreateApiUserTest extends BaseApi {

//    @BeforeMethod
//    public void init() {
//        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
//        open(BASE_URL);
//        //        Configuration.holdBrowserOpen=true;
//    }

    @Test
    public void successfulCreateUser() {
        UserData userData = UserData.builder()
                .email(ApiUserEmail)
                .full_name(fullName)
                .password(password)
                .generate_magic_link(false)
                .build();
        Response responsePost = postRequest(endpoint, 201, userData);

        homePage.clickOnSignInButton();
        signInPage.enterAsApiUser("ApiAutoTest@gmail.com", "12345678");
        homePage.searchApiUser();
        Assert.assertEquals("ApiAutoTest", homePage.container());

        deleteApiUser(ApiUserEmail);
    }

//    @AfterMethod
//    public void deleteApiCreatedUser(){
//        deleteApiUser(ApiUserEmail);
//    }
    /** Отсутствует HEADER И ПРИВЕТСТВЕННОЕ СООБЩЕНИЕ С КНОПКАМИ */
}
