package com.prac;

import java.util.*;

class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row_size = sc.nextInt();
		int column_size = sc.nextInt();
		int[][] arr = new int[row_size][column_size];

		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_size; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		int[][] arrT = new int[column_size][row_size];

		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_size; j++) {
				arrT[j][i] = arr[i][j];
			}
		}
		System.out.println();

		for (int i = 0; i < arrT.length; i++) {
			for (int j = 0; j < arrT[0].length; j++) {
				System.out.print(arrT[i][j]);
			}
			System.out.println();
		}
	}
}