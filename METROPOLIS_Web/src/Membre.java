import java.io.Serializable;

public class Membre extends User implements Serializable{
	
	private int nbEmprunt = 0;
	private final static int MAX_EMPRUNT = 14;
	
	public Membre(int idUser, String loginUser, String passwordUser, String isMembre, String isEmploye, int nbEmprunt) {
		super(idUser, loginUser, passwordUser, isMembre, isEmploye);
		this.nbEmprunt = nbEmprunt;
	}
	
	public Membre() {
		
	}
	
	public Membre(User unUser, int nbEmprunt)
	{
		this.setIdUser(unUser.getIdUser());
		this.setLoginUser(unUser.getLoginUser());
		this.setPasswordUser(unUser.getPasswordUser());
		this.setIsMembre(unUser.getIsMembre());
		this.setIsEmploye(unUser.getIsEmploye());
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
		param = "\r===PARAMETRES UTILISATEURS===\n";
		param += "=ID : " + this.getIdUser() + "\n";
		param += "=LOGIN : " + this.getLoginUser()+ "\n";
		param += "=ROLE : " + this.getIsMembre() + "\n";
		param += "NOMBRE D'EMPRUNTS : " + this.getNbEmprunt() + " / " + Membre.getMAX_EMPRUNT() + "\n";
		param += "============================";
		return param;
	}
	
}
