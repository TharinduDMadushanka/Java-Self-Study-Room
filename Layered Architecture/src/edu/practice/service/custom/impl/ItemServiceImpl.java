package edu.practice.service.custom.impl;

import edu.practice.dao.DaoFactory;
import edu.practice.dao.custom.ItemDao;
import edu.practice.dto.ItemDto;
import edu.practice.entitiy.ItemEntity;
import edu.practice.service.custom.ItemService;

import java.util.ArrayList;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity entity =  getItemEntity(itemDto);
        return itemDao.create(entity) ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity entity =  getItemEntity(itemDto);
        return itemDao.update(entity) ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String itemCode) throws Exception {
        return itemDao.delete(itemCode) ? "Success" : "Fail";
    }

    @Override
    public ItemDto getItem(String itemCode) throws Exception {
        ItemEntity entity = itemDao.get(itemCode);
        if (entity != null) {
            return getitemDto(entity);
        }
    }

    @Override
    public ArrayList<ItemDto> getAllItems() throws Exception {
        ArrayList<ItemEntity> entities = itemDao.getAll();
        if (entities != null && !entities.isEmpty()) {
            ArrayList<ItemDto> itemDtos = new ArrayList<>();

            for (ItemEntity entity : entities) {
                itemDtos.add(getitemDto(entity));
            }
            return itemDtos;
        }
        return null;
    }

    private ItemEntity getItemEntity(ItemDto itemDto) throws Exception {
        return new ItemEntity(
                itemDto.getItemCode(),
                itemDto.getDescription(),
                itemDto.getPackSize(),
                itemDto.getUnitPrice(),
                itemDto.getQoh()
        );
    }

    private ItemDto getitemDto(ItemEntity entity) throws Exception {
        return new ItemDto(
                entity.getItemCode(),
                entity.getDescription(),
                entity.getPackSize(),
                entity.getUnitPrice(),
                entity.getQoh()
        );
    }
}
