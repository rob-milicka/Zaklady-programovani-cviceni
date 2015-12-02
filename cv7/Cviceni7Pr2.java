public class Cviceni7Pr2 {
	
	public static boolean StranyTrojuhelnika(int a, int b, int c){
		if (((a+b)>c)&&((b+c)>a)&&((a+c)>b)) return true;
			else return false;
		
	}
	
    public static void main(String[] args) {
       int a,b,c;
       
       System.out.println("Zadej stranu a ...");
       a = VstupDat.ctiInt();
       System.out.println("Zadej stranu b ...");
       b = VstupDat.ctiInt();
       System.out.println("Zadej stranu c ...");
       c = VstupDat.ctiInt();
       
       boolean vysledek = StranyTrojuhelnika(a,b,c);
       
       if (vysledek == true)System.out.println("Jedna se o trojuhelnik.");
       		else System.out.println("Strany netvori trojuhelnik.");
       
    }
}
