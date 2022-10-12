package com.my.shop.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddProductFromFile {

	String productListFilePath = "C://Users//iniqn//eclipse-workspace//My_Project_2//ItemsList.csv";

	public static List<GetInfoProductFromFile> ReadProductFile(String productListFilePath) {
		List<GetInfoProductFromFile> products = new ArrayList<GetInfoProductFromFile>();

		try (BufferedReader br = new BufferedReader(new FileReader(new File(productListFilePath)))) {			
			System.out.println(br.readLine().split(",").toString().repeat(0));
			System.out.println("Store Products :");
			String productData = br.readLine();

			while (productData != null) {				
				String[] splitedProductData = productData.split(",");
				int id = Integer.parseInt(splitedProductData[0]);
				String brand = splitedProductData[1];
				String name = splitedProductData[2];
				String model = splitedProductData[3];
				String type = splitedProductData[4];
				float rating = Float.parseFloat(splitedProductData[5]);
				String color = splitedProductData[6];
				String isAvailable = splitedProductData[7].toLowerCase();
				float price = Float.parseFloat(splitedProductData[8]);
				GetInfoProductFromFile product = new GetInfoProductFromFile();
				product.setId(id);
				product.setBrand(brand);
				product.setName(name);
				product.setModel(model);
				product.setType(type);
				product.setRating(rating);
				product.setColor(color);
				product.setAvailable(isAvailable);
				product.setPrice(price);

				products.add(product);

				productData = br.readLine();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return products;
	}
	
}
