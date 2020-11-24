
public class Main {
	
	public static void main(String[] args) {
		
		Gioco gioco = new Gioco();
		Dado[] dado = new Dado [5];
		dado[0] = new Dado (6);   
		dado[1] = new Dado (6); 
		dado[2] = new Dado (6); 
		dado[3] = new Dado (6); 
		dado[4] = new Dado (6); 

		gioco.calcolaPunti(dado);
	}
}
