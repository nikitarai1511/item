package com.itemDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itemDetail.Items.Item;



@RestController
public class ItemController {
	

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/items")
	public List<Item> getAllItems()
	{
		System.out.println("Hey I am here!!");
		return itemService.getAllItems();
	}
		 

}

