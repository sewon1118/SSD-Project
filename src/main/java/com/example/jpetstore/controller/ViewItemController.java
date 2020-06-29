package com.example.jpetstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.jpetstore.domain.Item;
import com.example.jpetstore.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
public class ViewItemController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	
	  @RequestMapping("shop/getDeadline.do")
	  @ResponseBody public Item getDeadline(
	  @RequestParam("itemId") String itemId) throws Exception {
	  
	  Item item = this.petStore.getItem(itemId); 
	 
	  System.out.println(item.getClosingTime());
	  System.out.println(item.getTimeStatus());
	  return item;
	  
	  }
	 
	
	  @RequestMapping("/shop/viewItem.do") 
	  public String handleRequest(
	  @RequestParam("itemId") String itemId, ModelMap model) throws Exception {
	  
	  Item item = this.petStore.getItem(itemId); //List<Item> items = new
	  System.out.println("controller:is Auction?"
	  + item); model.put("item", item); model.put("product", item.getProduct());
	  return "Item";
	  
	  }
	 

}
