package com.itemDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itemDetail.Items.Item;

@Service
public class ItemService {
	
	       private List<Item> items=new ArrayList<> (Arrays.asList(
			new Item(101,"item001","Renold pen","Pen of Renolds","www.abcd.com/abdh","pen",  10),
			new Item(102,"item002","Lays chips","chips of lays","www.abcd.com/abdh","chips", 20)
			));

		public List<Item> getAllItems() {
			// TODO Auto-generated method stub
//			List<Item> items=new ArrayList<>();
//			itemrepository.findAll()
//			.forEach(items::add);
			return items;
		}
	       
	       

}
