package com.lang.hashcode;

import java.util.Objects;

public class Vehicle {
	String name,brand,color;

	

	public Vehicle(String name, String brand, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime+result+((brand==null)?0:brand.hashCode());
		result=prime+result+((color==null)?0:color.hashCode());
		result=prime+result+((name==null)?0:name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(name, other.name);
	}





	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", color=" + color + "]";
	}
	
}
