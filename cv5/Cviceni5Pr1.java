public class Cviceni5Pr1{
	public static void main(String[] args){
		int pocetStudentu;
		int vekStudenta;
		int n = 0;
		int opak;
		
	do{
		do{
			System.out.println("----------------------");
			System.out.println("Zadej po�et student�: ");
			pocetStudentu = VstupDat.ctiInt();
		}while(pocetStudentu<=0);
		
		n = 0;
		pocetStudentu = pocetStudentu+1;
		for(int p=1; p<pocetStudentu; p++){
		System.out.println("Zadej v�k "+p+". studenta: ");
		vekStudenta = VstupDat.ctiInt();
			if(vekStudenta>=18){
				n++;
			}
		}		
		System.out.println("\nPo�et plnolet�ch student� je: "+n+ ".");
		System.out.println("\nChce� opakovat? 1 = ANO, Ostatn� = NE");
		opak = VstupDat.ctiInt();
		}while(opak == 1);
	}
}