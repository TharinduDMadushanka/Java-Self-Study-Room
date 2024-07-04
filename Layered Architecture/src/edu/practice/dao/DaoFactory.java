package edu.practice.dao;

import edu.practice.dao.custom.ItemDao;
import edu.practice.dao.custom.impl.ItemDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {}

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        ITEM, CUSTOMER, ORDER, ORDER_DETAIL;
    }
}
