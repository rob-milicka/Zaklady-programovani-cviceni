public class Cviceni5Pr6{
	public static void main (String[] args){
		int vstupniHodnota;
		int suma = 0;

System.out.println("Program vypoèítá souèet všech hodnot z intervalu <1-n>.");
		do{
			System.out.println("Zadej vstupní hodnotu n vìtší než 0: ");
			vstupniHodnota = VstupDat.ctiInt();
		}while(vstupniHodnota<=0);
		
		for(int opakovani = vstupniHodnota;opakovani>=1; opakovani--){
			suma = suma + opakovani;
		}
		System.out.println("Souèet všech èísel je: "+suma+".");
	}
}