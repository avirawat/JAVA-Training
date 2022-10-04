package com.util.methodrefer;

public class ConstRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory=()->{
			return new Shape();
		};
		Shape shape=factory.getShape();
		shape.area(100);
		System.out.println("constructor reference");
		
		ShapeFactory factory1=Shape::new;
		Shape shape1=factory.getShape();
		shape1.area(10);
	}

}
