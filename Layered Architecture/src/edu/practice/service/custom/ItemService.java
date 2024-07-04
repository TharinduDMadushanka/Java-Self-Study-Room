package edu.practice.service.custom;

import edu.practice.dto.ItemDto;
import edu.practice.service.SuperService;

import java.util.ArrayList;

public interface ItemService extends SuperService {
    String saveItem(ItemDto itemDto)throws Exception;
    String updateItem(ItemDto itemDto)throws Exception;
    String deleteItem(String itemCode)throws Exception;
    ItemDto getItem(String itemCode)throws Exception;
    ArrayList<ItemDto> getAllItems()throws Exception;
}
