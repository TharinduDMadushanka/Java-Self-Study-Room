package edu.practice.controller;

import edu.practice.dto.CustomerDto;
import edu.practice.service.ServiceFactory;
import edu.practice.service.custom.CustomerService;

import java.util.ArrayList;

public class CustomerController {
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getSuperService(ServiceFactory.serviceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto)throws Exception {
        return customerService.saveCustomer(customerDto);
    }

    public String updateCustomer(CustomerDto customerDto)throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id)throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String id)throws Exception {
        return customerService.getCustomer(id);
    }

    public ArrayList<CustomerDto> getAllCustomer()throws Exception {
        return customerService.getAllCustomers();
    }
}
