public class Cviceni5Pr1{
	public static void main(String[] args){
		int pocetStudentu;
		int vekStudenta;
		int n = 0;
		int opak;
		
	do{
		do{
			System.out.println("----------------------");
			System.out.println("Zadej poèet studentù: ");
			pocetStudentu = VstupDat.ctiInt();
		}while(pocetStudentu<=0);
		
		n = 0;
		pocetStudentu = pocetStudentu+1;
		for(int p=1; p<pocetStudentu; p++){
		System.out.println("Zadej vìk "+p+". studenta: ");
		vekStudenta = VstupDat.ctiInt();
			if(vekStudenta>=18){
				n++;
			}
		}		
		System.out.println("\nPoèet plnoletých studentù je: "+n+ ".");
		System.out.println("\nChceš opakovat? 1 = ANO, Ostatní = NE");
		opak = VstupDat.ctiInt();
		}while(opak == 1);
	}
}