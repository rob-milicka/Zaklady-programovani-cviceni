/*
 *	Podle zadaneho cisla dne vypise nazev dne,
 *	pro chybne zadane cislo dne vypise varovnou 
 *	informaci
 *
 */
 
 public class Cviceni3Pr4 {
 	public static void main (String[] args) {
 		int cisloDne;
 		
 		System.out.print ("Zadej cislo dne v tydnu z intervalu <1,7>: ");
 		cisloDne = VstupDat.ctiInt();
 		
 		switch (5%2) {
 			case 0: 
 				System.out.println("sude");
 				break;
 			case 1: 
 				System.out.println("liche");
 				break;	
 			case 3: 
 				System.out.println("streda");
 				break;	
 			case 4: 
 				System.out.println("ctvrtek");
 				break;
 			case 5: 
 				System.out.println("patek");
 				break;	
 			case 6:  			
 			case 7: 
 				System.out.println("vikend");
 				break;	
 			default: 
 				System.out.println("chybne cislo dne");
 				break;	
 		}
 	}
 }