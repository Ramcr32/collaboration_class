package com.masai;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("inter your input: ");
		int N = scanner.nextInt();
		new Question4().Print(N);

	}
	public void Print(int n) {
		if(n<0) {
			System.out.println("Error");
			 
		}
		else if(n%2!=0) {
			System.out.println(n);
		}
		else {
			while(n%10!=0) {
				n++;
			}
			System.out.println(n);
		}
	}

}
