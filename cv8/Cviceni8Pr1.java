public class Cviceni8Pr1{
	public static void main(String[] args){
	int a;
	int[] polePrvku = new int [5];
	
	System.out.println("Zadej postupne 5 cisel.");
	
	for(int i = 0; i < polePrvku.length; i++){
		System.out.println("Zadej "+(i+1)+" cislo.");
		polePrvku[i] = VstupDat.ctiInt();
	}
	
	System.out.println("Vypis prvku pole: ");
	for (int i = 0; i < polePrvku.length; i++){
		System.out.print(polePrvku[i]+" ");
		}
	}	
}