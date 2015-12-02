public class Cviceni6Pr3{
	
	public static void cas(){
	int hodiny,minuty,sekundy;
	int vstupniHodnota;
	int zbytek;	
	
	vstupniHodnota = VstupDat.ctiInt();
	hodiny = vstupniHodnota/3600;
	zbytek = vstupniHodnota%3600;
	minuty = zbytek/60;
	sekundy = zbytek%60;
	System.out.println("\nPøevedený èas: "+hodiny+"h:"+minuty+"m:"+sekundy+"s");
	}
	
	public static void main(String[] args){
	int vysledek;
	int vstupniHodnota;
	
	System.out.println("Zadej èas v sekundách. Program jej pøevede na formát hodiny:minuty:sekundy.");
	cas();	
	}
}