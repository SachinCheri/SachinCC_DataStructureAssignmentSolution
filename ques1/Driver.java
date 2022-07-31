package ques1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("entered the total number of floors in the building");
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			a[i] = sc.nextInt();
		}
		Skyscraper.BuildingSize(n, a);
	
	}

}
