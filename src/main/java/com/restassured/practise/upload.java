package com.restassured.practise;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

public class upload {

    public static void main(String[] args){
//        RestAssured.baseURI="https://tejalearn.atlassian.net";

        Response res=RestAssured.given().
                auth().preemptive().basic("425saiteja434@gmail.com","j4Dz6tw28A0cL9l7EOJl851B")
              .header("X-Atlassian-Token", "no-check")
                .multiPart("file", new File
                        ("C:/Users/Saiteja_Dangudubiyya/Pictures/Saved Pictures/Capture.png"),"image/png")
                .post("https://tejalearn.atlassian.net/rest/api/2/issue/PRAC-5/attachments").thenReturn();
        System.out.println(res.prettyPrint());

    }
}
