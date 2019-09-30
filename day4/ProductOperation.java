package day4;

import Day3.Product;
import day4.UserDefinedExceptions.DisplayException;
import day4.UserDefinedExceptions.InvalidNameException;
import day4.UserDefinedExceptions.PriceTooLowException;

public class ProductOperation {
	
	 public static void displayArray(Product[] productsArray) throws DisplayException
	 {
		 for(Product product: productsArray)
		 {
			 
			 if(product.getPrice()> 0)
			 {
				 throw new DisplayException();
			 }
			 System.out.println(product);
		 }
		 
	 }
	
	 public static void displayMostCostlyProduct(Product[] productsArray)
	 {
		 int maxPrice=0;
		 Product maxProduct=null;
		 
		 for(Product product: productsArray)
		 {
			 if(product.getPrice()>maxPrice)
			 {
				 maxPrice=product.getPrice();
                 maxProduct=product;
			 }
			 
		 }
		 System.out.println("maxPrice"+" "+maxPrice);
		
		System.out.println(maxProduct);
		 
	 }
	 
	 public void displayMostCheapestProduct(Product[] productsArray) throws PriceTooLowException
	 {
		   Product minProduct= productsArray[0];
		   int minPrice= minProduct.getPrice();
		   
		   for(Product product: productsArray)
		   {
			   if(product.getPrice()<minPrice)
			   {
				   minPrice=product.getPrice();
				   minPrice=product.getPrice();
				   minProduct=product;
				   
				   if(minPrice<=0)
				   {
					   throw new PriceTooLowException();
				   }
				}
			
		   }
		     System.out.println("min price"+ minPrice);
			 System.out.println(minProduct);	   
		   }

	public void displayProductWhoseNameStartsWith(Product[] productsArray, String firstchar) throws InvalidNameException {
		
		for(Product product: productsArray)
		{
			if(product.getProductName().startsWith(firstchar))
			{
				
				
				if((firstchar > = 'a') && (firstchar <='z') || (firstchar >= 'A')&& (firstchar <= "Z"))
				{
					throw new InvalidNameException();
				}
				else
					{System.out.println(product);
					}
		
		}
	}
		   
	}
}
	 
	// public static void displayProductWhoseNameStartsWith(Product[] productsArray, String firstChar)


