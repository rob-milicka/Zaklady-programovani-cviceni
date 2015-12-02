public class Cviceni6Pr6{
	
	public static int soucetHodnot(int a, int b){
	int suma = 0;	
		for(int i = a; i<=b; i++){
		suma = suma + i;
		}
		return suma;
	}
	
	
	public static void main(String[] args){
		int dolniHodnota, horniHodnota;
		int novaHorniHodnota, novaDolniHodnota = 0;
		int vysledek;
		
			System.out.println("---------------------------------------------------");
			System.out.println("Program seète všechna èísla uvnitø zadaného intervalu.");
			System.out.println("---------------------------------------------------");
			System.out.println("Zadej spodní hranici intervalu: ");
			dolniHodnota = VstupDat.ctiInt();
			System.out.println("Zadej horní hranici intervalu: ");
			horniHodnota = VstupDat.ctiInt();
			
			if (dolniHodnota>horniHodnota){
				novaHorniHodnota = dolniHodnota;
				horniHodnota = novaDolniHodnota;
				vysledek = soucetHodnot(novaDolniHodnota, novaHorniHodnota);
				System.out.println("Spodní hodnota intervalu je vìtší než horní. Hodnoty byly prohozeny.");
				System.out.println("Souèet èísel v intervalu je: "+vysledek);
			}
				else{
					vysledek = soucetHodnot(dolniHodnota, horniHodnota);
					System.out.println("Souèet èísel v intervalu je: "+vysledek);
				}
			
	}
}