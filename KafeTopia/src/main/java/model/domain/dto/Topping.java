package model.domain.dto;

public class Topping {
	
	private String name;	//토핑이름
	private int price;	//가격
	private String type;	//타입
	
	public Topping(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
}
