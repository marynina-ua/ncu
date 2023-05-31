package API;

import API.dto.UserData;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Test;

import static API.DeleteUserTest.deleteApi;

public class CreateUserTest extends BaseApi {

    static String ApiUserEmail = "ApiAutoTest@gmail.com";
    static String endpoint = "/users";

    @Test
    public void successfulCreateUser() {
        UserData userData = UserData.builder()
                .email(ApiUserEmail)
                .full_name("ApiAutoTest")
                .password("12345678")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, 201, userData);
    }

    @After
    public void deleteApiCreatedUser(){
        deleteApi(ApiUserEmail);
    }
}
