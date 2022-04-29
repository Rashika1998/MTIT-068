package productservicepublisher;

import java.util.Scanner;

public class ProductServicePublishImpl implements ProductServicePublish {
	
	Item item_1 = new Item(1, "Monitor", "ITEM_001", "Monitor description", 25.0);
	Item item_2 = new Item(2, "Key Board", "ITEM_002", "Key Board description", 15.0);
	Item item_3 = new Item(3, "Mouse", "ITEM_003", "Mouse description", 12.0);
	Item item_4 = new Item(4, "Speaker", "ITEM_004", "Speaker description", 20.0);
	Item item_5 = new Item(5, "Head Set", "ITEM_005", "Head Set description", 8.0);
	
	Item[] items = {item_1, item_2, item_3, item_4, item_5};
	
	public String showProducts() {
		
		System.out.println("---------------Product List-----------------");
		System.out.println();
		
		for(Item item : items) {
			System.out.println(item.toStringWith());
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("Add new product....");
		
		Scanner scanner = new Scanner(System.in);
		Item item_6 = new Item();
		
		System.out.println("Enter product Id:");
		String id = scanner.nextLine();
		
		System.out.println("Enter product name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter product price:");
		String price = scanner.nextLine();
		
		System.out.println("Enter product code:");
		String code = scanner.nextLine();
		
		System.out.println("Enter product desc:");
		String desc = scanner.nextLine();
		
		int pid = Integer.parseInt(id);
		double pprice = Double.parseDouble(price);
		
		item_6.setId(pid);
		item_6.setItemCode(code);
		item_6.setItemName(name);
		item_6.setItemDesc(desc);
		item_6.setItemPrice(pprice);
		
		System.out.println(item_6.toStringWith());
		
		return "Done";
		
	}

}
