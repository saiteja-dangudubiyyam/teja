package com.restassured.practise;

import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class put {
    public static void main(String[] args) throws IOException {
        RestAssured.baseURI="https://tejalearn.atlassian.net";
       byte[] input= Files.readAllBytes(Paths.get("src/main/resources/update.json"));
        String req= new String(input);

        String response= given().auth().preemptive().basic("425saiteja434@gmail.com","j4Dz6tw28A0cL9l7EOJl851B").
                header("Content-type", "application/json").
                body(req).
                when().
                put("/rest/api/2/issue/PRAC-5").
                then().log().all().assertThat().
                statusCode(204).extract().response().asString();


    }
}
