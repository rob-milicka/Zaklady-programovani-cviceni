public class Cviceni2Pr9{
	public static void main(String[] args){
		int x,y,z;
		
		System.out.println("Ktere cislo je nejvetsi? Zadej 3 cisla.");
		
		System.out.println("Zdej hodnotu X.");
		x = VstupDat.ctiInt();
		
		System.out.println("Zadej hodnotu Y.");
		y = VstupDat.ctiInt();
		
		System.out.println("Zadej hodnotu Z.");
		z = VstupDat.ctiInt();
		
		if (x>y && x>z) System.out.println("Nejvetsi cislo je: " +x+".");
		if (y>x && y>z) System.out.println("Nejvetsi cislo je: " +y+".");
		if (z>y && z>x) System.out.println("Nejvetsi cislo je: " +z+".");
	}
}