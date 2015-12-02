/*
 *	Pole o N prvcích naplòte náhodnými èísly z intervalu <0,10>, 
 *	prvky pole vytisknìte.Sestavte metodu, která zjistí kolik prvkù 
 *	pole je menších než 5.
 */

public class Cviceni8Pr2{

	public static int pocetCisel(int[] pole) {
		int s = 0;
	
		for (int i = 0; i < pole.length; i++) 
			if (pole[i] < 5)
				s++;
		return s;
	}		
 	public static void main (String[] args) {
 		int[] a;
 		int n, pocet = 0;
 	
 		System.out.print("zadej pocet prvku pole: ");
 		n = VstupDat.ctiInt();
 		a = new int[n];
 		
 		for (int i = 0; i < a.length; i++) {
 			a[i] =(int)(Math.random()*10+1);
 			System.out.print(a + "  ");
 		}
 		System.out.println();		// pøechod na nový øadek	 
 		pocet = pocetCisel(a);
 		System.out.println("pocet cisel mensich nez 5: "+pocet);
 	}
}		