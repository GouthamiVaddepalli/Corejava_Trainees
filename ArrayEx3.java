package com.corejava.arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(array[0][0]);
		System.out.println(array[1][2]);
		
		for  (int i = 0; i < 3 ; i++) { //0 1 2
			for (int j = 0; j < 3; j++) { //1
				System.out.print(array[i][j] + " ");//123//   1 2 3 //456 4 5 6 7 8 9
				
				
			}
			System.out.println();
			
		}
		
	}

}
