public class Cviceni5Pr4{
	public static void main (String[] args){
		int vstupniCas;
		int hodiny,minuty,sekundy;
		int opakovani;
		int zbytek;
		
	do{
		do{
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Zadej ��slo v sekund�ch pro p�epo�et na form�t --> hodiny:minuty:sekundy ...");
			vstupniCas = VstupDat.ctiInt();
		}while(vstupniCas<=0);
		
		hodiny = vstupniCas/3600;
		zbytek = vstupniCas%3600;
		minuty = zbytek/60;
		sekundy = zbytek%60;
		System.out.println("");
		System.out.println("P�epo�et �asu je: " +hodiny+":"+minuty+":"+sekundy);
		
	System.out.println("Chcete opakovat zad�v�n�? 1 = ANO, Ostatn� = NE");	
	opakovani = VstupDat.ctiInt();
	}while(opakovani==1);	
	}
}