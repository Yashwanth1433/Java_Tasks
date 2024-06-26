package datastructures.search;

public class LinearProductsSearchDemo {
	
	public static Product linearSearchById(Product[] products, int id) {
	for(Product product : products) {
		if(product.getId() == id) {
			return product;
		}
	}
	return null;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product [] products = {
				new Product(1,"Laptop", 99000.00),
				new Product(2,"Desktop", 630000.00),
				new Product(3,"Tab", 30000.00),
				new Product(4,"Smart Tv", 55000.00),
				new Product(5,"Speakers", 10000.00),
		};
		
		int searchid = 3;
		Product result = linearSearchById(products, searchid);
		if( result != null) {
			System.out.println("Product Found: " + result);
		}else {
			System.out.println("Product with ID " + searchid + " not found.");
			
		}

	}

}   
