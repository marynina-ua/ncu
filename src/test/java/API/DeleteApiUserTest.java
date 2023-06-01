package API;

import API.dto.UserData;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteApiUserTest extends BaseApi {

    @Test(testName = "Api DEL Teacher")
    public void successfulDeleteTeacher() {
        UserData userData = UserData.builder()
                .email(teacherEmail)
                .full_name(fullName)
                .password(password)
                .generate_magic_link(false)
                .build();
        Response responsePost = postRequest(endpoint, 201, userData);
            responsePost.then().assertThat().statusCode(201);
            Assert.assertEquals(userData.getEmail(), teacherEmail);
            Assert.assertEquals(userData.getFull_name(), fullName);
            Assert.assertEquals(userData.getPassword(), password);
            Assert.assertEquals(userData.isGenerate_magic_link(), false);
            Assert.assertNotNull(responsePost);

        Response response = deleteRequest(endpoint+teacherEmail,200);
            response.then().assertThat().statusCode(200);
            Assert.assertNotNull(response);
    }

    @Test(testName = "Api DEL Student")
    public void successfulDeleteStudent() {
        UserData userData = UserData.builder()
                .email(studentEmail)
                .full_name(fullName)
                .password(password)
                .generate_magic_link(false)
                .build();
        Response responsePost = postRequest(endpoint, 201, userData);
            responsePost.then().assertThat().statusCode(201);
            Assert.assertEquals(userData.getEmail(), studentEmail);
            Assert.assertEquals(userData.getFull_name(), fullName);
            Assert.assertEquals(userData.getPassword(), password);
            Assert.assertEquals(userData.isGenerate_magic_link(), false);
            Assert.assertNotNull(responsePost);
        Response response = deleteRequest(endpoint+studentEmail,200);
            response.then().assertThat().statusCode(200);
            Assert.assertNotNull(response);
    }
}
