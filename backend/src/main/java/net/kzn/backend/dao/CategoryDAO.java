package net.kzn.backend.dao;

import java.util.List;

import net.kzn.backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int cat_id);
	
}
