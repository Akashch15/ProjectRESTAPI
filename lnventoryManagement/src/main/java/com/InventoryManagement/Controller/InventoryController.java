package com.InventoryManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.InventoryManagement.Entity.InventoryItem;
import com.InventoryManagement.Service.InventoryItemService;

@RestController
@RequestMapping("/api")
public class InventoryController {
	
	    @Autowired
	    InventoryItemService service;

	    @PostMapping("/addItem")
	    public InventoryItem createItem(@RequestBody InventoryItem item) {
	        return service.createItem(item);
	    }

	    @GetMapping("/getItems")
	    public List<InventoryItem> getItems() {
	        return service.getItems();
	    }

	    @GetMapping("/getItemById/{id}")
	    public InventoryItem getItemById(@PathVariable int id) {
	        return service.getItemById(id);
	    }

	    @PutMapping("/updateItem/{id}")
	    public InventoryItem updateItem(@PathVariable int id, @RequestBody InventoryItem item) {
	        return service.updateItem(id, item);
	    }

	    @DeleteMapping("/deleteItem/{id}")
	    public InventoryItem deleteItem(@PathVariable int id) {
	        return service.deleteItemById(id);
	    }
	}


