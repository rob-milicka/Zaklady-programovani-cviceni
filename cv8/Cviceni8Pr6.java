public class Cviceni8Pr6{
	public static void main(String[] args){
		int[] a;
		int n;
		
		//zadavame pocet prvku pole
 		System.out.print("Zadej pocet prvku pole: ");
 		n = VstupDat.ctiInt();
 		a = new int[n];
 		
 		//cyklus pro generovani nahodnych cisel
 		for (int i = 0; i < a.length; i++) {
 			a[i] =(int)(Math.random()*10+1);
 			}
 			System.out.println("\nVygenerovane prvky pole jsou: ");
 		
 		System.out.println();
 		tiskPole(a);
		int pom = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = pom;
		tiskPole(a);
}
	
	public static void tiskPole(int[] a){
		//vypis prvku pole	
 		for (int i = 0; i < a.length; i++) {
 			System.out.print(a[i]+" ");
 			}
 		System.out.println();	
	}
}