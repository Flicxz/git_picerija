package Pasutijumi;

import java.util.Scanner;

public class Pasutijums {
	static Scanner scan = new Scanner(System.in);
	static String adrese = "";
	static int adresesNr = 0;
	static int talrunis = 0;
	static String vards = "";
	static int picasLielums = 0;
	static String picasPiedevas = "";
	static String picasMerces = "";
	static boolean piegade;
	
	public static void registretPasutijumu() {
		adrese = Picerija.virknesParbaude("adrese(bez nr): ", adrese);
		adresesNr = Picerija.skaitlaParbaude("adreses nr: ", adresesNr, 1, 1000);
		talrunis = Picerija.skaitlaParbaude("Tālruņa numurs: ", talrunis, 20000000, 90999999);
		vards = Picerija.virknesParbaude("Jūsu vārds: ", vards);
		picasLielums = Picerija.skaitlaParbaude("Cik lielu picu vēlaties(centimetros): ", picasLielums, 20, 50);
		picasPiedevas = Picerija.virknesParbaude("Kādas piedevas vēlaties: ", picasPiedevas);
		picasMerces = Picerija.virknesParbaude("Kādas mērces vēlaties: ", picasMerces);
		System.out.println("Vai jūs vēlaties piegādi(true vai false)?");
		piegade = scan.nextBoolean();
	}
	public static void labotPasutijumu() {
		char izv;
			System.out.println("\nKurus datus jūs vēlaties labot:\n" 
					+ "1 - adrese\n" 
					+ "2 - adreses numurs\n"
					+ "3 - Tālrunis\n"
					+ "4 - vārds\n"
					+ "5 - picas lielums\n"
					+ "6 - picas piedevas\n"
					+ "7 - picas mērces\n"
					+ "8 - piegāde\n");
					
			System.out.print("Tava izvēle: ");
			izv = scan.next().charAt(0);
			izv = Character.toLowerCase(izv);
			
			switch(izv) {
			case '1': adrese = Picerija.virknesParbaude("adrese(bez nr): ", adrese); break;
			case '2': adresesNr = Picerija.skaitlaParbaude("adreses nr: ", adresesNr, 1, 1000); break;
			case '3': talrunis = Picerija.skaitlaParbaude("Tālruņa numurs: ", talrunis, 20000000, 90999999); break;
			case '4': vards = Picerija.virknesParbaude("Jūsu vārds: ", vards); break;
			case '5': picasLielums = Picerija.skaitlaParbaude("Cik lielu picu vēlaties(centimetros): ", picasLielums, 20, 50); break;
			case '6': picasPiedevas = Picerija.virknesParbaude("Kādas piedevas vēlaties: ", picasPiedevas); break;
			case '7': picasMerces = Picerija.virknesParbaude("Kādas mērces vēlaties: ", picasMerces); break;
			case '8': System.out.println("Vai jūs vēlaties piegādi(true vai false)?"); piegade = scan.nextBoolean(); break;
			default: System.out.println("Darbība nepastāv!");
			}
	}
}
