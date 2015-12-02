public class Cviceni5Pr5{
	public static void main (String[] args){
		int vstupniCislo;
		double generovaneCislo;
		int opakovani;
		double exponent = 2;
		
	do{
		do{
			System.out.println("Program pro každé vygenerované èíslo vytiskne jeho pøevrácenou hodnotu, jeho odmocninu a jeho druhou mocninu.");
			System.out.println("");
			System.out.println("Zadejte poèet èísel na vstupu: ");
			vstupniCislo = VstupDat.ctiInt();
		}while(vstupniCislo<0);
		
		vstupniCislo = vstupniCislo + 1;
		for(int cislo = 1; cislo<vstupniCislo; cislo ++){
			generovaneCislo = ((double)Math.random()*10);
			System.out.println("");
			System.out.println(+cislo+ ". vygenerované èíslo je: "+generovaneCislo);
			System.out.println("Pøevrácená hodnota èísla je: "+(1/generovaneCislo));
			System.out.println("Odmocnina èísla je: "+Math.sqrt(generovaneCislo));
			System.out.println("Druhá mocnina èísla je: "+(double)Math.pow(generovaneCislo,exponent));
		}
		System.out.println("");
		System.out.println("Chcete znovu generovat? 1 = ANO,Ostatní = NE");
		opakovani = VstupDat.ctiInt();
	}while(opakovani == 1);	
	}
}