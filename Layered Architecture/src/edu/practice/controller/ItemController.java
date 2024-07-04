package edu.practice.controller;

import edu.practice.dto.ItemDto;
import edu.practice.service.ServiceFactory;
import edu.practice.service.custom.ItemService;

import java.util.ArrayList;

public class ItemController {
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getSuperService(ServiceFactory.serviceType.ITEM);

    public String saveItem(ItemDto itemDto)throws Exception{
        return itemService.saveItem(itemDto);
    }
    public String updateItem(ItemDto itemDto)throws Exception{
        return itemService.updateItem(itemDto);
    }
    public String deleteItem(String itemCode)throws Exception{
        return itemService.deleteItem(itemCode);
    }
    public ItemDto getItem(String itemCode)throws Exception{
        return itemService.getItem(itemCode);
    }
    public ArrayList<ItemDto> getAllItems()throws Exception{
        return itemService.getAllItems();
    }
}
