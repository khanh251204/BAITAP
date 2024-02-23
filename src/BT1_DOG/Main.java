package BT1_DOG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner (System.in);
		ArrayList <Dog> D = new ArrayList<>();
		System.out.println("Input number name and Breed");
		int n = ip.nextInt();
		ip.nextLine();
		for (int i = 0 ;i<n;i++) {
//			ip.nextLine();
			System.out.println("Input name Dog" +(i+1));
			String name = ip.nextLine();
//			ip.nextLine();
			System.out.println("Input breed Dog"+(i+1));
			String breed = ip.nextLine();
			Dog d = new Dog(name, breed);
			D.add(d);
		}
		for (Dog d:D) {
			System.out.println(d.toString());
		}
//		update equal method setter
//		index
		System.out.println("Input index Update");
		int indexUpdate = ip.nextInt();
		ip.nextLine();
		if(indexUpdate>0&&indexUpdate<D.size()) {
			Dog firstD = D.get(indexUpdate);
			System.out.println("Update name: ");
			String updateName = ip.nextLine();
			firstD.setName(updateName);
			System.out.println("Update breed");
			String updateBreed = ip.nextLine();
			firstD.setBreed(updateBreed);
//			Print update 
			System.out.println("Update Dog: "+firstD.toString());
		}
		ip.close();
	}

}
