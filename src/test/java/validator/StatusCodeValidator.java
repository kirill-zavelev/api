package validator;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;

public class StatusCodeValidator {

    public static void assertSuccessStatusCode(Response response) {
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }
}
