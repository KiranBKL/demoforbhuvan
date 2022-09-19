package com.inventory.presentation;

import java.util.Scanner;

import com.inventory.Service.Service;
import com.inventory.model.CountryInventory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountryInventory brazil=new CountryInventory("Brazil",100,100,400);
		CountryInventory argentina=new CountryInventory("argentina",100,50,400);
		
		Scanner scan=new Scanner(System.in);
		
		Service service=new Service();
		System.out.println("Enter the country and requirement");
		String country=scan.nextLine();
		int requirement=scan.nextInt();
		System.out.println(service.getPrice(country,requirement));
		
	}

}
