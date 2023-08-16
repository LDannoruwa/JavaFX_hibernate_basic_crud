package org.example.service.custom;

import org.example.dto.CustomerDto;
import org.example.service.SuperService;

public interface CustomerService extends SuperService {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
