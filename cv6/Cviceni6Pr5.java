public class Cviceni6Pr5{
	
	public static int obsahObdelniku(int strA, int strB){
	int vysledekObsahu;
	vysledekObsahu = strA*strB;
	return vysledekObsahu;
	}
	
	public static int obvodObdelniku(int strA, int strB){
	int vysledekObvodu;
	vysledekObvodu = 2*(strA+strB);
	return vysledekObvodu;
	}
	
	public static void main(String[] args){
	int stranaA, stranaB;
	int vysledekObvodu;
	int vysledekObsahu;
	int opakovaniVypoctu;
	
	do{
		System.out.println("---------------------------------------------------");
		System.out.println("Zadej strany obdeln�ku pro v�po�et obvodu a obsahu: ");
		System.out.println("---------------------------------------------------");
		System.out.println("Zadej velikost strany a: ");
		stranaA = VstupDat.ctiInt();
		System.out.println("Zadej velikost strany b: ");
		stranaB = VstupDat.ctiInt();
		
		vysledekObvodu = obvodObdelniku(stranaA, stranaB);
		vysledekObsahu = obsahObdelniku(stranaA, stranaB);
		System.out.println("\nObvod obdeln�ku je: "+vysledekObvodu);
		System.out.println("Obsah obdeln�ku je: "+vysledekObsahu);
		
		System.out.println("\nChcete opakovat v�po�et? 1 = ANO, Ostatn� = KONEC PROGRAMU");
		opakovaniVypoctu = VstupDat.ctiInt();
	}while(opakovaniVypoctu == 1);	
	}
}