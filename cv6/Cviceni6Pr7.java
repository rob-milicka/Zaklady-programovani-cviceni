public class Cviceni6Pr7{
	
	public static void ktereJeVetsi(int a, int b){
		if (a>b){
			System.out.println("\n��slo "+a+" je v�t�� ne� ��slo "+b+".");
		}
		else if (b>a){
			System.out.println("\n��slo "+b+" je v�t�� ne� ��slo "+a+".");
		}
		else if (a==b){
			System.out.println("\n��sla jsou stejn�.");
		}
	}
	
	
	public static void main(String[] args){
	int prvniCislo, druheCislo;
	int vysledek;	
		
		System.out.println("--------------------------");
		System.out.println("Zadej dv� ��sla pro zji�t�n� kter� z nich je v�t��.");
		System.out.println("--------------------------");
		System.out.println("Zadej prvn� ��slo: ");
		prvniCislo = VstupDat.ctiInt();
		System.out.println("Zadej druh� ��slo: ");
		druheCislo = VstupDat.ctiInt();
		
		ktereJeVetsi(prvniCislo, druheCislo);
	}
}