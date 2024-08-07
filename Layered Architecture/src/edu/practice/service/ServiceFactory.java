package edu.practice.service;

import edu.practice.service.custom.ItemService;
import edu.practice.service.custom.impl.CustomerServiceImpl;
import edu.practice.service.custom.impl.ItemServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public enum serviceType{
        ITEM,
        CUSTOMER
    }

    public SuperService getSuperService(serviceType serviceType) {
        switch (serviceType) {
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            default:
                return null;
        }
    }
}
