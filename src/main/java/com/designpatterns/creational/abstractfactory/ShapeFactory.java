package com.designpatterns.creational.abstractfactory;

class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}

}
