public class Cviceni5Pr8{
	public static void main (String[] args){
		int spodniHranice = 0;
		int horniHranice = 50;
		int p = 0;
			
		System.out.println("Program vyp�e v�echna ��sla d�liteln� 5 z intervalu <0-50> a z�rove� vyp�e jejich po�et.");
		System.out.println("");
		
		if(horniHranice%5 == 0){
		for(int opakovani = horniHranice;opakovani>0;opakovani-=5){
			System.out.println(opakovani);
			p++;
			}
		System.out.println("");		
		System.out.println("��sel je dohromady: "+p+".");
		}
		else{
		System.out.println("");		
		System.out.println("Horn� hranice intervalu nen� d�liteln� 5.");
		}
	}
}