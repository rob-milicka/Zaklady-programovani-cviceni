/* 
 * Program nacte cele cislo a zjisti, zda je ruzne od nuly.
 * 
 */
  

public class Cviceni2Pr1 {
	public static void main (String[] args) {
	int a;
		
		System.out.print("zadej cele cislo: " );
		a = VstupDat.ctiInt();
		
		if (a != 0){
			System.out.println("zadane cislo je ruzne od nuly");
		}
		else {
			System.out.println("zadane cislo je nula");	
		}
	
		
		
	}
}
