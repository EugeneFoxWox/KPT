package SwaggerPetStoreApiTests;

import Model.RequestModel.UserRequest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static steps.Steps.API_STEPS;

@Epic("UserController")
public class UserApiTests {

    @Feature("Получение пользователя по имени")
    @Test
    public void getUserByName() {
        API_STEPS.getUserByName("string");
    }

    @Feature("Удаление пользователя по имени")
    @Test
    public void deleteUserByName() {
        API_STEPS.deleteUserByName("string");
    }

    @Feature("Авторизация пользователя")
    @Test
    public void logInUser() {
        API_STEPS.logInUser("superJenkin", "12345");
    }

    @Feature("Выход из системы")
    @Test
    public void logOutUser() {
        API_STEPS.logOutUser();
    }

    @Feature("Добавление нового пользователя")
    @Test
    public void addNewUser() {
        API_STEPS.addNewUser(new UserRequest(0L, "string", "string", "string", "string", "string", "string", 0L));
    }
}
