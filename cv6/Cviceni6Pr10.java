public class Cviceni6Pr10{
	
	public static int ctiKladne(){
	int kladneCislo;
		do{
		System.out.println("----------------------");
		System.out.println("Zadejte kladné èíslo: ");
		kladneCislo = VstupDat.ctiInt();
		}while(kladneCislo<=0);
		System.out.println("\nNaètené èíslo je: "+kladneCislo);
		return kladneCislo;
	}
	
	public static void pocetCifer(int n){	
	int pocet = 0;
		for (int i = 1; n>0; i++){
			n = n/10;
			pocet = i;
		};
		System.out.println("Poèet cifer èísla je: "+pocet);
	}
	
	public static int soucetCifer(int cislo){
	int soucet = 0;
		while (cislo > 0)
		{soucet = soucet + (cislo % 10);
		    cislo = cislo / 10;
		};
		System.out.println("Souèet cifer èísla je: "+soucet);	
		return soucet;
	}
	
	public static void main(String[] args){
	int kladneCislo, opakovani;
		System.out.println("Program naète hodnotu z klávesnice, zjistí poèet cifer a provede souèet cifer.");
		System.out.println("------------------------------------------------------------------------------");	
		do{
		kladneCislo = ctiKladne();
		pocetCifer(kladneCislo);
		soucetCifer(kladneCislo);
		System.out.println("\nChcete opakovat zadání? 1 = ANO, Ostatní = NE");
		opakovani = VstupDat.ctiInt();}
		while(opakovani == 1);
	}
}