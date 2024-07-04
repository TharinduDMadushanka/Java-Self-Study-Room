package edu.practice.dao.custom.impl;

import edu.practice.dao.CrudUtil;
import edu.practice.dao.custom.ItemDao;
import edu.practice.entitiy.ItemEntity;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean create(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?,?,?,?)",t.getItemCode(),t.getDescription(),t.getPackSize(),
                t.getUnitPrice(),t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE ITEM SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?",
                t.getDescription(),t.getPackSize(),t.getUnitPrice(),t.getQoh(),t.getItemCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode = ?",id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode = ?",id);
        if(rst.next()){
            ItemEntity entity = new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"), rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"),rst.getInt("QtyOnHand"));

            return entity;
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");

        while(rst.next()){
            ItemEntity entity = new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"), rst.getString("PackSize"),
                    rst.getDouble("UnitPrice"),rst.getInt("QtyOnHand"));

            itemEntities.add(entity);
        }
        return itemEntities;
    }
}
