public class Cviceni5Pr5{
	public static void main (String[] args){
		int vstupniCislo;
		double generovaneCislo;
		int opakovani;
		double exponent = 2;
		
	do{
		do{
			System.out.println("Program pro ka�d� vygenerovan� ��slo vytiskne jeho p�evr�cenou hodnotu, jeho odmocninu a jeho druhou mocninu.");
			System.out.println("");
			System.out.println("Zadejte po�et ��sel na vstupu: ");
			vstupniCislo = VstupDat.ctiInt();
		}while(vstupniCislo<0);
		
		vstupniCislo = vstupniCislo + 1;
		for(int cislo = 1; cislo<vstupniCislo; cislo ++){
			generovaneCislo = ((double)Math.random()*10);
			System.out.println("");
			System.out.println(+cislo+ ". vygenerovan� ��slo je: "+generovaneCislo);
			System.out.println("P�evr�cen� hodnota ��sla je: "+(1/generovaneCislo));
			System.out.println("Odmocnina ��sla je: "+Math.sqrt(generovaneCislo));
			System.out.println("Druh� mocnina ��sla je: "+(double)Math.pow(generovaneCislo,exponent));
		}
		System.out.println("");
		System.out.println("Chcete znovu generovat? 1 = ANO,Ostatn� = NE");
		opakovani = VstupDat.ctiInt();
	}while(opakovani == 1);	
	}
}