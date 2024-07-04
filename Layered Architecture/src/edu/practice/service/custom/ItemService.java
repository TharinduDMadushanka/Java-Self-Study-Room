package edu.practice.service.custom;

import edu.practice.dto.ItemDto;
import edu.practice.service.SuperService;

import java.util.ArrayList;

public interface ItemService extends SuperService {
    String saveItem(ItemDto itemDto)throws Exception;
    String updateItem(ItemDto itemDto)throws Exception;
    String deleteItem(ItemDto itemDto)throws Exception;
    ItemDto getItem(int id)throws Exception;
    ArrayList<ItemDto> getAllItems()throws Exception;
}
