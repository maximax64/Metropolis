public class Membre extends User{
	
	private int nbEmprunt = 0;
	private final static int MAX_EMPRUNT = 14;
	
	public Membre(int idUser, String loginUser, String passwordUser, boolean isMembre, boolean isEmploye, int nbEmprunt) {
		super(idUser, loginUser, passwordUser, isMembre, isEmploye);
		this.nbEmprunt = nbEmprunt;
	}
	
	public int getNbEmprunt() {
		return nbEmprunt;
	}
	public void setNbEmprunt(int nbEmprunt) {
		this.nbEmprunt = nbEmprunt;
	}
	public static int getMAX_EMPRUNT() {
		return MAX_EMPRUNT;
	}
	
	public String consulterParametres()
	{
		String param;
		param = "===PARAMETRES UTILISATEURS===\n";
		param += "=ID : " + this.getIdUser() + "\n";
		param += "=LOGIN : " + this.getLoginUser()+ "\n";
		param += "=ROLE : " + this.isMembre() + "\n";
		param += "NOMBRE D'EMPRUNTS : " + this.getNbEmprunt() + " / " + Membre.getMAX_EMPRUNT();
		param += "============================";
		return param;
	}
	
}
