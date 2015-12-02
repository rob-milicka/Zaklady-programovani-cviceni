public class Cviceni7Pr4{
	
	public static int ctiKladne(){
		int vstupniHodnota;
		
		do{
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Program vypoèítá výsledek faktoriálu z intervalu 1+1/1! ... 1+1/n");
		System.out.println("\nZadej hodnotu n: ");
		vstupniHodnota = VstupDat.ctiInt();
		}while(vstupniHodnota<0);
			return vstupniHodnota;
	}
	
	public static int faktorial(int n){
		int suma = 1;
		for (int i = 2; i<=n; i++){
			suma = suma * i;
		}
			return suma;
	}
		
	public static void main(String[] args){
		float vysledek = 1;
		int vstup;
		char opakovani;

	do{	
		vstup = ctiKladne();
		for (int i = 1; i<=vstup; i++){
			vysledek = vysledek + 1/(float)faktorial(i);
			
		}
		System.out.println("\nVýsledek výpoètu je: "+vysledek);
		System.out.println("\n------------------------------------------------");
		System.out.println("Pøejete si výpoèet opakovat? A = ANO, Ostatní = NE");
		opakovani = VstupDat.ctiChar();
		vysledek = 1;
	}while(opakovani == 'A');
	}
}