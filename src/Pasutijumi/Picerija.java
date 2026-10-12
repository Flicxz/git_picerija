package Pasutijumi;

import java.util.Scanner;

public class Picerija {
	static Scanner scan = new Scanner(System.in);
	static int r = 0;
	public static String virknesParbaude(String teksts, String mainigais) {
	do {
		if(r >= 1) {
		System.out.println("Nepareizi ievadīti dati!");
		}
		System.out.print(teksts);
		r++;
		while(!scan.hasNextLine()) {
		System.out.print(teksts);
		scan.next();
		}
		mainigais = scan.nextLine();
	} while(mainigais.matches(mainigais));
		
		return mainigais; 
	}
	static int skaitlaParbaude(String teksts, int mainigais, int a, int b) {
		do {
			System.out.print(teksts);
			while(!scan.hasNextInt()) {
				System.out.print(teksts);
				scan.next();
			}
			mainigais = scan.nextInt();
		} while (mainigais < a || mainigais > b);
		return mainigais;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
