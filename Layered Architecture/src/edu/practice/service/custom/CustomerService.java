package edu.practice.service.custom;

import edu.practice.dto.CustomerDto;
import edu.practice.service.SuperService;

import java.util.ArrayList;

public interface CustomerService extends SuperService {
    String saveCustomer(CustomerDto customerDto)throws Exception;
    String updateCustomer(CustomerDto customerDto)throws Exception;
    String deleteCustomer(String custId)throws Exception;
    CustomerDto getCustomer(String custId)throws Exception;
    ArrayList<CustomerDto> getAllCustomers()throws Exception;
}
