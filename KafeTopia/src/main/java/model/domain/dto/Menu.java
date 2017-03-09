package model.domain.dto;

public class Menu {

	private int seq; // seq
	private String cafeid; // 카페id
	private String name; // 메뉴명
	private int price; // 가격
	private String img; // 이미지
	private String type; // 타입
	private int sales; // 판매량
	private String common; // 공통메뉴

	public Menu(int seq, String cafeid, String name, int price, String img, String type, int sales, String common) {
		this.seq = seq;
		this.cafeid = cafeid;
		this.name = name;
		this.price = price;
		this.img = img;
		this.type = type;
		this.sales = sales;
		this.common = common;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getCafeid() {
		return cafeid;
	}

	public void setCafeid(String cafeid) {
		this.cafeid = cafeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	@Override
	public String toString() {
		return "Menu [seq=" + seq + ", cafeid=" + cafeid + ", name=" + name + ", price=" + price + ", img=" + img
				+ ", type=" + type + ", sales=" + sales + ", common=" + common + "]";
	}
}
