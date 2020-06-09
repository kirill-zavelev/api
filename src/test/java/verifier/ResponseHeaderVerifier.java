package verifier;

import org.testng.Assert;
import webservice.UserClient;

public class ResponseHeaderVerifier {

    private static final String CONTENT_TYPE = "application/json; charset=utf-8";

    public static void assertJsonContentType(String contentTypeValue) {
        Assert.assertEquals(UserClient.getContentTypeResponseHeader(), CONTENT_TYPE);
    }
}
