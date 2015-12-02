public class Cviceni5Pr8{
	public static void main (String[] args){
		int spodniHranice = 0;
		int horniHranice = 50;
		int p = 0;
			
		System.out.println("Program vypíše všechna èísla dìlitelná 5 z intervalu <0-50> a zároveò vypíše jejich poèet.");
		System.out.println("");
		
		if(horniHranice%5 == 0){
		for(int opakovani = horniHranice;opakovani>0;opakovani-=5){
			System.out.println(opakovani);
			p++;
			}
		System.out.println("");		
		System.out.println("Èísel je dohromady: "+p+".");
		}
		else{
		System.out.println("");		
		System.out.println("Horní hranice intervalu není dìlitelná 5.");
		}
	}
}