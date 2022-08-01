package bLayeredDemo.bussiness.Abstracs;

import java.util.List;

import bLayeredDemo.entities.concreet.Product;

public interface ProductServices {
	void Add(Product product);
	List<Product> getAll();
}
