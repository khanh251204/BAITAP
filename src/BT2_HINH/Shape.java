package BT2_HINH;
public abstract class Shape {
	private double aR;
	public Shape(double aR) {
		super();
		this.aR = aR;
	}
//	getter setter
	public double getaR() {
		return aR;
	}
	public void setaR(float aR) {
		this.aR = aR;
	}
	
	abstract void display();
}
