package com.InventoryManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "Inventory_Items")
public class InventoryItem {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ITEM_ID")
	    private int id;
	    
	    @Column(name = "ITEM_NAME")
	    private String name;
	    
	    @Column(name = "ITEM_DESCRIPTION")
	    private String description;
	    
	    @Column(name = "ITEM_QUANTITY")
	    private int quantity;
	    
	    @Column(name = "ITEM_PRICE")
	    private double price;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		public InventoryItem() {
			super();
		}

		public InventoryItem(int id, String name, String description, int quantity, double price) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.quantity = quantity;
			this.price = price;
		}
}
