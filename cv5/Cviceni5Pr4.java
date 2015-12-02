public class Cviceni5Pr4{
	public static void main (String[] args){
		int vstupniCas;
		int hodiny,minuty,sekundy;
		int opakovani;
		int zbytek;
		
	do{
		do{
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Zadej èíslo v sekundách pro pøepoèet na formát --> hodiny:minuty:sekundy ...");
			vstupniCas = VstupDat.ctiInt();
		}while(vstupniCas<=0);
		
		hodiny = vstupniCas/3600;
		zbytek = vstupniCas%3600;
		minuty = zbytek/60;
		sekundy = zbytek%60;
		System.out.println("");
		System.out.println("Pøepoèet èasu je: " +hodiny+":"+minuty+":"+sekundy);
		
	System.out.println("Chcete opakovat zadávání? 1 = ANO, Ostatní = NE");	
	opakovani = VstupDat.ctiInt();
	}while(opakovani==1);	
	}
}