package API;

import API.dto.UserData;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.Test;

public class CreateUserTest extends BaseApi {

    String endpoint = "/users";

    @Test
    public void successfulCreateUser() {
        UserData userData = UserData.builder()
                .email("XAutoTest@gmail.com")
                .full_name("AutoTest")
                .password("12345678")
                .generate_magic_link(false)
                .build();

        Response response = postRequest(endpoint, 201, userData);
    }

    @After
    public void deleteApiCreatedUser(){
        // дописать метод удаления созданного пользователя
    }
}
