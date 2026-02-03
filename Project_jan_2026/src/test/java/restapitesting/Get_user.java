package restapitesting;
import org.testng.annotations.Test;
import com.aventstack.extentreports.gherkin.model.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Get_user {
  @Test
  public void getuser() {
	  //RestAssured.baseURI="https://api.restful-api.dev";
//	  RestAssured.baseURI="https://api.restful-api.dev/objects?id=3&id=5&id=10";
	  RestAssured.baseURI="https://api.restful-api.dev/objects/7";
	  RestAssured.given()
			  .when()
			  .get("/objects")
			  .then()
//			  .statusCode(200)
//			  .statusCode(404)
			  .statusCode(404)
			  .log().all();
  }
}