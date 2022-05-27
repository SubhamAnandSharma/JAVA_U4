package com.day6;

import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {

		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int row = 0; row<mat.length; row++) {
			int sum = 0;
			for(int col = 0; col<mat[row].length; col++) {
				if(mat[col][row]%2 == 0) {
					sum += mat[col][row];
				}
				
			}
			System.out.println(sum);
		}
	}

}
