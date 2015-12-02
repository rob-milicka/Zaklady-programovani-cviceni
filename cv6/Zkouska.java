public class Zkouska {
	public static void main(String[] args){
		int n;
		int pocet = 0;
		
		System.out.println("Zadej cislo: ");
		n = VstupDat.ctiInt();

		for (int i = 1; n>0; i++){
			n = n/10;
			pocet = i;
		}
		System.out.println("Pocet cifer je: "+pocet);
	}
}