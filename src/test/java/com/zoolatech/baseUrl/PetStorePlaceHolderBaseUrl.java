package com.zoolatech.baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class PetStorePlaceHolderBaseUrl {
    protected RequestSpecification spec;

    @Before
    public void setUp(){
        String baseUrl ="https://petstore.swagger.io/v2";
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri(baseUrl).build();
    }
}
