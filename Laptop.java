package constructors;

import java.util.Scanner;

public class Laptop {

		String brand;
		int ramsize;
		public Laptop(String brand,int ramsize){
		this. brand= brand;
		this.ramsize=ramsize;
		}
		public void showSpecs(){
		System.out.println("brand:"+brand);
		System.out.println("ramsize"+ramsize);
		}
		public static void main(String args[]){
		try (Scanner sc = new Scanner(System.in)) {
			String brand=sc.next();
			int  ramsize=sc.nextInt();
			Laptop l=new Laptop(brand, ramsize);
			l.showSpecs();
		}
		Laptop l1=new Laptop("realme",8);
		l1.showSpecs();
		}}


	
