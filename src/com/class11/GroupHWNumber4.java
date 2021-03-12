package com.class11;

public class GroupHWNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		String[][] countries = {
				{ "United States", "Canada", "Mexico", "Cuba", "El Salvador" },
				{ "Brazil", "Argentina", "Colombia", "Peru", "Chile" },
				{ "Germany", "France", "Italy", "United Kingdom", "Netherlands" },
				{ "Japan", "Indonesia", "China", "India", "Thailand" },
				{ "South Africa", "Nigeria", "Ghana", "Kenya", "Ethiopia" } };
		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			System.out.println();
		}System.out.println("-----------------2nd Way-----------------");
		for(String[] str:countries) {
			for(String str1:str) {
				System.out.print(str1+" ");
				sum++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		System.out.println(sum+" countries have been stored.");
	}

}
