package com.zoolatech.post_requests;

import com.zoolatech.baseUrl.PetStorePlaceHolderBaseUrl;
import com.zoolatech.pojos.UserPojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateUser extends PetStorePlaceHolderBaseUrl {

    @Test
    public void postRequest() {
        //Set the url
        spec.pathParam("first","user");

        //Create a payload
        UserPojo payload = new UserPojo(155,null,"Ibrahim","Akar",
                "ibrahim123@gmail.com","ibrahim123","5551112233",0);

        //Send Request and take response
        Response response = given(spec).body(payload).when().post("{first}");

        //Make assertions
        response.prettyPrint();
        JsonPath jsonForPost = response.jsonPath();
        assertEquals(200,response.statusCode());
        assertEquals("application/json",response.contentType());
        assertEquals("keep-alive",response.header("Connection"));
        assertEquals(payload.getId(),jsonForPost.getInt("message"));



    }
}
