public class Cviceni8Pr7{
	
	public static int[] vypocet(int x, int y){
		int[] a = new int [2];
    
		a[0] = x/y;
		a[1] = x%y;
		return a;
	}
	
	public static void main(String[] args){
		int a,b;
		int[] vysledek;
		
		System.out.println("Tento program vypocita dve hodnoty a vraci podil,zbytek po deleni a ulozi do promenne pole.");
		System.out.println("Zadej prvni cislo: ");
		a = VstupDat.ctiInt();
		System.out.println("Zadej druhe cislo: ");
		b = VstupDat.ctiInt();
		
		vysledek = vypocet(a,b);
		System.out.println("Podíl dvou èísel je: "+vysledek[0]);
		System.out.println("Zbytek po dìlení èísel je: "+vysledek[1]);
	}
}