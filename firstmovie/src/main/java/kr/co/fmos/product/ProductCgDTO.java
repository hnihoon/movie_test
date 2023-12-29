package kr.co.fmos.product;

public class ProductCgDTO {

	private int product_category_id;		//INT UNSIGNED  	AUTO_INCREMENT PRIMARY KEY	NOT NULL,
	private String product_category_name;	//VARCHAR(100)		NOT NULL
	
	
	public int getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}
	public String getProduct_category_name() {
		return product_category_name;
	}
	public void setProduct_category_name(String product_category_name) {
		this.product_category_name = product_category_name;
	}
	
	
	@Override
	public String toString() {
		return "ProductCgDTO [product_category_id=" + product_category_id + ", product_category_name="
				+ product_category_name + "]";
	}
}//class end