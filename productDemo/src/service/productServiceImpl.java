package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.productMapper;

import pojo.Product;
@Service
public class productServiceImpl implements productService {

	@Autowired
	private productMapper pm;
	
	public productMapper getPm() {
		return pm;
	}

	public void setPm(productMapper pm) {
		this.pm = pm;
	}

	public List<Product> getAll(int begin, int size) {
		// TODO Auto-generated method stub
		return pm.getAll(begin, size);
	}

	public int count() {
		// TODO Auto-generated method stub
		return pm.count();
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return pm.delete(id);
	}

	public int insert(Product p) {
		// TODO Auto-generated method stub
		return pm.insert(p);
	}
	
}
