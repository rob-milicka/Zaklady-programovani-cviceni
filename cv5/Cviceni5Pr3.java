public class Cviceni5Pr3{
	public static void main(String[] args){
		int pocetCisel;
		int suma;
		int pocet;
		
		do{
			System.out.println("Zadej po�et ��sel pro v�po�et sou�inu:" );
			pocetCisel = VstupDat.ctiInt();
		}while(pocetCisel<=0);
		
		suma = 1;
		for(int cislo=1; cislo<=pocetCisel; cislo++){
			suma = suma * cislo;
		}
		System.out.println("Soucin je: " +suma+ ".");
	}
}