package test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import verifier.ResponseHeaderVerifier;
import verifier.StatusCodeVerifier;
import webservice.UserClient;

public class UserTest extends BaseTest {

    @Test
    public void verifyResponseStatusCode() {
        Response response = UserClient.getResponseStatusCode();

        StatusCodeVerifier.assertStatusCode200(response);
    }

    @Test
    public void verifyResponseHeader() {
        String contentTypeValue = UserClient.getContentTypeResponseHeader();

        ResponseHeaderVerifier.assertJsonContentType(contentTypeValue);
    }

    @Test
    public void verifyResponseBody() {
        ResponseBody<?> responseBody = UserClient.getResponseBody();
        User[] users = responseBody.as(User[].class);

        Assert.assertEquals(users.length, 10);
    }
}
