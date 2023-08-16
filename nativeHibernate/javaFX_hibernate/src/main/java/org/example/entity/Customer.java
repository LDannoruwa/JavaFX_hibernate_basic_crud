package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//--------------Lombok ------------------
@Data
@NoArgsConstructor
@AllArgsConstructor
//---------------------------------------
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private int customer_id;

    @Column(nullable = false)
    private String customer_name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String customer_address;

    @Column(nullable = false)
    private double customer_Salary;
}
