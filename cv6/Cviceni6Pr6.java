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
			System.out.println("Program se�te v�echna ��sla uvnit� zadan�ho intervalu.");
			System.out.println("---------------------------------------------------");
			System.out.println("Zadej spodn� hranici intervalu: ");
			dolniHodnota = VstupDat.ctiInt();
			System.out.println("Zadej horn� hranici intervalu: ");
			horniHodnota = VstupDat.ctiInt();
			
			if (dolniHodnota>horniHodnota){
				novaHorniHodnota = dolniHodnota;
				horniHodnota = novaDolniHodnota;
				vysledek = soucetHodnot(novaDolniHodnota, novaHorniHodnota);
				System.out.println("Spodn� hodnota intervalu je v�t�� ne� horn�. Hodnoty byly prohozeny.");
				System.out.println("Sou�et ��sel v intervalu je: "+vysledek);
			}
				else{
					vysledek = soucetHodnot(dolniHodnota, horniHodnota);
					System.out.println("Sou�et ��sel v intervalu je: "+vysledek);
				}
			
	}
}