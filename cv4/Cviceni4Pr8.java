public class Cviceni4Pr8{
	public static void main(String[] args){
		int cislo;
		int pocet = 0;
				
		while(true){
		System.out.println("Zadej èíslo: ");
		cislo = VstupDat.ctiInt();
		
		if (cislo == 100){
		System.out.println("Konec programu.");
		System.out.println("Poèet sudých èísel je: "+pocet+ ".");
		break;}
		if (cislo%2 == 0){
			pocet++;
			continue;
		}
	}
}
}