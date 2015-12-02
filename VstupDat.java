import java.io.*;

/** Konzolový vstup */

public class VstupDat {
 
 	 /* Metoda vraci cislo typu int, prectene ze vstupu
 	  * Nacitani se opakuje, dokud neni vse vporadku
 	  */
 	
	 public static int ctiInt() {
		int cislo = 0;
		String vstup;
		boolean nacteno = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				vstup = in.readLine();
				cislo = Integer.valueOf(vstup).intValue();
				nacteno = true;
			}
			catch (NumberFormatException e) {
				System.out.println("Musite zadat cislo! Zadejte znovu. " + e.getMessage());
			}
			catch (IOException e) {
				System.out.println("Chybne nactene cislo! Zadejte znovu. " + e.getMessage());
			}
		}while (!nacteno);	
		return cislo;
	}
	
	
 	 /* Metoda vraci cislo typu float, prectene ze vstupu
 	  * Nacitani se opakuje, dokud neni vse vporadku
 	  */

	public static float ctiFloat() {
		float cislo = 0;	
		String vstup;
		boolean nacteno = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				vstup = in.readLine();
				cislo = Float.valueOf(vstup).floatValue();
				nacteno = true;
			}
			catch (NumberFormatException e) {
				System.out.println("Musite zadat cislo! Zadejte znovu. ");
			}
			catch (IOException e) {
				System.out.println("Chybne nactene cislo! Zadejte znovu ");
			}
		}while (!nacteno);
		return cislo;
	}

	/*
	 * Metoda vraci posledni znak zadaneho retezce na vstupu
	 * Nacitani se opakuje, dokud neni vse vporadku
	 */
	 
	public static char ctiChar() {
		char ch = '+';
		boolean nacteno = false;
		
		do {
			try {
				ch = (char) System.in.read();
				System.in.read(); /* pro vynulovani vstupniho bufferu*/
				System.in.read(); /**/
				nacteno = true;
			} catch (Exception e) {
				System.err.println("Byl zadan neplatny znak!");
			}
		} while (!nacteno);
		return ch;
	}
	
 	 /* 
 	  *	Metoda vraci retezec znaku precteny ze vstupu
 	  */
		 
 public static String ctiString(){ //throws IOException
 	String radek;   // Naètený øádek
 	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
  	try {
   		return radek = stdin.readLine();
   	}
  	catch(Exception e){
  		System.err.println("chyba v retezci");
   		return "";
   	}
 }
}