package pojo;

public class Product {
	
	private int id;
	
	private String productname;
	
	private String descs;
	
	private int cid;

	private Catagory c;	
	
	public Catagory getC() {
		return c;
	}

	public void setC(Catagory c) {
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
}
