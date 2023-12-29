package kr.co.fmos.cart;

public class CartDTO {
	
	//order_sql.txt 참고
	
	private int payment_detail_id;	//INT UNSIGNED 	AUTO_INCREMENT PRIMARY KEY	NOT NULL,
	private int cart_payment_id;	//INT UNSIGNED	NOT NULL,
	private int product_id;			//INT UNSIGNED	NOT NULL,
	private int product_count;		//SMALLINT 		UNSIGNED	NOT NULL,
	private int payment_price;		//INT UNSIGNED	NOT NULL
	
	public int getPayment_detail_id() {
		return payment_detail_id;
	}
	public void setPayment_detail_id(int payment_detail_id) {
		this.payment_detail_id = payment_detail_id;
	}
	public int getCart_payment_id() {
		return cart_payment_id;
	}
	public void setCart_payment_id(int cart_payment_id) {
		this.cart_payment_id = cart_payment_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public int getPayment_price() {
		return payment_price;
	}
	public void setPayment_price(int payment_price) {
		this.payment_price = payment_price;
	}
	
	@Override
	public String toString() {
		return "CartDTO [payment_detail_id=" + payment_detail_id + ", cart_payment_id=" + cart_payment_id
				+ ", product_id=" + product_id + ", product_count=" + product_count + ", payment_price=" + payment_price
				+ "]";
	}
}//class end