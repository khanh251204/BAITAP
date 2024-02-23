package BT3_MOVIE;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner (System.in);
		ArrayList <Movie> movies = new ArrayList<>();
		System.out.println("Input number Movie");
		int n = ip.nextInt();
		ip.nextLine();
		for (int i = 0 ;i<n;i++) {
			System.out.println("Input Title");
			String title = ip.nextLine();
			System.out.println("Input Director");
			String director = ip.nextLine();
			System.out.println("Input Actors");
			ArrayList <String> actors = new ArrayList<>();
			System.out.println("Input number actors");
			int numActor = ip.nextInt();
			ip.nextLine();
			for (int j = 0;j<numActor;j++) {
				System.out.println("Input numActor "+(i+1));
				String nameActors = ip.nextLine();
				actors.add(nameActors);
			}
			System.out.println("Input Review");
			ArrayList <Review> reviews = new ArrayList<>();
			System.out.println("Input number review");
			int numReview = ip.nextInt();
			ip.nextLine();
			for (int k = 0 ;k<numReview;k++) {
				System.out.println("Input Rview Text ");
				String reviewText = ip.nextLine();
				System.out.println("Input Name Review");
				String nameText = ip.nextLine();
//				ip.nextLine();
				System.out.println("Input Review");
				double reviewS = ip.nextDouble();
				Review review  = new Review(reviewText, nameText, reviewS);
				reviews.add(review);
			}
			Movie movie = new Movie(title, director, actors, reviews);
			movies.add(movie);
			
		}
		System.out.println("Display Information");
		for (int i=0;i<movies.size();i++) {
			System.out.println(movies.get(i).toString());
		}
	}

}
