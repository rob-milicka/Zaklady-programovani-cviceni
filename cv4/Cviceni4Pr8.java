public class Cviceni4Pr8{
	public static void main(String[] args){
		int cislo;
		int pocet = 0;
				
		while(true){
		System.out.println("Zadej ��slo: ");
		cislo = VstupDat.ctiInt();
		
		if (cislo == 100){
		System.out.println("Konec programu.");
		System.out.println("Po�et sud�ch ��sel je: "+pocet+ ".");
		break;}
		if (cislo%2 == 0){
			pocet++;
			continue;
		}
	}
}
}