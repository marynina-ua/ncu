package API;

import io.restassured.response.Response;
import org.junit.Test;

public class DeleteUserTest extends BaseApi {

    static String endpoint = "/users/";
    String teacherEmail = "AutoTestTeacher@gmail.com";
    String studentEmail = "AutoTestStudent@gmail.com";

    @Test
    public void successfullDeleteTeacher(){
        Response response = deleteRequest(endpoint+teacherEmail,200);
    }

    @Test
    public void successfullDeleteStudent(){
        Response response = deleteRequest(endpoint+studentEmail,200);
    }

    @Test
    public static void deleteApi(String mail){
        Response response = deleteRequest(endpoint+mail,200);
    }

}
