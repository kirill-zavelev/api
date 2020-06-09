package webservice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UserClient {

    private static final String URL_PATH = "/users";
    private static final String RESPONSE_HEADER = "Content-Type";

    public static Response getResponseStatusCode() {
        return RestAssured
                .when()
                .get(URL_PATH)
                .andReturn();
    }

    public static String getContentTypeResponseHeader() {
        return RestAssured
                .when()
                .get(URL_PATH)
                .andReturn()
                .getHeader(RESPONSE_HEADER);
    }

    public static ResponseBody<?> getResponseBody() {
        return RestAssured
                .when()
                .get(URL_PATH)
                .andReturn()
                .getBody();
    }
}
