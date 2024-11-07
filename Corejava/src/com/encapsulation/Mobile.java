package com.encapsulation;

public class Mobile {
	private String name;
	private String colour;
	private int ram;
	private int rom;
	private double price;
	public Mobile(String name,String colour,int ram,int rom,double price) {
		this.name = name;
		this.colour = colour;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	public String getname() {
		return name;
	}

	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public int getram() {
		return ram;
	}
	public void setram() {
		this.ram = ram;
	}
	public int getrom() {
		return rom;
	}
	public void setrom() {
		this.setrom();
	}
	public double getprice() {
		return price; 
	}
	
	
	public void Display() {
		System.out.println(name);
		System.out.println(colour);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(price);
			
	}

}
