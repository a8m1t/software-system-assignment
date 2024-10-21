package lab1;


class Rectangle extends Shape {
	
	
	Rectangle(int width, int height) {
		super(4);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getArea()=" + getArea() + ", getSides()="
				+ getSides() + "]";
	}
	
	
	
	
}