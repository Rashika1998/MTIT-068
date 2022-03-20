package deliveryservicepublisher;

import java.util.Scanner;

public class DeliveryServicePublishImpl implements DeliveryServicePublish {

	
	Scanner scanner = new Scanner(System.in);
	
	
	public String getCustomerDeliveryDetails() {
		
		
		System.out.println("Enter required details for delivery process.");
	
		
		System.out.println("Enter your first name: ");
		String fName = scanner.nextLine();
		
		System.out.println("Enter your last name: ");
		String lName = scanner.nextLine();
		
		System.out.println("Enter your home address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter postal code: ");
		String postalCode = scanner.nextLine();
		
		System.out.println("Enter your phone number: ");
		String phone = scanner.nextLine();
		
		
		System.out.println("");
		System.out.println("............Your delivery details............");
		System.out.println("");
		
		System.out.println("Full name: " + fName + " " + lName);
		System.out.println("Home Address: " + address);
		System.out.println("Postal Code: " + postalCode);
		System.out.println("Phone number: " + phone);
		
		System.out.println("");
		System.out.println("....................................");
		
		return "Done";
	}

}
