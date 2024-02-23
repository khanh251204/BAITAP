package BT2_HINH;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Input number: ");
		n = ip.nextInt();
		switch (n) {
		case 1: {
			double chieuDai;
			double chieuRong;
			System.out.println("Nhap chieu dai");
			chieuDai = ip.nextDouble();
			System.out.println("Nhap chieu rong");
			chieuRong = ip.nextDouble();
			Shape hcn = new HinhChuNhat(chieuDai, chieuRong);
			hcn.display();
			break;
		}
		case 2: {
			double banKinh;
			System.out.println("Nhap bán Kính");
			banKinh = ip.nextDouble();
			Shape ht = new HinhTron(banKinh);
			ht.display();
			break;
		}
		case 3: {
			double canhA;
			double canhB;
			double canhC;
			System.out.println("Nhap cạnh A");
			canhA = ip.nextDouble();
			System.out.println("Nhap cạnh B");
			canhB = ip.nextDouble();
			System.out.println("Nhap cạnh C");
			canhC = ip.nextDouble();;
			Shape htg = new TamGiac(canhA, canhB, canhC);
			htg.display();
			break;
		}
		default:
			System.out.println("So ko hop le");
			throw new IllegalArgumentException("Unexpected value: " );
		}
	}
	
}
