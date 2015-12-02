public class Cviceni6Pr1{
	
	public static int soucetCisel(int n){
	int suma = 0;
		
		for(int i = 1; i<=n; i++){
			suma = suma + i;
			}
		return suma;
	}
	
	public static void main(String[] args){
	int vstupniHodnota;
	int vstup = 0;
		
		System.out.println("-------------------------------");
		System.out.println("Program vypoèítá souèet èísel z intervalu <1-n>.");
		System.out.println("-------------------------------");
		System.out.println("Zadej horní hranici intervalu: ");
		vstupniHodnota = VstupDat.ctiInt();		
		vstup = soucetCisel(vstupniHodnota);
		System.out.println("\nSouèet všech èísel intervalu <1-"+vstupniHodnota+"> je "+vstup+".");
	}
}