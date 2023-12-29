package kr.co.fmos.theater;

public class TheaterbranchDTO {

	private String branch_id;		//VARCHAR(30)  PRIMARY KEY	NOT NULL,
	private String region_id;		//VARCHAR(30)	NOT NULL,
	private String branch_name;		//VARCHAR(50)	NOT NULL,
	private String branch_address;	//VARCHAR(255)	NOT NULL,
	private String branch_number;	//TINYINT UNSIGNED	NOT NULL	COMMENT '전체 관수',
	private String branch_seats;	//TINYINT UNSIGNED	NOT NULL	COMMENT '전체 좌석수'
	
	
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getRegion_id() {
		return region_id;
	}
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	public String getBranch_number() {
		return branch_number;
	}
	public void setBranch_number(String branch_number) {
		this.branch_number = branch_number;
	}
	public String getBranch_seats() {
		return branch_seats;
	}
	public void setBranch_seats(String branch_seats) {
		this.branch_seats = branch_seats;
	}
	@Override
	public String toString() {
		return "TheabranchDTO [branch_id=" + branch_id + ", region_id=" + region_id + ", branch_name=" + branch_name
				+ ", branch_address=" + branch_address + ", branch_number=" + branch_number + ", branch_seats="
				+ branch_seats + "]";
	}
	
	
}// class end