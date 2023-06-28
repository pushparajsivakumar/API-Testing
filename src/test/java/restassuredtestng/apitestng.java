package restassuredtestng;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class apitestng {

	@Test

	private void getRequest() {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		ResponseBody body = response.body();

		System.out.println(body);

	}

}
