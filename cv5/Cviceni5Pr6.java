public class Cviceni5Pr6{
	public static void main (String[] args){
		int vstupniHodnota;
		int suma = 0;

System.out.println("Program vypo��t� sou�et v�ech hodnot z intervalu <1-n>.");
		do{
			System.out.println("Zadej vstupn� hodnotu n v�t�� ne� 0: ");
			vstupniHodnota = VstupDat.ctiInt();
		}while(vstupniHodnota<=0);
		
		for(int opakovani = vstupniHodnota;opakovani>=1; opakovani--){
			suma = suma + opakovani;
		}
		System.out.println("Sou�et v�ech ��sel je: "+suma+".");
	}
}