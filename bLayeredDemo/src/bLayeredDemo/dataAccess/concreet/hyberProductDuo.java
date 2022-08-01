package bLayeredDemo.dataAccess.concreet;

import java.util.List;

import bLayeredDemo.dataAccess.Abstracs.ProductDuo;
import bLayeredDemo.entities.concreet.Product;

public class hyberProductDuo implements ProductDuo{

	@Override
	public void Add(Product product) {
		System.out.println("Hyber Net"+product.getName());
	}

	@Override
	public void Update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
