package com.my.shop.java;

public class LocalTechnicShop {

	public static void main(String[] args) {
		
		
		
		LocalShopService.displayProductInfo();
		

		float expensivestItemPrice = LocalShopService.findExpensivestItem();
		String expensivestItemName[] = LocalShopService.findExpensivestItemName(expensivestItemPrice);
		System.out.println("Our expensivest item is: " + expensivestItemName[0] + " " + expensivestItemName[1] + " "
				+ expensivestItemName[2] + " with price of: " + expensivestItemPrice + "$");
		
		System.out.println();
		
		float cheapestItemPrice = LocalShopService.findCheapestItemPrice();
		String cheapestItemName[] = LocalShopService.findCheapestItemName(cheapestItemPrice);
		System.out.println("Our cheapest item is: " + cheapestItemName[0] + " " + cheapestItemName[1] + " "
				+ cheapestItemName[2] + " with price of: " + cheapestItemPrice + "$");

		System.out.println("-------------------------");
		GetInfoProductFromFile.companyInfo();
	}

}