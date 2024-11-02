package Seminars;

public class ApiTest 
{
	java
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class APITest {

	    @Test
	    public void testSearchAPI() {
	        // Define base URL and endpoint
	        RestAssured.baseURI = "https://api.example.com";
	        String endpoint = "/search";

	        // Define query parameters
	        String searchKeyword = "example";
	        String queryParams = "q=" + searchKeyword;

	        // Send GET request to API
	        Response response = RestAssured.given()
	                .queryParam(queryParams)
	                .get(endpoint);

	        // Validate status code
	        Assert.assertEquals(response.getStatusCode(), 200);

	        // Validate response body - example assertion
	        String responseBody = response.getBody().asString();
	        Assert.assertTrue(responseBody.contains("example results"));

	        // Add more assertions as per API response structure and requirements
	    }
	}


