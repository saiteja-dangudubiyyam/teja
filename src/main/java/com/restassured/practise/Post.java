package com.restassured.practise;

import io.restassured.RestAssured;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public  class Post {
//    @Test
//    public void authTest(){
//       RestAssured.given()
//
//    }

@Test
//    public void test_post() throws FileNotFoundException {
//    FileInputStream fi = new FileInputStream(new File("src/main/resources/jira.json"));
//    RestAssured.baseURI="https://tejalearn.atlassian.net";
//    JSONObject request = new JSONObject();
//     given().
//            header("Content-type", "application/json").auth().preemptive().basic("425saiteja434@gmail.com","j4Dz6tw28A0cL9l7EOJl851B").
//            and().
//            body(request.toString(String.valueOf(fi), "UTF-8")).
//            when().
//            post("/rest/api/2/issue/").
//            then().
//            statusCode(201).log().all();
//
//
//}
    public static void main(String[] args) throws IOException {
    RestAssured.baseURI="https://tejalearn.atlassian.net";
    byte[] i=Files.readAllBytes(Paths.get("C:\\Users\\Saiteja_Dangudubiyya\\IdeaProjects\\RESTassuredProject\\src\\main\\resources\\jira.json"));
    String s= new String(i);


    String response= given().auth().preemptive().basic("425saiteja434@gmail.com","j4Dz6tw28A0cL9l7EOJl851B").
            header("Content-type", "application/json").
            body(s).
            when().
            post("/rest/api/2/issue").
            then().log().all().assertThat().
            statusCode(201).extract().response().asString();


}
}
//    @Test
//    public void test_put() {
//        JSONObject request = new JSONObject();
////        Map<String, Object> m= new HashMap<String, Object>();
//        request.put("name", "Tej");
//        request.put("job", "Emp");
//
//        System.out.println(request);
//        given().
//                body(request.toJSONString()).
//                when().
//                post("https://reqres.in/api/users").
//                then().
//                statusCode(201).log().all();
//    }
//    public void upload(){
//        File f = new File("");
//        RestAssured.given().multiPart("file",)


