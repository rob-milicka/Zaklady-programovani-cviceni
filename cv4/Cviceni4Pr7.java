public class Cviceni4Pr7{
	public static void main (String[] args){
		int dluh = 5000;
		int splatka = 0;
		int pocitadlo = 0;
		
		System.out.println("Atkualni dluh je: "+dluh+".");
		while (dluh>0){
		System.out.println("Vyse dluhu klesla na: "+dluh+ ".");
		System.out.println("Zadej splatku: ");
		splatka = VstupDat.ctiInt();
		dluh = dluh - splatka;
		pocitadlo++;
		}
		if (dluh==0)System.out.println("Dluh je zcela zaplacen. Splátku jsme uskuteènili "+pocitadlo+ "x.");
		 else if (dluh<0)System.out.println("Dluh jsme pøeplatili o "+Math.abs(dluh)+" korun.");
	}
}