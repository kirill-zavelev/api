package verifier;

import io.restassured.response.Response;
import org.testng.Assert;

public class StatusCodeVerifier {

    public static void assertStatusCode200(Response response) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
