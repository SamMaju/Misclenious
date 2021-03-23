package com.factory;

import com.product.BuscuitProduct;
import com.product.ChocolateProduct;
import com.product.JuiceProduct;

public class GetProductFactory {

	public Product getProduct(String productName) {
		
		if(productName.equals("biscuit")) {
			return new BuscuitProduct();
		}else if(productName.equals("chocolate")) {
			return new ChocolateProduct();
		}else if(productName.equals("juice")) {
			return new JuiceProduct();
		}
		return null;
	}
}
