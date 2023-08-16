package org.example.service.custom.impl;

import org.example.dao.DAOType;
import org.example.dao.DaoFactory;
import org.example.dao.custom.CustomerDao;
import org.example.dto.CustomerDto;
import org.example.entity.Customer;

import org.example.service.custom.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = DaoFactory.getDao(DAOType.CUSTOMER);
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
        Customer customer = new Customer(
                dto.getCustomer_id(),
                dto.getCustomer_name(),
                dto.getCustomer_address(),
                dto.getCustomer_Salary()
        );
        return customerDao.save(customer);
    }
}
