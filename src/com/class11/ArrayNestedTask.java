package com.class11;

public class ArrayNestedTask {

	
	public static void main(String[] args) {
		
		//1.
		String[][] cars= {
				{"Chevy","Ford","Jeep","Chrysler"},
				{"Mercedes Benz", "Audi","BMW","Porsche","Volkswagen"},
				{"Kia","Hyundai"},
				{"Ferrari","Lamborghini","Maserati","Fiat","Alfa Romeo"}
		};
		
		for (String [] a:cars) {
			for (String b:a)
			System.out.print(b+", ");
		}

		System.out.println();
		
		for (int x=0; x<cars.length; x++) {
			for (int y=0; y<cars[x].length; y++) {
				System.out.print(cars[x][y]+", ");
			}
		}
		
		//2.
		
		System.out.println();
		System.out.println("___________________");
		
		String[][] groceries= {
				
				{"Carrots","Brocolli","Spinach","Kale"},
				{"Pineapple","Mango","Grapes","Oranges","Apples"},
				{"Milk","Cream","Cheese"},
				{"Ice cream","Candy","Chocolate","Brownies"}
		};
		
		for (String[] food:groceries) {
			for (String item:food) {
				System.out.print(item+", ");
			}
		}
		
		System.out.println();
		
		for (int r=0; r<groceries.length; r++) {
			for (int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+", ");
			}
		
		}
		
		System.out.println("___________________");
	}
}
