public class Cviceni6Pr7{
	
	public static void ktereJeVetsi(int a, int b){
		if (a>b){
			System.out.println("\nÈíslo "+a+" je vìtší ne èíslo "+b+".");
		}
		else if (b>a){
			System.out.println("\nÈíslo "+b+" je vìtší ne èíslo "+a+".");
		}
		else if (a==b){
			System.out.println("\nÈísla jsou stejná.");
		}
	}
	
	
	public static void main(String[] args){
	int prvniCislo, druheCislo;
	int vysledek;	
		
		System.out.println("--------------------------");
		System.out.println("Zadej dvì èísla pro zjištìní které z nich je vìtší.");
		System.out.println("--------------------------");
		System.out.println("Zadej první èíslo: ");
		prvniCislo = VstupDat.ctiInt();
		System.out.println("Zadej druhé èíslo: ");
		druheCislo = VstupDat.ctiInt();
		
		ktereJeVetsi(prvniCislo, druheCislo);
	}
}