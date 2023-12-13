package com.InventoryManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InventoryManagement.Entity.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {

}

