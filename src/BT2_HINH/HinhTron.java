package BT2_HINH;
public class HinhTron extends Shape {
	public HinhTron(double aR) {
		super(aR);
		// TODO Auto-generated constructor stub
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Dien tich is: "+Math.PI*Math.pow(getaR(),2));
		System.out.println("Chu vi is: "+2*Math.PI*getaR());
	}
}
