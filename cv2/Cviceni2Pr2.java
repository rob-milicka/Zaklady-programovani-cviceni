/* 
 * Program nacte cele cislo a zjisti, zda je mensi, vetsi nebo rovne nule.
 * K reseni jsem pouzili jednoduchy if a pak vnoreny if.
 * 
 */
  

public class Cviceni2Pr2 {
	public static void main (String[] args) {
	int a;
		
		System.out.print("zadej cele cislo: " );
		a = VstupDat.ctiInt();
		
	// reseni pomoci jednoducheho if	
		if (a < 0)System.out.println("zadane cislo je mensi nez nula");
		if (a > 0)System.out.println("zadane cislo je vetsi nez nula");
		if (a == 0)System.out.println("zadane cislo je rovne nule");

	// reseni pomoci vnoreneho if	
		if (a < 0)System.out.println("zadane cislo je mensi nez nula");
			else if (a > 0)System.out.println("zadane cislo je vetsi nez nula");
				 else System.out.println("zadane cislo je rovne nule");		
	}
}
