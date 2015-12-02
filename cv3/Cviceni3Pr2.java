/* 
 *	V programu je ukazka implicitni (rozsirujici konverze) a zuzujici konverze.
 *	Pri prekladu bude hlasena chyba v  datovych typech. Pro dalsi preklad pak 
 *  dejte prikaz x = s; do komentarovych zavorek  
 */

public class Cviceni3Pr2 {
	public static void main(String[] args) {
		
		short  s = 5;
		byte   x;
		int    i;
		float  f;
		
		System.out.println("s = " + s);
		i  =  s;	// rozsirujici konverze
		System.out.println("i = " + i);
		f  =  s;	// rozsirujici konverze
		System.out.println("f = " + f);
	
		x  =  (byte)s;   //  p�eklada� nahl�s� chybu: possible loss of precision: 
				   //  found: short,required: byte
	   			   //  proto�e se jedn� o zu�uj�c� konverzi
	   	   
		x  =  (byte)s;	//  toto by prob�hlo bez chyby
		System.out.println("x = " + x);		
	}
}

