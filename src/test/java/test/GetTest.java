package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTest extends BaseTest {

    private static final int EXPECTED_RESPONSE_CODE = 200;
    private static final String RESPONSE_HEADER = "Content-Type";
    private static final String EXPECTED_HEADER_VALUE = "application/json; charset=utf-8";
    private static final String PATH = "/users";

    @Test
    public void verifyResponseStatusCode() {
        int actualResponseCode = getResponseStatusCode(PATH);

        Assert.assertEquals(actualResponseCode, EXPECTED_RESPONSE_CODE);
    }

    @Test
    public void verifyResponseHeader() {
        String actualResponseHeader = getResponseHeader(PATH, RESPONSE_HEADER);

        Assert.assertEquals(actualResponseHeader, EXPECTED_HEADER_VALUE);
    }

    @Test
    public void verifyResponseBody() {
        Response response = RestAssured
                .when()
                .get(PATH)
                .andReturn();
        ResponseBody<?> responseBody = response.getBody();
        User[] users = responseBody.as(User[].class);

        Assert.assertEquals(users.length, 10);

//        Gson gson = new Gson();
//        User user = new User();
//        String json = gson.toJson(new User[].class);
//        User read = gson.fromJson(json, User.class);
//        Assert.assertEquals();
    }
}
