package API;

import UI.pages.HomePage;
import UI.pages.SignInPage;
import UI.pages.SignUpPage;
import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BaseApi {

    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();

    final static String BASE_URI = "https://studio-api.softr.io/v1/api";
    final String BASE_URL = "https://jere237.softr.app/";
    final static String API_KEY = "khIbAyJIU5CIuh1oDuBRx1s49";
    final static String DOMAIN = "jere237.softr.app";

    String endpoint = "/users/";
    String ApiUserEmail = "ApiAutoTest@gmail.com";
    String teacherEmail = "AutoTestTeacher@gmail.com";
    String studentEmail = "AutoTestStudent@gmail.com";
    String fullName = "ApiAutoTest";
    String password = "12345678";

    static RequestSpecification specification = new RequestSpecBuilder()
            .setUrlEncodingEnabled(false)
            .setBaseUri(BASE_URI)
            .setContentType(ContentType.JSON)
            .addHeader("Softr-Api-Key", API_KEY)
            .addHeader("Softr-Domain",DOMAIN )
            .build();

    public static Response postRequest(String endPoint, Integer responseCode, Object body) {
        Response response = RestAssured.given()
                .spec(specification)
                .body(body)
                .when()
                .log().all()
                .post(endPoint)
                .then().log().all()
                .extract().response();
        response.then().assertThat().statusCode(responseCode);
        return response;
    }

    public static Response deleteRequest(String endPoint, Integer responseCode) {
        Response response = RestAssured.given()
                .spec(specification)
                .when()
                .log().all()
                .delete(endPoint)
                .then().log().all()
                .extract().response();
        response.then().assertThat().statusCode(responseCode);
        return response;
    }

    public void deleteApiUser(String mail){
        Response response = deleteRequest(endpoint+mail,200);
            response.then().assertThat().statusCode(200);
            Assert.assertNotNull(response);
    }
}
