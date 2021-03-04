public class Employe extends User{

	private double salaire;

	public Employe(int idUser, String loginUser, String passwordUser, boolean isMembre, boolean isEmploye,
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
	
	
	public void inscriptionMembre(Membre unMembre) {
		
		
	}
	
	public void realiserEmprunt(Document unDocument, Membre unMembre) {
		
		
	}
	
	
}
