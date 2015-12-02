public class Cviceni4Pr4{
	public static void main (String[] args){
		int a,p=0;
		
		System.out.println("Program ète z klávesnice celá èísla a zastaví se po naètení nuly. Zjistìtí poèet všech èísel na vstupu (mimo nulu).");
		
		while(true){
			a = VstupDat.ctiInt();
			if (a==0)
				break;
				p++;
		}
		System.out.println("Pocet cisel na vstupu je: "+p+".");
	}
}