package edu.practice.service.custom.impl;

import edu.practice.dao.DaoFactory;
import edu.practice.dao.custom.CustomerDao;
import edu.practice.dto.CustomerDto;
import edu.practice.entitiy.CustomerEntity;
import edu.practice.service.custom.CustomerService;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = getCustomerEntity(customerDto);
        return customerDao.create(entity) ? "SUCCESS" : "FAIL";
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = getCustomerEntity(customerDto);
        return customerDao.update(entity) ? "SUCCESS" : "FAIL";
    }

    @Override
    public String deleteCustomer(String custId) throws Exception {
        return customerDao.delete(custId) ? "SUCCESS" : "FAIL";
    }

    @Override
    public CustomerDto getCustomer(String custId) throws Exception {
        CustomerEntity entity =customerDao.get(custId);
        if (entity != null) {
            return getCustomerDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerEntity> entities = customerDao.getAll();

        if (entities != null && !entities.isEmpty()) {
            ArrayList<CustomerDto> customerDtos = new ArrayList<>();

            for (CustomerEntity entity : entities) {
                customerDtos.add(getCustomerDto(entity));
            }
            return customerDtos;
        }
        return null;
    }

    private CustomerEntity getCustomerEntity(CustomerDto customerDto) throws Exception {
        return new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getProvince(),
                customerDto.getPostal());
    }

    private CustomerDto getCustomerDto(CustomerEntity entity) throws Exception {
        return new CustomerDto(
                entity.getId(),
                entity.getTitle(),
                entity.getName(),
                entity.getDob(),
                entity.getSalary(),
                entity.getAddress(),
                entity.getCity(),
                entity.getProvince(),
                entity.getPostal()
        );
    }
}
