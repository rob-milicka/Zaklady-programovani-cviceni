public class Cviceni6Pr8{
	
	public static int soucin(int cinitel1,int cinitel2){
	int vysledek = 0;	
		for(int i = 1; i<=Math.abs(cinitel1); i++){
			vysledek = vysledek + cinitel2;
		}
			if(cinitel1<0){
				vysledek = vysledek*(-1);
			}
		System.out.println("\nVýsledek je: "+vysledek+".");
		return vysledek;
	}
	
	public static void main (String[] args){
	int cinitel1, cinitel2, opakovani, vysledek = 0;	
	do{
		System.out.println("--------------------------");
		System.out.println("Program vypoèítá souèin dvou èísel pomocí postupného sèítání.");
		System.out.println("--------------------------");
		System.out.println("Zadejte prvního èinitele: ");
		cinitel1 = VstupDat.ctiInt();
		System.out.println("Zadejte druhého èinitele: ");
		cinitel2 = VstupDat.ctiInt();
		
		soucin(cinitel1, cinitel2);
			
		System.out.println("Chcete opakovat výpoèet? 1 = ANO, Ostatní = NE");
		opakovani = VstupDat.ctiInt();
		vysledek = 0;	
	  }while(opakovani==1);
	}
}