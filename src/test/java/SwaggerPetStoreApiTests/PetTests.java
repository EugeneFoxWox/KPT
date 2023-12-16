package SwaggerPetStoreApiTests;

import Model.RequestModel.OrderRequest;
import Model.RequestModel.PetRequest;
import Model.RequestModel.UserRequest;
import Model.ResponseModel.CategoryResponse;
import Model.ResponseModel.TagResponse;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static steps.Steps.API_STEPS;

public class PetTests {
    @Test
    public void addNewPet() {
        ArrayList<String> photos = new ArrayList<>();
        photos.add("string");
        ArrayList<TagResponse> tags = new ArrayList<TagResponse>();
        tags.add(new TagResponse(0L, "string"));
        API_STEPS.addNewPet(new PetRequest(5L,new CategoryResponse(0, "string"), "doggie", photos, tags, "available"));
    }
    @Test
    public void getPetById() {
        API_STEPS.getPetById(1L);
    }

    @Test
    public void deletePet() {
        API_STEPS.deletePetById(2L);
    }

    @Test
    public void getOrderById() {
        API_STEPS.getOrderById(10L);
    }

    @Test
    public void getUserByName() {
        API_STEPS.getUserByName("string");
    }

    @Test
    public void addNewOrder() {
        API_STEPS.addNewOrder(new OrderRequest(5L, 0, 0, "2023-12-16T08:55:08.669Z", "placed", true));
    }

    @Test
    public void addNewUser() {
        API_STEPS.addNewUser(new UserRequest(0L, "string", "string", "string", "string", "string", "string", 0L));
    }

}
