/* 
 * Program nacte dve cela ruzna cisla a vypise, ktere cislo je vetsi.
 * 
 */
  

public class Cviceni2Pr3 {
	public static void main (String[] args) {
	int a, b;
		
		System.out.print("zadej prvni cele cislo: " );
		a = VstupDat.ctiInt();
		
		System.out.print("zadej druhe cele cislo ruzne od prvniho cisla: " );
		b = VstupDat.ctiInt();
		
		if (a >= b)System.out.println("cislo "+a+ " je vetsi, nez cislo " + b);
			else System.out.println("cislo "+ b + " je vetsi, nez cislo " + a);
}
}
