
import java.time.LocalDate;


public class Repas {
   
    private int numero;
    private LocalDate date;
    private int nbCouvets = 4;
  
public Repas(int numero,  LocalDate date) {
		this.numero = numero
        this.dateInscription = dateInscription;
      	this.nbCouverts = nbCouverts;
    }

 public int getNumero(){
        return this.numero ;
    }
    
    public void setNumero(int numero){
        this.numero = numero ;
    }
    
public int getDate(){
        return this.Date ;
    }
    
    public void setDate(int date){
        this.date = date ;
    }    

	public int getNbCouverts(int nbCouverts){
		return nbCouverts;
	}

	public void setNbCouverts(){
		this.nbCouverts = nbCouverts;
	}

}
