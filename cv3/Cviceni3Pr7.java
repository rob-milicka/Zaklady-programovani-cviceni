public class Cviceni3Pr7 {
	public static void main (String[] args){
		int a,b;
		double d;
		System.out.println("Zadej hodnotu prvni odvesny: ");
		a = VstupDat.ctiInt();
		System.out.println("Zadej hodnotu druhe odvesny: ");
		b = VstupDat.ctiInt();
		
		if (a==0){
			System.out.println("Vypocet neproveden - nepovolena hodnota.");
		}
			else {
				d = Math.pow(a,2)+Math.pow(b,2);
				System.out.println("Vysledna hodnota je: "+Math.sqrt(d));
			}
	}
}