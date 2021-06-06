package lt.tokacode.tietoevry.tripapp.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lt.tokacode.tietoevry.tripapp.logic.ItemsQuantityCalculator;
import lt.tokacode.tietoevry.tripapp.model.Item;

@Controller
public class TrekAppController {

	@GetMapping("/")
	public String showHomePage() {
		
		return "homepage";
	}
	
	@GetMapping("/baglist")
	public String showBagList(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theSeason = request.getParameter("season");
		int distance = Integer.parseInt(request.getParameter("kmOfTrek"));
		int duration = Integer.parseInt(request.getParameter("daysOfTrek"));
		
		ItemsQuantityCalculator itemsQuantityCalculator = new ItemsQuantityCalculator();
		
		List<Item> foodResult = new ArrayList<>();
		itemsQuantityCalculator.packagingFoodInTheBag(distance, duration, foodResult);
		
		List<Item> specialItemResult = new ArrayList<>();
		itemsQuantityCalculator.packagingSpecialItemsInTheBag(theSeason, distance, duration, specialItemResult);
		
		model.addAttribute("foodResult", foodResult);
		model.addAttribute("specialItemResult", specialItemResult);
		
		return "baglist";
	}
	
	
}
