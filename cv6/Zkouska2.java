public class Zkouska2{
	public static void main(String[] args){
		int cislo = 685;
		int soucet = 0;
		while (cislo > 0)
		{
		    soucet = soucet + (cislo % 10);
		    cislo = cislo / 10;
		};
		System.out.println(soucet);
	}
}