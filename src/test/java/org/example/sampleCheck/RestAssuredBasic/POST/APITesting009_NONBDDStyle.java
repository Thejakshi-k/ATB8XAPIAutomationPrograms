package org.example.sampleCheck.RestAssuredBasic.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_NONBDDStyle {

    @Description("Verify the POST Request- NON-BDD Style")
    @Test
    public void test_post_NONBDDStyle(){
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);
        r.when().post();
        r.then().log().all().statusCode(200);

    }
}
