package bLayeredDemo.dataAccess.Abstracs;

import java.util.List;

import bLayeredDemo.entities.concreet.Product;

public interface ProductDuo {
		void Add(Product product);
		void Update(Product product);
		void Delete(Product product);
		Product get(int id);
		List<Product> getAll();
}
