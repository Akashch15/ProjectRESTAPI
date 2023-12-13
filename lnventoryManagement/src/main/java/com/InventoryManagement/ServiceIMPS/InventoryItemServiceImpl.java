package com.InventoryManagement.ServiceIMPS;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.InventoryManagement.Entity.InventoryItem;
import com.InventoryManagement.Repository.InventoryItemRepository;
import com.InventoryManagement.Service.InventoryItemService;

@Service
public class InventoryItemServiceImpl implements InventoryItemService{
	


	    @Autowired
	    InventoryItemRepository repository;

	    @Override
	    public InventoryItem createItem(InventoryItem item) {
	        return repository.save(item);
	    }

	    @Override
	    public List<InventoryItem> getItems() {
	        return repository.findAll();
	    }

	    @Override
	    public InventoryItem getItemById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    @Override
	    public InventoryItem updateItem(int id, InventoryItem item) {
	        InventoryItem existingItem = repository.findById(id).orElse(null);

	        if (existingItem != null) {
	            existingItem.setName(item.getName());
	            existingItem.setDescription(item.getDescription());
	            existingItem.setQuantity(item.getQuantity());
	            existingItem.setPrice(item.getPrice());
	            return repository.save(existingItem);
	        }

	        return null;
	    }

	    @Override
	    public InventoryItem deleteItemById(int id) {
	        InventoryItem itemToDelete = repository.findById(id).orElse(null);

	        if (itemToDelete != null) {
	            repository.deleteById(id);
	            return itemToDelete;
	        }

	        return null;
	    }
	}

