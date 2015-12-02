public class Cviceni1Pr2 {
	public static void main (String[]  args)  {
		int i  =  5;
		
    	System.out.println (i);		//   vytiskne na obrazovku hodnotu 5 a presune kurzor na novy radek
    	System.out.print (i);		//   vytiskne na obrazovku hodnotu 5 a kurzor zustane za vytistenou hodnotou
		
    	System.out.println ("  hodnota i \n=  " + i );	//  vytiskne na obrazovku 
      													//  text uvedený v uvozovkách
      													//  a pak obsah promìnné i
		
    	/*   Výpis na obrazovku a odøádkovánípomoci escape sekvence:  */
    	System.out.print(i  + "\n" ); 	// vytiskne na obrazovku hodnotu 5 
      									// a posune kurzor na další  øádek (odøádkuje). Posun kurzoru na nový øádek 				
      									//  je zajištìn pomocí øídící posloupnosti (tzv. escape sekvence) "\n ")
		
    	System.out.println (i); 		// tento pøíkaz vykoná úplnì stejnou "akci" 
      									// jako pøíkaz pøedchozí, tzn. vypíše a odøádkuje.
      									// Odøádkování je zajištìno použitím modifikované 
      									// formy pøíkazu pro výpis-je použita metoda
      									// println( )
		
	}	// 	konec metody main
}		//	konec tridy Cviceni1Pr2
