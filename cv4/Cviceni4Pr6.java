public class Cviceni4Pr6{
	public static void main(String[] args){
		int n;
		int den = 1;
		float prumer;
		int teplota = 1;
		float suma = 0;
		float x;
		
		System.out.println("Zadej po�et dn�: ");
		n = VstupDat.ctiInt();
		
		while (den<=n){
			System.out.println("Zadej teplotu " +teplota+ " dne: ");
			x = VstupDat.ctiFloat();
			den = den + 1;
			suma = suma + x;
			teplota = teplota+1;
		}
		prumer = suma/n;
		System.out.println("Pr�m�rn� teplota zadan�ch dn� je: "+prumer+".");
	}
}