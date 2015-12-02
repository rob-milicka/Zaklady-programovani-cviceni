public class Cviceni8Pr2{
	
	public static int kolikPrvku(int[] polePrvku){
	int pocet = 0;
	
	for (int i = 0; i < polePrvku.length; i++){
		if (polePrvku[i]<5)pocet++;
		}
		return pocet;		
	}
	
	public static void main(String[] args){
	int [] polePrvku;
	int n;
	int pocet;
	
	System.out.println("Zadej pocet prvku pole: ");
	n = VstupDat.ctiInt();
	polePrvku = new int[n]; 
	
		
	for(int i = 0; i < polePrvku.length; i++){
		polePrvku[i] = (int)(Math.random()*10+1);
		}
		
	for(int i = 0; i < polePrvku.length; i++){
		System.out.println(polePrvku[i]);
		}
		
	pocet = kolikPrvku(polePrvku);
	System.out.println("Pocet prvku mensich nez 5 je: "+pocet);		
	}	
}