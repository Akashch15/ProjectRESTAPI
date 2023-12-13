package com.InventoryManagement.Service;

import java.util.List;
import com.InventoryManagement.Entity.InventoryItem;

public interface InventoryItemService {

	    InventoryItem createItem(InventoryItem item);

	    List<InventoryItem> getItems();

	    InventoryItem getItemById(int id);

	    InventoryItem updateItem(int id, InventoryItem item);

	    InventoryItem deleteItemById(int id);
	}
