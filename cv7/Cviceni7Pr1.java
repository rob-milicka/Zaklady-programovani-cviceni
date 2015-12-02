public class Cviceni7Pr1 {
	
	public static boolean ZjisteniDelitelnosti(int a, int b){
		if (a%b == 0) return true;
			else return false;
	}
	
    public static void main(String[] args) {
    int a,b;
    
       System.out.println("Zadej prvni cislo ...");
       a = VstupDat.ctiInt();
       System.out.println("Zadej druhe cislo ...");
       b = VstupDat.ctiInt();
       
       boolean c = ZjisteniDelitelnosti (a,b);
       if (c == true)System.out.println("Cisla jsou delitelna beze zbytku.");
       		else System.out.println("Cisla nejsou delitelna beze zbytku.");
    }
}