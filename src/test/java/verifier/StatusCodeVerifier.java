package verifier;

import io.restassured.response.Response;
import org.testng.Assert;

import java.net.HttpURLConnection;

public class StatusCodeVerifier {

    public static void assertStatusCode200(Response response) {
        Assert.assertEquals(response.getStatusCode(), HttpURLConnection.HTTP_OK);
    }
}
