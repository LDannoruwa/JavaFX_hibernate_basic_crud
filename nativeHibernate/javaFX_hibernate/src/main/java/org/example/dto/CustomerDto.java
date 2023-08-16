package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//--------------Lombok ------------------
@Data
@NoArgsConstructor
@AllArgsConstructor
//---------------------------------------
public class CustomerDto {
    private int customer_id;
    private String customer_name;
    private String customer_address;
    private double customer_Salary;
}
