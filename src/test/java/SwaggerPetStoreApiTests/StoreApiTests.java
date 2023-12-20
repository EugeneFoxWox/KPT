package SwaggerPetStoreApiTests;

import Model.RequestModel.OrderRequest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import static steps.Steps.API_STEPS;

@Epic("StoreController")
public class StoreApiTests {

    @Feature("Создание нового заказа")
    @Test
    public void addNewOrder() {
        API_STEPS.addNewOrder(new OrderRequest(5L, 0, 0, "2023-12-16T08:55:08.669Z", "placed", true));
    }

    @Feature("Получение заказа по идентификатору")
    @Test
    public void getOrderById() {
        API_STEPS.getOrderById(10L);
    }

    @Feature("Удаление заказа по идентификатору")
    @Test
    public void deleteOrderById() {
        API_STEPS.deleteOrderById(5L);
    }

    @Feature("Получение инвентаря магазина")
    @Test
    public void getInventory() {
        API_STEPS.getInventory();
    }



}
