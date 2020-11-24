
public class Gioco {
	
	private int contatore;
	private boolean giocatore = ; // 0 computer 1 Utente
	private int scambio = 0;
	private int i;
	private int y;
	
	public Gioco() {
	}
	
	private void ordinaNumeri(Dado[] dado) {
		
		for(this.i=0; this.i<dado.length; this.i++) {
			for(this.y=this.i; this.y<dado.length; this.y++) {
				
				if(dado[i].leggi() > dado[y].leggi()) {
					this.scambio = dado[i].leggi();;
					dado[i].setNumero(dado[y].leggi());
					dado[y].setNumero(scambio); 
				}
			}
		}
	}
	
	public void calcolaPunti(Dado[] dado, boolean utente){
		
		this.giocatore = utente;
		
		ordinaNumeri(dado);
		
		for(this.i=0; i<dado.length; this.i++) 
			if(dado[i].leggi()+1 == dado[i].leggi()) 
				this.contatore++;
			
		if(this.giocatore == true) {
			
		}
			
		
	}

}
