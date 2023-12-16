package Model.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ApiResponse {
    public int code;
    public String type;
    public String message;
}
