public class Cviceni2Pr4 {
	public static void main (String[] args){
	int a, b;
	
	System.out.println("Zadej prvni cislo:");
	a = VstupDat.ctiInt();
	
	System.out.println("Zadej druhe cislo:");
	b = VstupDat.ctiInt();
	
	if (b == 0){
		System.out.println("Nelze delit nulou");
	}
		
	else {
	System.out.println("Vysledek deleni:" + (a/b));
	System.out.println("Zbytek po deleni:" + (a%b));	
		}	
	}
}