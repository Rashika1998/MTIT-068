package productservicepublisher;


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
		
		return "Done";
		
	}

}
