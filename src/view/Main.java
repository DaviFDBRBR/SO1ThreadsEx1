package view;

import java.util.Scanner;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v[] = new int[1000];
				
		for (int c = 0; c < 1000; c++) {
				v[c] = (int) (Math.random() * 100) + 1;
		}
		
		for (int num = 1; num <= 2; num++) {
			ThreadVetor tv = new ThreadVetor(num, v);
			tv.start();
		}
		
		sc.close();
	}
	
}
