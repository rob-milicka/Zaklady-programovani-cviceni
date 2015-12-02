/*
 *	Podle zadaneho cisla dne vypise nazev dne,
 *	pro chybne zadane cislo dne vypise varovnou 
 *	informaci. Pro reseni jsme pouzili vnorene vetveni.
 *
 */
 
 public class Cviceni3Pr5 {
 	public static void main (String[] args) {
 		int cisloDne;
 		
 		System.out.print ("Zadej cislo dne v tydnu z intervalu <1,7>: ");
 		cisloDne = VstupDat.ctiInt();
 		
 		if (cisloDne == 1) System.out.println("pondeli");
 	 	  else if (cisloDne == 2) System.out.println("utery");
 			else if (cisloDne == 3) System.out.println("streda");
 				else if (cisloDne == 4) System.out.println("ctvrtek");
 					else if (cisloDne == 5) System.out.println("patek");
 						else if ((cisloDne == 6) || (cisloDne == 7))System.out.println("vikend");
 							else System.out.println("chybne cislo dne");	
 	}
 }