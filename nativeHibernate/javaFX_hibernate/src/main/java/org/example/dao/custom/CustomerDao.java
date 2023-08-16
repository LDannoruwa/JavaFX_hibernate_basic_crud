package org.example.dao.custom;

import org.example.dao.SuperDao;
import org.example.entity.Customer;

public interface CustomerDao extends SuperDao {
    boolean save(Customer customer) throws Exception;
}
