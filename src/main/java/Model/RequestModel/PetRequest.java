package Model.RequestModel;

import Model.ResponseModel.CategoryResponse;
import Model.ResponseModel.TagResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetRequest {
    public Long id;
    public CategoryResponse category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<TagResponse> tags;
    public String status;
}
