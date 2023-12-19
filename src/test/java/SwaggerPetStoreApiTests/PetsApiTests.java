package SwaggerPetStoreApiTests;
import Model.RequestModel.PetRequest;
import Model.ResponseModel.CategoryResponse;
import Model.ResponseModel.TagResponse;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static steps.Steps.API_STEPS;

@Epic("PetsController")
public class PetsApiTests {

    @Feature("Добавление нового питомца")
    @Test
    public void addNewPet() {
        ArrayList<String> photos = new ArrayList<>();
        photos.add("string");
        ArrayList<TagResponse> tags = new ArrayList<TagResponse>();
        tags.add(new TagResponse(0L, "string"));
        API_STEPS.addNewPet(new PetRequest(5L,new CategoryResponse(0, "string"), "doggie", photos, tags, "available"));
    }
    @Feature("Обновление питомца")
    @Test
    public void UpdatePet() {
        ArrayList<String> photos = new ArrayList<>();
        photos.add("string");
        ArrayList<TagResponse> tags = new ArrayList<TagResponse>();
        tags.add(new TagResponse(0L, "string"));
        API_STEPS.updatePet(new PetRequest(5L,new CategoryResponse(0, "string"), "doggie", photos, tags, "available"));
    }

    @Feature("Получение питомцев по статусу")
    @Test
    public void getPetByStatus() {
        API_STEPS.getPetByStatus("pending");
    }

    @Feature("Получение питомца по идентификатору")
    @Test
    public void getPetById() {
        API_STEPS.getPetById(1L);
    }

    @Feature("Удаление питомца по идентификатору")
    @Test
    public void deletePet() {
        API_STEPS.deletePetById(2L);
    }

}
