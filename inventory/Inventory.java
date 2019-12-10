package com.hcl.inventory;

public class Inventory {
private String stockId;
private String ItemName;
private int price;
private int QuantityAvail;
public String getStockId() {
	return stockId;
}
public void setStockId(String stockId) {
	this.stockId = stockId;
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantityAvail() {
	return QuantityAvail;
}
public void setQuantityAvail(int quantityAvail) {
	QuantityAvail = quantityAvail;
}

}
