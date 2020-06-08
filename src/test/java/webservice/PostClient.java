package webservice;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

public abstract class PostClient {


    public int getResponseStatusCode(String path) {
        return RestAssured
                .when()
                .get(path)
                .andReturn()
                .getStatusCode();
    }

    public String getResponseHeader(String path, String responseHeader) {
        return RestAssured
                .when()
                .get(path)
                .andReturn()
                .getHeader(responseHeader);
    }

    public ResponseBody getResponse(String path) {
        return RestAssured
                .when()
                .get(path)
                .andReturn()
                .getBody();
    }
}
