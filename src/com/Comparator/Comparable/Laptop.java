package com.Comparator.Comparable;

public class Laptop 

//implements Comparable<Laptop>
{

	private String brand;
	private int ram;
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Runner [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

//	@Override
//	public int compareTo(Laptop labs2) {
//		
//		//this > labs2 = +
//		//this < labs = -
//		//this == labs = 0
//		
//		if(this.getRam() > labs2.getRam())
//		return 1;
//		else
//			return -1;
//	}

}
