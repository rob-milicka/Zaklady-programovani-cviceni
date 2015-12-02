public class Cviceni5Pr9{
	public static void main (String[] args){
		int vstupniHodnota;
		int opak;
		
	do{
		do{
		System.out.println("-----------------------");
		System.out.println("Zadej vstupní hodnotu: ");
		vstupniHodnota = VstupDat.ctiInt();
		}while(vstupniHodnota<=0);
		System.out.println("");
		for(int opakovani = vstupniHodnota;opakovani>0;opakovani--){
		System.out.println(opakovani);
			}
		System.out.println("");
		System.out.println("Chcete opakovat výpoèet? 1 = ANO, Ostatní = NE");
		opak = VstupDat.ctiInt();
		}while(opak==1);
	}
}