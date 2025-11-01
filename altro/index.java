//inserire nel main gli attributi puntata, quota, s e i punti delle due squadre
//inserire anche l'attributo in cui si vuole salvare la vincita
//chiedere quale squadra si punta (s che può essere 0 o 1)
//chiedere quanto si vuole puntare (puntata)
//inserire nei parametri dell'oggetto la quota della squadra scelta
//a fine partita cambiare il valore dei punteggi (puntiS1 e puntiS2)
//a questo punto si possono usare i metodi della classe
//usare "calcolo_vincita" per calcolare la vincita (che è diversa dal guadagno effettivo)
//usare metodo "toString_guadagnoEffettiva" per visualizzare il guadagno
//altrimenti "getVincita" dopo il calcolo per viualizzare la vincita
//usare il metodo "toString_probabilità" per visualizzare la probabilità che vince la squadra scelta
//usare i metodi setter e getter per visualizzare e modificare gli attributi inseriti all'inizio

public class betManagement 
{
	private float puntata, quota, probabilità_evento, vincita;
	private int puntiS1, puntiS2, s;
	
	public betManagement(float puntata, float quota, int s, int puntiS1, int puntiS2)
	{
		this.puntata = puntata;
		this.quota = quota;
	}
	
	//metodi classe
	public void calcolo_vincita1X2(float vincita, float quota, int s, int puntiS1, int puntiS2)
	{
		if(puntiS1 > puntiS2 && s == 0)
			vincita = quota * puntata;
		else
		    vincita = 0;
		if(puntiS1 < puntiS2 && s == 0)
			vincita = quota * puntata;
		else
			vincita = 0;
		if(puntiS1 == puntiS2 && s == 0)
			vincita = quota * puntata;
		else 
			vincita = 0;
	}
	
    //metodi toString
	public String toString_guadagnoEffettiva() 
	{
		if(vincita > puntata )
		    return "Hai vinto: " + (vincita - puntata) + " euro!";
		else if(vincita < puntata)
			return "Hai perso " + (puntata - vincita) + " euro!";
		else
		    return "Nessun guadagno";
	}
	public String toString_probabilità()
	{
		probabilità_evento = (1 / quota) * 100;
	    return "La tua squadra ha " + probabilità_evento  + "probabilità di vincere";
	}
	public float getVincita()
	{
		return vincita;
	}

	//metodi getter e setter
	public float getPuntata() 
	{
		return puntata;
	}

	public void setPuntata(float puntata) 
	{
		this.puntata = puntata;
	}

	public float getQuota()
	{
		return quota;
	}

	public void setQuota(float quota)
	{
		this.quota = quota;
	}

	public int getPuntiS1() 
	{
		return puntiS1;
	}

	public void setPuntiS1(int puntiS1) 
	{
		this.puntiS1 = puntiS1;
	}

	public int getPuntiS2() 
	{
		return puntiS2;
	}

	public void setPuntiS2(int puntiS2) 
	{
		this.puntiS2 = puntiS2;
	}

	public int getS() 
	{
		return s;
	}

	public void setS(int s) 
	{
		this.s = s;
	}
}
