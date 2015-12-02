public class Cviceni7Pr3 {
	
	public static boolean prvocislo(int a){
		if(a < 2) return false;
		if (a == 2) return true;
		if (a % 2 == 0) return false;
		for (int i=3; i<a; i++){
			if (a % i == 0)return false;
		}
		return true;
	}
	
	public static int ctiKladne(){
		int vstupniHodnota;
		
		System.out.println("Zadej kladne cislo pro zjisteni zda se jedna o prvocislo: ");
		vstupniHodnota = VstupDat.ctiInt();
		while(vstupniHodnota<=0){
			System.out.println("Nebyla zadana kladna hodnota. Zadej znovu.");};
		return vstupniHodnota;
	}
	
    public static void main(String[] args) {
        System.out.println(prvocislo(ctiKladne()));
    }
}
