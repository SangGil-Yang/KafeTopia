package model.domain.dto;

public class Cafe {
	
	private String cafeid;	//카페id
	private String name;	//카페명
	
	public Cafe(String cafeid, String name) {
		super();
		this.cafeid = cafeid;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Cafe [cafeid=" + cafeid + ", name=" + name + "]";
	}
	
	

}
