package steps;

import Model.RequestModel.OrderRequest;
import Model.RequestModel.PetRequest;
import Model.RequestModel.UserRequest;
import Model.ResponseModel.ApiResponse;
import Model.ResponseModel.OrderResponse;
import Model.ResponseModel.PetResponse;
import Model.ResponseModel.UserResponse;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiSteps {
    @Step("Добавить нового питомца")
    public PetResponse addNewPet(PetRequest request) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/pet")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PetResponse.class);

    }
    @Step("Обновить питомца питомца")
    public PetResponse updatePet(PetRequest request) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .put("/pet")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PetResponse.class);

    }
    @Step("Найти питомцев по статусу")
    public List<PetResponse> getPetByStatus(String status) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/findByStatus?status=" + status )
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().jsonPath().getList("data", PetResponse.class);

    }

    @Step
    public PetResponse getPetById(Long petId) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/" + petId )
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(PetResponse.class);

    }
    @Step
    public void deletePetById(Long petId) {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .when()
                .delete("/pet/" + petId)
                .then()
                .assertThat()
                .statusCode(404).extract().response();

    }

    @Step("Добавить новый заказ")
    public OrderResponse addNewOrder(OrderRequest request) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/store/order/")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(OrderResponse.class);

    }
    @Step
    public OrderResponse getOrderById(Long orderId) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/store/order/" + orderId)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(OrderResponse.class);
    }

    @Step
    public OrderResponse deleteOrderById(Long orderId) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/store/order/" + orderId)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(OrderResponse.class);
    }

    @Step
    public void getInventory() {
         given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/store/inventory")
                .then()
                .assertThat()
                .statusCode(200).extract().response();
    }

    @Step
    public UserResponse getUserByName(String userName) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/user/" + userName)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(UserResponse.class);
    }

    @Step
    public UserResponse deleteUserByName(String userName) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/user/" + userName)
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(UserResponse.class);
    }

    @Step
    public void logInUser(String username, String password) {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/user/login?username=" + username + "&password=" + password)
                .then()
                .assertThat()
                .statusCode(200).extract().response();
    }

    @Step
    public void logOutUser() {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/user/logout")
                .then()
                .assertThat()
                .statusCode(200).extract().response();
    }




    @Step("Добавить нового питомца")
    public ApiResponse addNewUser(UserRequest request) {
        return given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/user")
                .then()
                .assertThat()
                .statusCode(200).extract().response().body().as(ApiResponse.class);

    }
}
