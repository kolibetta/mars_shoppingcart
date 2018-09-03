package net.kzn.backend.dto;

public class Category {

	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCat_descr() {
		return cat_descr;
	}
	public void setCat_descr(String cat_descr) {
		this.cat_descr = cat_descr;
	}
	public String getCat_imgurl() {
		return cat_imgurl;
	}
	public void setCat_imgurl(String cat_imgurl) {
		this.cat_imgurl = cat_imgurl;
	}
	public boolean isCat_status() {
		return cat_status;
	}
	public void setCat_status(boolean cat_status) {
		this.cat_status = cat_status;
	}
	
	/*
	 * Create Private Properties
	 */	
	
	private int cat_id;
	private String cat_name;
	private String cat_descr;
	private String cat_imgurl;
	private boolean cat_status =true;

}
