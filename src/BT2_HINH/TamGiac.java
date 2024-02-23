package BT2_HINH;
public class TamGiac extends Shape {
	private double b;
	private double c;
	public TamGiac(double aR, double b, double c) {
		super(aR);
		this.b = b;
		this.c = c;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		if(getaR()+b>c||b+c>getaR()||getaR()+c>b) {
			double s = (getaR()+b+c)/2;
			System.out.println("Dien tich is (Heron): "+Math.sqrt(s*(s-getaR())*(s-b)*(s-c)));
			System.out.println("Chu vi is: "+getaR()+b+c);
		}else {
			System.out.println("3 cạnh không phải là tam giác");
		}
	}

}
