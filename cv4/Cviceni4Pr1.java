public class Cviceni4Pr1{
	public static void main (String[] args){
		
		int x = 1;
		int suma = 0;
		int n;
		
		System.out.println("Zadej hodnotu koncoveho cisla intervalu: ");
		n = VstupDat.ctiInt();
		while (x<=n){
			suma = suma + x;
			x = x+1;
		}
		System.out.println("Soucet vsech cisel je: " +suma+ ".");
	}
}