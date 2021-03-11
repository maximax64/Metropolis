package metropolis.entities;
import java.io.Serializable;

public class Employe extends User implements Serializable{

	private double salaire;

	public Employe(int idUser, String loginUser, String passwordUser, String isMembre, String isEmploye,
			double salaire) {
		super(idUser, loginUser, passwordUser, isMembre, isEmploye);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	public Membre inscriptionMembre(Membre unMembre) {
		
		Membre nouveauMembre = new Membre();
		return nouveauMembre;
	}
	
	public void realiserEmprunt(Document unDocument, Membre unMembre) {
		
		
	}
	
	
}
