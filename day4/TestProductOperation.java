package day4;

import Day3.Product;
import day4.UserDefinedExceptions.InvalidNameException;
import day4.UserDefinedExceptions.PriceTooLowException;

public class TestProductOperation {
	
	public static void main(String[] args) {
		
		Product product1=new Product(1001, "TV", 22000);
		Product product2=new Product(1002, "Table", 7000);
		Product product3=new Product(1003, "0book", 000);
		
		Product[] productsArray= {product1,product2,product3};
		
		ProductOperation productOperation=new ProductOperation();
		//try
		//{
		//productOperation.displayArray(productsArray);
		//}
		//catch(Exception e)
		
		
		//{
		//	System.out.println(e);
		}
		//productOperation.displayMostCostlyProduct(productsArray);
		try
		{
		productOperation.displayProductWhoseNameStartsWith(productsArray, "@");
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
		//try
		//{
		//productOperation.displayMostCheapestProduct(productsArray);
		//}
	    //catch(PriceTooLowException e)
		//{
			//System.out.println(e);
		//}
	}

}
