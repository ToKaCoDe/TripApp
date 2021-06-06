package lt.tokacode.tietoevry.tripapp.model;

import java.util.List;

public class ListOfItems {

	public List<Item> addSummerItems(List<Item> theItemList){
		theItemList.add(new Item("Sun cream", "summer", 0.2));
		theItemList.add(new Item("Hat", "summer", 0.1));
		
		return theItemList;
	}
	
	public List<Item> addAutumnItems(List<Item> theItemList){
		theItemList.add(new Item("Rain jacket", "autumn", 0.2));
		
		return theItemList;
	}
	
	public List<Item> addWinterItems(List<Item> theItemList){
		theItemList.add(new Item("Winter gloves", "winter", 0.2));
		theItemList.add(new Item("Winter hat", "winter", 0.2));
		
		return theItemList;
	}
	
	public List<Item> addNightItems(List<Item> theItemList){
		theItemList.add(new Item("Sleeping bag", "night", 0.85));
		theItemList.add(new Item("Flashlight", "night", 0.3));
		theItemList.add(new Item("Lighter", "night", 0.05));
		
		return theItemList;
	}
	
	public List<Item> addSpecialItems(List<Item> theItemList){
		theItemList.add(new Item("Paper map", "special", 0.1));
		theItemList.add(new Item("Aid-Kit", "special", 0.25));
		theItemList.add(new Item("Knife", "special", 0.2));
		theItemList.add(new Item("Power bank", "special", 0.1));
		theItemList.add(new Item("Paper napkins", "special", 0.05));
		theItemList.add(new Item("Phone", "special", 0.17));
		
		return theItemList;
	}
	
	public List<Item> addDrinkItems(List<Item> theItemList){
		theItemList.add(new Item("Water", "drink", 1.0));
		
		return theItemList;
	}
	
	public List<Item> addFoodItems(List<Item> theItemList){
		theItemList.add(new Item("Nuts", "food", 0.06));
		theItemList.add(new Item("Black chocolate", "food", 0.08));
		theItemList.add(new Item("Bread", "food", 0.09));
		theItemList.add(new Item("Dried fruits", "food", 0.05));
		theItemList.add(new Item("Cereal bars", "food", 0.09));
		
		return theItemList;
	}
	

}
