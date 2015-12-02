public class Cviceni2Pr10{
	public static void main (String[] args){
		int x,y;
		
		System.out.println("Pri zadani souradic program zjisti zda se bod nachazi uvnitr, na hrane, nebo mimo obvodu obdelniku.");
		System.out.println("Zadej souradnici x: ");
		x = VstupDat.ctiInt();
		System.out.println("Zadej souradici y: ");
		y = VstupDat.ctiInt();
		
		if (x<2 || x>8 || y<3 || y>5) System.out.println("Bod se nenachazi v obdelniku.");
		
		else if (y==4 && x>=3 && x<=7) System.out.println("Bod se nachazi uvnitr obdelniku.");
		
		else if (x>=2 && x<=8 && y==5 || y==3)System.out.println("Bod se nachazi na hrane obdelniku.");
		 else if (y>=3 && y<=5 && x==2 || x==8)System.out.println("Bod se nachazi na hrane obdelniku.");
							
			}
	}