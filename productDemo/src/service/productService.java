package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Product;

public interface productService {
	/*
	 * ��ҳ��ѯ��Ʒ��Ϣ
	 */
	public List<Product> getAll(@Param("b")int begin,@Param("s")int size);
	/*
	 * ��ѯ��Ʒ�ܼ�¼��
	 */
	public int count();
	/*
	 * ɾ��ָ����Ų�Ʒ
	 */
	public int delete(int id);
	/*
	 * ��Ӳ�Ʒ
	 */
	public int insert(Product p);
}
