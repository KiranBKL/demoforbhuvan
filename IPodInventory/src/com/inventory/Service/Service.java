package com.inventory.Service;

import com.inventory.model.CountryInventory;

public class Service {

	public String getPrice(String country,int requirement) {
		
		CountryInventory brazil=new CountryInventory("Brazil",100,100,400);
		CountryInventory argentina=new CountryInventory("argentina",100,50,400);
		int price=0;
		if(requirement>=brazil.getQuantity()+argentina.getQuantity())
		{
			
			return "Out of Stock";
		}
		if(requirement%10==0 && requirement<=100)
		{
			switch(country)
			{
			case "Brazil":
				price=requirement
			}
		}
		return country;
			
		
		
	}

	
	
	
}
