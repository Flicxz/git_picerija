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
		do {
		System.out.println("Vai jūs vēlaties piegādi(true vai false)?");
		}while(!scan.hasNextBoolean());
		piegade = scan.nextBoolean();
	}
}
