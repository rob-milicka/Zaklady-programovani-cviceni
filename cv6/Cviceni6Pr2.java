public class Cviceni6Pr2{
	
	public static int fakt1(int n){
	int suma = 1;
		do{
			for(int i = 1; i<=n; i++){
				suma = suma * i;
			}
			return suma;
		}while(n>0);	
	}
	
	public static int fakt2(long n){
	int suma = 1;
		do{
			for(int i = 1; i<=n; i++){
				suma = suma * i;
				System.out.println(suma);
			}
			return suma;
		}while(n>0);	
	}
	
	public static void main(String[] args){
	long vstupniHodnota;
	long vysledek;
		
		System.out.println("Zadejte ��slo pro v�po�et faktori�lu: ");
		vstupniHodnota = VstupDat.ctiInt();
		vysledek = fakt2(vstupniHodnota);
		System.out.println("Faktori�l !"+vstupniHodnota+" je "+vysledek+".");
	}
}