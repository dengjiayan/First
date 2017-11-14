package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Product;

import service.productService;

@Controller
public class productController {
	
	@Autowired
	private productService ps;
	
	public productService getPs() {
		return ps;
	}

	public void setPs(productService ps) {
		this.ps = ps;
	}
	
	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue="1")int begin,HttpServletRequest request){
		
		int num = ps.count();
		int nums = num%2==0?num/2:num/2+1;
		request.getSession().setAttribute("nums", nums);
		if(begin<1 || begin>nums){
			return "index.jsp";
		}else{
			int begins = (begin-1)*2;
			List<Product> list = ps.getAll(begins, 2);
			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("begin", begin);
			return "index.jsp";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		ps.delete(id);
		return "getAll";
	}
	
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request){
		Product pro = new Product();
		pro.setProductname(request.getParameter("productname"));
		pro.setDescs(request.getParameter("descs"));
		pro.setCid(Integer.valueOf(request.getParameter("cid")));
		int num = ps.insert(pro);
		if(num>0){
			return "getAll";
		}else{
			return "add.jsp";
		}
	}
}
