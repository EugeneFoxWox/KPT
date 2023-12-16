package Model.RequestModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    public Long id;
    public int petId;
    public int quantity;
    public String shipDate;
    public String status;
    public boolean complete;
}
