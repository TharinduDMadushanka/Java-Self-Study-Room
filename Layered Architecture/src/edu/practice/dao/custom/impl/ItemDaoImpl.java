package edu.practice.dao.custom.impl;

import edu.practice.dao.custom.ItemDao;
import edu.practice.entitiy.ItemEntity;

import java.util.ArrayList;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean create(ItemEntity itemEntity) throws Exception {
        return false;
    }

    @Override
    public boolean update(ItemEntity itemEntity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ItemEntity itemEntity) throws Exception {
        return false;
    }

    @Override
    public ItemEntity get(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        return null;
    }
}
