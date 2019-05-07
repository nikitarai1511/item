package com.itemDetail.Items;

public class Item {
	int id;
	String ProductSKU;
	String name;
	String Description;
	String ImageURL;
	String Categories;
	int price;
	public Item(int id, String productSKU, String name, String description, String imageURL, String categories,
			int price) {
		super();
		this.id = id;
		ProductSKU = productSKU;
		this.name = name;
		Description = description;
		ImageURL = imageURL;
		Categories = categories;
		this.price = price;
	}
	public Item(int i, String string, String string2, String string3, String string4, int price) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductSKU() {
		return ProductSKU;
	}
	public void setProductSKU(String productSKU) {
		ProductSKU = productSKU;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public String getCategories() {
		return Categories;
	}
	public void setCategories(String categories) {
		Categories = categories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int  price) {
		this.price = price;
	}
	
	

}
