package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.backend.dao.CategoryDAO;
import net.kzn.backend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() { 
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home Page");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userclickhome", true);
		return mv;
	}
	
	/*
	 * Show All Products
	 * */
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts() { 
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userclickAllProducts", true);
		return mv;
	}
	
	
	@RequestMapping(value="/show/category/{cat_id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("cat_id") int cat_id) { 
		ModelAndView mv=new ModelAndView("page");
		//category DAO fetch single Category
		Category category=null;
		category=categoryDAO.get(cat_id);
		
		mv.addObject("title", category.getCat_name());
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userclickCategoryProducts", true);
		return mv;
	}		
	

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userclick_about", true);
		return mv;
	}

	@RequestMapping(value = { "/services" })
	public ModelAndView services() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Services");
		mv.addObject("userclick_services", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userclick_contact", true);
		return mv;
	}

	/*
	 * @RequestMapping(value={"/test", "/pummy"}) public ModelAndView
	 * test(@RequestParam(value="greeting", required=false) String greeting) {
	 * if(greeting==null){ greeting="welcome"; } ModelAndView mv=new
	 * ModelAndView("page"); mv.addObject("greeting", greeting); return mv; }
	 * 
	 * @RequestMapping(value="/test/{greeting}") public ModelAndView
	 * test(@PathVariable("greeting") String greeting) { if(greeting==null){
	 * greeting="welcome"; } ModelAndView mv=new ModelAndView("page");
	 * mv.addObject("greeting", greeting); return mv; }
	 */

}
