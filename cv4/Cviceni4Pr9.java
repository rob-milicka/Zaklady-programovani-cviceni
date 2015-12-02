public class Cviceni4Pr9{
	public static void main(String[] args){
		
		int body = 0;
		int splnil = 0;
		int nesplnil = 0;
		int neprisel = 0;
		
		System.out.println("Zadávej hodnoty výsledkù testu. Program se ukonèí pøi zadání záporné hodnoty nebo hodnoty vìtší než 20.");
		
		while (body<=20&&body>=0){
		body = VstupDat.ctiInt();
		if (body==0)neprisel++;
		if (body>=11&&body<=20)splnil++;
		if (body>=1&&body<=10)nesplnil++;
		}
		
		System.out.println("Výsledky testu:");
		System.out.println(+splnil+" žákù splnilo.");
		System.out.println(+nesplnil+" žákù nesplnilo.");
		System.out.println(+neprisel+" žákù nepøišlo.");
	}
}