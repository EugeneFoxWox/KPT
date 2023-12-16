package Model.ResponseModel;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PetResponse {
    public Long id;
    public CategoryResponse category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<TagResponse> tags;
    public String status;
}
