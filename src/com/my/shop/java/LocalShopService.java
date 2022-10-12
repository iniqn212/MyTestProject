package com.my.shop.java;

import java.util.List;

public class LocalShopService {

	public static void displayProductInfo() {

		List<GetInfoProductFromFile> products = AddProductFromFile
				.ReadProductFile("C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv");

		for (GetInfoProductFromFile item : products) {
			int count = 0;

			count++;
			if (count == 1) {

				System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				count = 0;
			}
			System.out.println(item);
		}

	}

	public static float findExpensivestItem() {

		List<GetInfoProductFromFile> products = AddProductFromFile
				.ReadProductFile("C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv");

		float biggestPrice = 0;

		for (GetInfoProductFromFile item : products) {

			if (biggestPrice < item.getPrice()) {
				biggestPrice = item.getPrice();
			}

		}
		return biggestPrice;

	}

	public static String[] findExpensivestItemName(float expensivestItemPrice) {

		List<GetInfoProductFromFile> products = AddProductFromFile
				.ReadProductFile("C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv");

		String biggestPriceItem[] = new String[3];

		for (GetInfoProductFromFile item : products) {

			if (expensivestItemPrice == item.getPrice()) {
				biggestPriceItem[0] = item.getBrand();
				biggestPriceItem[1] = item.getName();
				biggestPriceItem[2] = item.getModel();
			}

		}
		return biggestPriceItem;
	}

	static float findCheapestItemPrice() {

		List<GetInfoProductFromFile> products = AddProductFromFile
				.ReadProductFile("C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv");

		float lowerPrice = products.get(0).getPrice();

		for (GetInfoProductFromFile item : products) {

			if (lowerPrice > item.getPrice()) {
				lowerPrice = item.getPrice();
			}

		}
		return lowerPrice;

	}

	public static String[] findCheapestItemName(float expensivestItemPrice) {

		List<GetInfoProductFromFile> products = AddProductFromFile
				.ReadProductFile("C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv");

		String lowerPriceItem[] = new String[3];

		for (GetInfoProductFromFile item : products) {

			if (expensivestItemPrice == item.getPrice()) {
				lowerPriceItem[0] = item.getBrand();
				lowerPriceItem[1] = item.getName();
				lowerPriceItem[2] = item.getModel();
			}

		}
		return lowerPriceItem;
	}

}
