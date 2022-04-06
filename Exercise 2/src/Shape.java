abstract class Shape {
	private String color;
	private boolean filled;

public Shape() {
	color = "green";
	filled = true;
	}

public Shape (String color, boolean filled) {
	this.color = color;
	this.filled = filled;
	}

public String getColor() {
	return color;
	}
public void setColor() {
	color ="green";
	}
public boolean getFilled() {
	return filled;
	}
public void setFilled() {
	filled = true;
	}
public String toString() {
	return ("A Shape with color of" + color + "and" +(filled ? "" : "Not ") +filled);
	}

public abstract double getArea();

public abstract double getPerimeter();

}
