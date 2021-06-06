package lt.tokacode.tietoevry.tripapp.logic;

import java.util.ArrayList;
import java.util.List;

import lt.tokacode.tietoevry.tripapp.model.Item;
import lt.tokacode.tietoevry.tripapp.model.ListOfItems;

public class ItemsQuantityCalculator {

	private static final double WATER_PER_KILOMETER = 0.06; // an average of 3 liters per 50 kilometer
	public ListOfItems listOfItems = new ListOfItems();
	ItemsQuantityCalculator calculator;
	

	public List<Item> needWater(int distance, List<Item> list) {

		double waterQuantity = distance * WATER_PER_KILOMETER;
		double rounderWaterQuantity = Math.round(waterQuantity*100.0)/100.0;

		for (int i = 0; i < list.size(); i++) {
			list.get(i).setWeight(rounderWaterQuantity);
		}

		return list;
	}

	public List<Item> needFood(int days, List<Item> list) {

		for (int i = 0; i < list.size(); i++) {
			double foodQuantity = list.get(i).getWeight();
			double newFoodQuantity = days * foodQuantity;
			double roundedNewFoodQuantity = Math.round(newFoodQuantity*100.0)/100.0;
			list.get(i).setWeight(roundedNewFoodQuantity);
		}

		return list;
	}

	public List<Item> needSeasonItems(String season, List<Item> list) {

		switch (season) {
		case "Spring":
			list.addAll(listOfItems.addAutumnItems(list));
			break;
		case "Summer":
			list.addAll(listOfItems.addSummerItems(list));
			break;
		case "Autumn":
			list.addAll(listOfItems.addAutumnItems(list));
			break;
		case "Winter":
			list.addAll(listOfItems.addWinterItems(list));
			break;
		}

		return list;
	}

	public List<Item> needNightItems(int days, List<Item> list) {

		if (days > 1 ) {
			listOfItems.addNightItems(list);
		}

		return list;
	}
	
	
	public List<Item> packagingFoodInTheBag(int distance, int days, List<Item> list) {

		calculator = new ItemsQuantityCalculator();
		List<Item> myDrink = new ArrayList<>();
		listOfItems.addDrinkItems(myDrink);
        calculator.needWater(distance, myDrink);
        list.addAll(myDrink);
                
		List<Item> myFood = new ArrayList<>();
		listOfItems.addFoodItems(myFood);
		calculator.needFood(days, myFood);
		list.addAll(myFood);

		return list;
	}

	public List<Item> packagingSpecialItemsInTheBag(String season, int distance, int days, List<Item> list) {

		calculator = new ItemsQuantityCalculator();
		List<Item> nightItems = new ArrayList<>();
		calculator.needNightItems(days, nightItems);
        list.addAll(nightItems);
                
		List<Item> seasonItems = new ArrayList<>();
		calculator.needSeasonItems(season, seasonItems);
		list.addAll(seasonItems);

		return list;
	}
}
