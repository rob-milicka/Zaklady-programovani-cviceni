public class Cviceni1Pr2 {
	public static void main (String[]  args)  {
		int i  =  5;
		
    	System.out.println (i);		//   vytiskne na obrazovku hodnotu 5 a presune kurzor na novy radek
    	System.out.print (i);		//   vytiskne na obrazovku hodnotu 5 a kurzor zustane za vytistenou hodnotou
		
    	System.out.println ("  hodnota i \n=  " + i );	//  vytiskne na obrazovku 
      													//  text uveden� v uvozovk�ch
      													//  a pak obsah prom�nn� i
		
    	/*   V�pis na obrazovku a od��dkov�n�pomoci escape sekvence:  */
    	System.out.print(i  + "\n" ); 	// vytiskne na obrazovku hodnotu 5 
      									// a posune kurzor na dal��  ��dek (od��dkuje). Posun kurzoru na nov� ��dek 				
      									//  je zaji�t�n pomoc� ��d�c� posloupnosti (tzv. escape sekvence) "\n ")
		
    	System.out.println (i); 		// tento p��kaz vykon� �pln� stejnou "akci" 
      									// jako p��kaz p�edchoz�, tzn. vyp�e a od��dkuje.
      									// Od��dkov�n� je zaji�t�no pou�it�m modifikovan� 
      									// formy p��kazu pro v�pis-je pou�ita metoda
      									// println( )
		
	}	// 	konec metody main
}		//	konec tridy Cviceni1Pr2
