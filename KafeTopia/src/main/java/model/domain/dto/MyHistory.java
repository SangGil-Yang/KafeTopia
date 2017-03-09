package model.domain.dto;

import java.sql.Timestamp;

public class MyHistory {

	private int seq; // seq
	private String cafeid; // 카페id
	private String id; // 아이디
	private String menu; // 메뉴명
	private int price; // 가격
	private String location; // 매장명
	private Timestamp date; // 날짜

	public MyHistory(int seq, String cafeid, String id, String menu, int price, String location, Timestamp date) {
		this.seq = seq;
		this.cafeid = cafeid;
		this.id = id;
		this.menu = menu;
		this.price = price;
		this.location = location;
		this.date = date;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyHistory [seq=" + seq + ", cafeid=" + cafeid + ", id=" + id + ", menu=" + menu + ", price=" + price
				+ ", location=" + location + ", date=" + date + "]";
	}

}
