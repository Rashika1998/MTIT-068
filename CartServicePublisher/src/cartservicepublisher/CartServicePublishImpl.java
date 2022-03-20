package cartservicepublisher;
import java.util.Scanner;

public class CartServicePublishImpl implements CartServicePublish {
	
	
	Scanner scanner = new Scanner(System.in);

	public String publishCartService() {
		
		return "Executing publishCartService of CartServicePublisher";
		
	}
	
	
	public Item getBookById(int itemId, Item[] items) {
			
		Item choosenItem = new Item();
		
		for(int i = 0; i < items.length; i++) {
			int compareBookId = items[i].getId();
			if(compareBookId == itemId){
				choosenItem = items[i];
			}
		}
		
		return choosenItem;
	}
	
	
	@Override
	public String addItemToCart() {
		
		Item item_1 = new Item(1, "Monitor", "ITEM_001", "Monitor description", 25.0);
		Item item_2 = new Item(2, "Key Board", "ITEM_002", "Key Board description", 15.0);
		Item item_3 = new Item(3, "Mouse", "ITEM_003", "Mouse description", 12.0);
		Item item_4 = new Item(4, "Speaker", "ITEM_004", "Speaker description", 20.0);
		Item item_5 = new Item(5, "Head Set", "ITEM_005", "Head Set description", 8.0);
		
		
		Item[] items = {item_1, item_2, item_3, item_4, item_5};
		
		
		System.out.println("");
		System.out.println("............ITEM LIST............");
		System.out.println("");
		
		System.out.println("Monitor   : 1");
		System.out.println("Key Board : 2");
		System.out.println("Mouse     : 3");
		System.out.println("Speaker   : 4");
		System.out.println("Head Set  : 5");
		
		System.out.println("");
		System.out.println("....................................");
		
		
		
		System.out.println("Enter the item IDs maximum up to 3 items.");
		System.out.println("If you don't want to buy, press 0.");
		
		
		int itemId_1, qty_1;
		int itemId_2, qty_2;
		int itemId_3, qty_3;
		
		
		System.out.print("Enter first item ID : ");
		itemId_1 = scanner.nextInt();
		System.out.print("Quantity: ");
		qty_1 = scanner.nextInt();
		
		
		System.out.print("Enter second item ID: ");
		itemId_2 = scanner.nextInt();
		System.out.print("Quantity: ");
		qty_2 = scanner.nextInt();
		
		
		System.out.print("Enter third item ID : ");
		itemId_3 = scanner.nextInt();
		System.out.print("Quantity: ");
		qty_3 = scanner.nextInt();
		
		
		Item choosenItem_1 = new Item();
		Item choosenItem_2 = new Item();
		Item choosenItem_3 = new Item();
		
		
		switch(itemId_1) {
		
		case 1:
			choosenItem_1 = getBookById(1, items);
			break;
		case 2:
			choosenItem_1 = getBookById(2, items);
			break;
		case 3:
			choosenItem_1 = getBookById(3, items);
			break;
		case 4:
			choosenItem_1 = getBookById(4, items);
			break;
		case 5:
			choosenItem_1 = getBookById(5, items);
			break;
		default:
			break;
			
		}
		
		
		switch(itemId_2) {
		
		case 1:
			choosenItem_2 = getBookById(1, items);
			break;
		case 2:
			choosenItem_2 = getBookById(2, items);
			break;
		case 3:
			choosenItem_2 = getBookById(3, items);
			break;
		case 4:
			choosenItem_2 = getBookById(4, items);
			break;
		case 5:
			choosenItem_2 = getBookById(5, items);
			break;
		default:
			break;
			
		}

		
		switch(itemId_3) {
		
		case 1:
			choosenItem_3 = getBookById(1, items);
			break;
		case 2:
			choosenItem_3 = getBookById(2, items);
			break;
		case 3:
			choosenItem_3 = getBookById(3, items);
			break;
		case 4:
			choosenItem_3 = getBookById(4, items);
			break;
		case 5:
			choosenItem_3 = getBookById(5, items);
			break;
		default:
			break;
			
		}
	
		
		System.out.println("\n");
		
		System.out.println(choosenItem_1.toStringWith() + "\n" + choosenItem_2.toStringWith() + "\n" + choosenItem_3.toStringWith());
		
		double totalAmount = (choosenItem_1.getItemPrice() * qty_1) + (choosenItem_2.getItemPrice() * qty_2) + (choosenItem_3.getItemPrice() * qty_3);
		
		System.out.println("Total amount in cart $ " + totalAmount);
		
		return "Items have been added into cart successfully.";
		
	}

}
