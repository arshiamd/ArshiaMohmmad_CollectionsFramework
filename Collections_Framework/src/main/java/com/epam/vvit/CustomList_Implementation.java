package com.epam.vvit;

import java.util.LinkedList;

public class CustomList_Implementation {
	public void Add_Item(LinkedList<String> list,String item,int index) {
			list.add(index,item);
	}
	public void Remove_Item(LinkedList<String> list, int item) {
		
		list.remove(item);
	}
	
	public String Fetch_Item(LinkedList<String> list, int item_index) {
			return list.get(item_index);
	}
	public void Remove_All(LinkedList<String> list) {
		// TODO Auto-generated method stub
		list.removeAll(list);
		
	}
	
}
