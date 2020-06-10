package test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import validator.ResponseHeaderValidator;
import validator.StatusCodeValidator;
import webservice.UserClient;

public class UserTest extends BaseTest {

    @Test
    public void verifyResponseStatusCode() {
        Response response = UserClient.getResponseStatusCode();

        StatusCodeValidator.assertSuccessStatusCode(response);
    }

    @Test
    public void verifyResponseHeader() {
        String contentTypeValue = UserClient.getContentTypeResponseHeader();

        ResponseHeaderValidator.assertJsonContentType(contentTypeValue);
    }

    @Test
    public void verifyResponseBody() {
        User[] users = UserClient.getResponseBody().as(User[].class);
        int expectedLength = users.length;

        Assert.assertEquals(expectedLength, 10);
    }
}