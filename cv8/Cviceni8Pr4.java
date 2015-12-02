public class Cviceni8Pr4{
	public static void main(String[] args){
	 	int[] a;
	 	int[] b;
 		int n;
 		
 		//zadavame pocet prvku pole
 		System.out.print("Zadej pocet prvku pole: ");
 		n = VstupDat.ctiInt();
 		a = new int[n];
 		b = new int[n];
 		
 		//cyklus pro generovani nahodnych cisel
 		for (int i = 0; i < a.length; i++) {
 			a[i] =(int)(Math.random()*10-5);
 			}
 			System.out.println("\nObsah konstanty a.length je: "+a.length); //vypis konstanty a.length
 			System.out.println("\nVygenerovane prvky pole jsou: ");
 		//vypis prvku pole	
 		for (int i = 0; i < a.length; i++) {
 			System.out.print(a[i]+" ");
 			}
 			
 			System.out.print(" ");
 			System.out.println("\nSeznam prvku vygenerovany v opacnem poradi: ");
 		//vypis prvku pole od konce
 		for (int i = a.length-1; i >= 0; i--){
 			System.out.print(a[i]+" ");
 		}
 		 //vypis souctu vsech prvku pole
 		 int sumaVsech = 0;
 		 for (int i = 0; i < a.length; i++) {
 		 	sumaVsech = sumaVsech + a[i];
 			}
 		 System.out.println(" ");
 		 System.out.println("\nSoucet vsech prvku pole je: "+sumaVsech);			
 		
 		//vypis souctu vsech kladnych prvku pole
 		 int sumaKladnych = 0;
 		 for (int i = 0; i < a.length; i++) {
 		 	if(a[i]>0){
 		 	sumaKladnych = sumaKladnych + a[i];
 		 		}
 			}
 		 System.out.println("Soucet vsech kladnych prvku pole je: "+sumaKladnych);
	}
}