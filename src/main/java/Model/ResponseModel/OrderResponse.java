package Model.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderResponse {
    public int id;
    public int petId;
    public int quantity;
    public String shipDate;
    public String status;
    public boolean complete;
}
