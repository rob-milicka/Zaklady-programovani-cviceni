public class Cviceni4Pr4{
	public static void main (String[] args){
		int a,p=0;
		
		System.out.println("Program �te z kl�vesnice cel� ��sla a zastav� se po na�ten� nuly. Zjist�t� po�et v�ech ��sel na vstupu (mimo nulu).");
		
		while(true){
			a = VstupDat.ctiInt();
			if (a==0)
				break;
				p++;
		}
		System.out.println("Pocet cisel na vstupu je: "+p+".");
	}
}