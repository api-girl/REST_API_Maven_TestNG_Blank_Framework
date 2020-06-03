package tests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    String publicKey = System.getenv("%s_PUBLIC_KEY");
    String secretKey = System.getenv("%s_SECRET_KEY");

    @BeforeClass
    public void setUpReqSpec() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://api.spotify.com").
                build();
    }

    @BeforeMethod
    public void setUpRespSpec() {
        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).
                build();
    }

}
