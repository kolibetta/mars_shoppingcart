$(function() { 
	
	switch(menu){
	
		case "About Us" :
			$("#about").addClass("active");
			break;
			
		case "Services" :
			$("#service").addClass("active");
			break;	
			
		case "Contact Us" :
			$("#contact").addClass("active");
			break;
			
		case "All Products" :
			$("#listProducts").addClass("active");
			break;			
			
		default:
			$("#home").addClass("active");
			$("#a_"+menu).addClass("active");
		break;			
			
			
	}
});