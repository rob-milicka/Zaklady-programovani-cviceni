public class Cviceni8Pr8{
	
	public static int pocetHorsichZnamek(int vypocetStudijnihoPrumeru, int[] naplneniPole){
		int pocet = 0;
		int[] a;
		a = naplneniPole;
		for(int i = 0; i<naplneniPole.length; i++){
			if(a[i]>vypocetStudijnihoPrumeru)pocet++;
			}
			System.out.println("Pocet horsich znamek nez prumer je: "+pocet);
			System.out.println("--------------------------------------");
			return pocet;
		}
		
	
	public static int[] naplneniPole(int pocetPredmetu){
		int[] znamkyPredmetu = new int[pocetPredmetu];
		
			for(int i = 0; i<pocetPredmetu; i++){
			znamkyPredmetu[i] = (int) (Math.random()*5+1);
			}
			return znamkyPredmetu;
		}
		
	public static void tiskPole(int[] naplneniPole){
		System.out.println("-----------------------");
		System.out.println("Generovane znamky jsou: ");
		for(int i = 0; i<naplneniPole.length; i++){
			System.out.println(naplneniPole[i]);
		}	
	}
	
	public static double vypocetStudijnihoPrumeru(int[] naplneniPole){
		int vypocet = 0;
		int suma = 0;
		
		for(int i = 0;i<naplneniPole.length; i++){
			suma = suma + naplneniPole[i];
			vypocet = suma/naplneniPole.length;
		}
		System.out.println("--------------------");
	    System.out.println("Studijni prumer je: "+(double)vypocet);
		return vypocet;
	}	
	
	public static void main(String[] args){
		int pocetPredmetu;
		double studijniPrumer;
		int[] a;

		System.out.println("Zadej pocet predmetu ktere student studoval: ");
		pocetPredmetu = VstupDat.ctiInt();
		
		a = naplneniPole(pocetPredmetu);
		
		tiskPole(a);
		studijniPrumer = vypocetStudijnihoPrumeru(a);
		pocetHorsichZnamek((int)studijniPrumer, a);
	}
}