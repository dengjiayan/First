package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Product;

public interface productService {
	/*
	 * 分页查询产品信息
	 */
	public List<Product> getAll(@Param("b")int begin,@Param("s")int size);
	/*
	 * 查询产品总记录数
	 */
	public int count();
	/*
	 * 删除指定编号产品
	 */
	public int delete(int id);
	/*
	 * 添加产品
	 */
	public int insert(Product p);
}
