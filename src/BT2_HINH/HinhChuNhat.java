package BT2_HINH;
public class HinhChuNhat extends Shape {
	private double chieuRong;
	public HinhChuNhat(double aR, double chieuRong) {
		super(aR);
		this.chieuRong = chieuRong;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Dien tich is: "+super.getaR()*chieuRong );
		System.out.println("Chu vi is: "+2*(super.getaR()+chieuRong));
	}
}
