/*
 *	Do prvkù pole o 5 prvcích naètìte celá èísla. Vytisknìte prvky pole 
 *	do jednoho øádku oddìlené mezerou. 
 */

public class Cviceni8Pr1{
 	public static void main (String[] args) {
 		int[] a = new int [5];
  		
  		System.out.println("Postupne budeme zadavat 5 celych cisel ");

 		for (int i = 0; i < a.length; i++) {
 			System.out.print("Zadej " + (i+1) + ". cislo: ");
 			a[i] = VstupDat.ctiInt();
 		}
 		System.out.print("Obsah prvku pole: ");
 		for (int i = 0; i < a.length; i++) {
 			System.out.print(a[i] + " ");
 		}
 		System.out.println();		// pøechod na nový øadek	 
 	}
}		