package ms.opencloudsummit;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class ExampleTest {
    @Test
    public void testJaxrs() {
        RestAssured.when().get("/api/hello").then()
                .contentType("text/plain")
                .body(equalTo("Hello OSS SUMMIT 2019"));
    }

    @Test
    public void testServlet() {
        RestAssured.when().get("/api/servlet/hello").then()
                .contentType("text/plain")
                .body(equalTo("Hello OSS SUMMIT 2019 - Servlet"));
    }

    @Test
    public void testVertx() {
        RestAssured.when().get("/api/vertx/hello").then()
                .contentType("text/plain")
                .body(equalTo("Hello OSS SUMMIT 2019 - Vert.X"));
    }
}

