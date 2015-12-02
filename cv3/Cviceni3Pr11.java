public class Cviceni3Pr11 {
	public static void main(String[] args){
		int a,b,c;
		double d;
		
		System.out.println("Program provede vybranou pocetni operaci dvou zadanych cisel.");
		System.out.println();
		System.out.println("Scitani - klavesa num1");
		System.out.println("Odcitani - klavesa num2");
		System.out.println("Nasobeni - klavesa num3");
		System.out.println("Presne deleni - klavesa num4");
		System.out.println("Celociselne deleni - klavesa num5");
		System.out.println("Zbytek po deleni - klavesa num6");
		System.out.println();
		
		System.out.println("Zadej prvni cislo: ");
		a = VstupDat.ctiInt();
		System.out.println("Zadej druhe cislo: ");
		b = VstupDat.ctiInt();
		
		System.out.println("Zadej cislo operace: ");
		c = VstupDat.ctiInt();
		
		switch (c){
			case 1: System.out.println("Vysledek je: "+(a+b)+".");
			break;
			case 2: System.out.println("Vysledek je: "+(a-b)+".");
			break;
			case 3:	System.out.println("Vysledek je: "+(a*b)+".");
			break;
			case 4:
			if (b<0 || b==0){
				System.out.println("Operace neprovedena. Nulou delit nelze.");
			}
				else{
					d = (double)a/b;
					System.out.println("Vysledek je: "+d+".");
				}
			break;
			case 5:
						if (b<0 || b==0){
				System.out.println("Operace neprovedena. Nulou delit nelze.");
			}
				else{
					System.out.println("Vysledek je: "+(a/b)+".");
				}
			break;
			case 6:
						if (b<0 || b==0){
				System.out.println("Operace neprovedena. Nulou delit nelze.");
			}
				else{
					System.out.println("Vysledek je: "+(a%b)+".");
				}
			break;
	}
}
}