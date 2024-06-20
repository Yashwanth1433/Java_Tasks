package datastructures.search;

import java.util.Arrays;

public class BinaryProductsSearchdemo {

	public static Product binSearchById(Product[] product,int targetId) {
		int start=0;
		int end=product.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(product[mid].getId()==targetId) {
				return product[mid];
			}
			else if(product[mid].getId()<targetId) {
				start=mid+1;
			}
			else if(product[mid].getId()>targetId) {
				end=mid-1;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products= {
				new Product(1,"Laptop",65000),
				new Product(3,"Mobile",45000),
				new Product(2,"Car",855000),
				new Product(4,"Smart Tv",75000),
				new Product(6,"Watch",5000),
				new Product(5,"Speakers",25000),
		
		};
		Arrays.sort(products,(p1,p2)->Integer.compare(p1.getId(), p2.getId()));
		int searchId=3;
		Product result=(binSearchById(products,searchId));
		if(result!=null) {
			System.out.println("Product Found: "+result);
		}
		else {
			System.out.println("Product with searchID "+searchId+" Not Found");
		}

	}

}