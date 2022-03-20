package paymentservicepublisher;

import java.util.Scanner;

public class PaymentServicePublishImpl implements PaymentServicePublish {

	
	Scanner scanner = new Scanner(System.in);
	
	public String publishCartService() {
		return "";
	}


	public String addPaymentService() {
		
		System.out.println("Enter the card type here");
		System.out.println("VISA - 1");
		System.out.println("MASTER - 2");
		
		
		System.out.println("Enter your card type: ");
		int cardType = scanner.nextInt();
		
		
		System.out.println("Enter card number: ");
		long cardNumber = scanner.nextLong();
		
		System.out.println("Enter cvv number: ");
		long cvvNumber = scanner.nextLong();
		
		System.out.println("Enter expire date : ");
		
		System.out.println("Enter day : ");
		long day = scanner.nextLong();
		
		System.out.println("Enter month : ");
		long month = scanner.nextLong();
		
		
		System.out.println("");
		System.out.println("............Your Payment details............");
		System.out.println("");
		
		
		if(cardType == 1) {
			System.out.println("You choose VISA type.");
		}else if(cardType == 2) {
			System.out.println("You choose MASTER type.");
		}else {
			System.out.println("Your answare is wrong.");
		}
		
		System.out.println("Card number: " + cardNumber);
		System.out.println("CVV: " + cvvNumber);
		System.out.println("Expire Date: " + day + "/" + month);

		
		System.out.println("");
		System.out.println("....................................");
		
		return "Done";
		
	}

}
