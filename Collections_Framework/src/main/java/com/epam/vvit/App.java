package com.epam.vvit;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    public static void main( String[] args )
    {	
    	LinkedList<String> list=new LinkedList<String>();
    	LinkedList<String> new_list = new LinkedList<String>();
    	Scanner scan = new Scanner(System.in);
    	final Logger logger=LogManager.getLogger(App.class);
    	list.add("India");
    	list.add("America");
    	list.add("China");
    	list.add("Pakistan");
    	list.add("Canada");
    	list.add("America");
    	list.add("Singapore");
    	list.add("Korea");
    	list.add("India");
    	list.add("Russia");
    	
    	CustomList_Implementation list_methods = new CustomList_Implementation();
    	
    	logger.info("Linked List Content:"+" ");
    	Iterator<String> iterator=list.iterator();
    	while(iterator.hasNext()) {
    		logger.info(iterator.next()+", ");
    	}
    	
    	String choice;
    	
    	while(true) {
    		logger.info("Choose Operations:\n1. Addition\n2. Deletion\n3. Fetch\n4. Print\n5.Exit");
    		choice = scan.next();
    		int k;
    		try {
    			 k = Integer.parseInt(choice);
    		
    		switch(k) {
    			case 1:
    				
	    				logger.info("Enter item to add:");
	    				String item = scan.next();
	    				try {
	    				logger.info("Enter index to add");
	    				int index = scan.nextInt();
	    				list_methods.Add_Item(list, item, index);
	    				logger.info("List Content is:"+list);
	    				
	    				
    				}
    				
    				catch(Exception e) {
    					logger.error("Insufficient size");
    				}
	    			break;
    			case 2:
    				logger.info("1. remove_Item_Index   2. Remove_If");
    				int ch = scan.nextInt();
    				if(list.size()==0) {
    					logger.warn("List is empty!!");
    				}
    				if(ch==1) {
    					logger.info("Enter item_index to remove");
    					int item1 = scan.nextInt();
    					list_methods.Remove_Item(list, item1);
    					logger.info("List Content"+list);
        				break;

    				}
    				else if(ch==2) {
    					list_methods.Remove_All(list);

    					logger.info("List items are successfully removed");
    					logger.info("List Content"+list);
    					break;
    				}
    			case 3:
    				logger.info("Enter the index of item to search:");
    				int item_index = scan.nextInt();
    				if(list.size()==0) {
    					logger.warn("List is empty!!");
    				}
    				else {
    					String item1 = list_methods.Fetch_Item(list, item_index);
    					logger.info("Item is: "+item1);
    				}
    				break;
    			case 4:
    				logger.info("List Content is:");
    				for(String i:list) {
    					logger.info(i);
    				}
    				break;
    			case 5:
    				logger.info("Application closed");
    				return;
    			default: logger.error("choose a valid option");
    		}
    		}
    		catch(Exception e) {
    			logger.error("Choose an integer");
    		}
    	}
		
    	}
    }

	

