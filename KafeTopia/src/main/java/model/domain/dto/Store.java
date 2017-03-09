package model.domain.dto;

public class Store {
	
	private String address;	//주소
	private String cafeid;	//카페id
	private String city;	//시/도
	private String location;	//매장명
	
	public Store(String address, String cafeid, String city, String location) {
		super();
		this.address = address;
		this.cafeid = cafeid;
		this.city = city;
		this.location = location;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCafeid() {
		return cafeid;
	}
	public void setCafeid(String cafeid) {
		this.cafeid = cafeid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Store [address=" + address + ", cafeid=" + cafeid + ", city=" + city + ", location=" + location + "]";
	}
	
	
	
}
