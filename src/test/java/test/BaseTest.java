package test;

import webservice.PostClient;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest extends PostClient {

    @BeforeTest
    public void initTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
