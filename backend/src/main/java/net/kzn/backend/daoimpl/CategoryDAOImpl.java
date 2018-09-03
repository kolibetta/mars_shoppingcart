package net.kzn.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.backend.dao.CategoryDAO;
import net.kzn.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories=new ArrayList<>();
	
	static{
		
		Category category=new Category();
		///adding fiest category
		category.setCat_id(1);
		category.setCat_name("Television");
		category.setCat_descr("Welcome to Quinta");
		category.setCat_imgurl("CAT_1.png");
		
		categories.add(category);
		
		category=new Category();
		///adding Second category
		category.setCat_id(2);
		category.setCat_name("Mobile");
		category.setCat_descr("Welcome to Quinta");
		category.setCat_imgurl("CAT_2.png");
		categories.add(category);
		
		category=new Category();
		///adding third category
		category.setCat_id(3);
		category.setCat_name("Computer");
		category.setCat_descr("Welcome to Quinta");
		category.setCat_imgurl("CAT_3.png");
		categories.add(category);		
		
		
		
	}

	@Override
	public List<Category> list() {
		// categories Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int cat_id) {
		for(Category category:categories){
			if(category.getCat_id()==cat_id){
				return category;
			}
		}
		return null;
	}

}
