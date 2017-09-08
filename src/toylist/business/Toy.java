package toylist.business;

import java.text.NumberFormat;

import toylist.db.ToyType;

public class Toy {
	String code;
	ToyType type;
	String name;
	double price;
	
	public Toy() {
		code = "";
		type = ToyType.GENERAL;
		name = "";
		price = 0.0;
	}
	public Toy(String code, ToyType type, String name, double price) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ToyType getType() {
		return type;
	}

	public void setType(ToyType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	
	@Override
	public String toString() {
		return "Toy: code = "+getCode()+", type = "+getType()+", name = "+getName()+
				", price = "+getPriceFormatted();
	}
}
