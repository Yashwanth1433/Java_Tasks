package datastructures.search;

public class JumpSearchProduct {
	 public static Product jumpSearch(Product[] products, int searchId) {
	        int n = products.length;
	        int step = (int) Math.floor(Math.sqrt(n));

	        int prev = 0;
	        while (products[Math.min(step, n) - 1].getId() < searchId) {
	            prev = step;
	            step += (int) Math.floor(Math.sqrt(n));
	            if (prev >= n) {
	                return null;
	            }
	        }

	        while (products[prev].getId() < searchId) {
	            prev++;
	            if (prev == Math.min(step, n)) {
	                return null;
	            }
	        }

	        if (products[prev].getId() == searchId) {
	            return products[prev];
	        }

	        return null;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product[] products = {
		            new Product(1, "Laptop", 30000.00),
		            new Product(2, "Mobile", 40000.0),
		            new Product(3, "Tab", 45000.0),
		            new Product(4, "Smart TV", 60000.0),
		            new Product(5, "Air Cooler", 35000.0)
		        };

		        int searchId = 3;
		        Product result = jumpSearch(products, searchId);

		        if (result != null) {
		            System.out.println("Product found: " + result);
		        } else {
		            System.out.println("Product with id " + searchId + " not found.");
		        }

	}

}
