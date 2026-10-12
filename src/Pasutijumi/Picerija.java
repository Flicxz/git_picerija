package Pasutijumi;

import java.util.Scanner;

public class Picerija {
	static Scanner scan = new Scanner(System.in);
	static int r = 0;
	public static String virknesParbaude(String teksts, String mainigais) {
	do {
		System.out.print(teksts);
		while(scan.hasNextInt()) {
		System.out.print(teksts);
		scan.next();
		}
		mainigais = scan.nextLine();
	} while(mainigais.matches("#$%^&*!()<>"));
		
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
		char izv;
		do {
			System.out.println("\nPieejamās darbības:\n" 
					+ "1 - reģistrēt pasūtījumu\n" 
					+ "2 - Labot pasūtījumu\n"
					+ "3 - Ierakstīt failā\n"
					+ "4 - Nolasīt no faila\n"
					+ "x - Apturēt programmu\n");
					
			System.out.print("Tava izvēle: ");
			izv = scan.next().charAt(0);
			izv = Character.toLowerCase(izv);
			
			switch(izv) {
			case '1': Pasutijums.registretPasutijumu(); break;
			case '2': Pasutijums.labotPasutijumu(); break;
			case '3': Pasutijums.ierakstitFaila(); break;
			case '4': Pasutijums.nolasitFailu(); break;
			case 'x' :System.out.println("Programma apturēta!"); break;
			default: System.out.println("Darbība nepastāv!");
				
			}
		} while (izv != 'x');
		
		scan.close();
	}
}
