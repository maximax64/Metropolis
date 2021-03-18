import java.util.Scanner;

public class Employe extends User{


	public Employe(int idUser, String loginUser, String passwordUser, String profil) {
		super(idUser, loginUser, passwordUser, profil );
	}
	public Employe(User unUser, int nbEmprunt)
	{
		this.setIdUser(unUser.getIdUser());
		this.setLoginUser(unUser.getLoginUser());
		this.setPasswordUser(unUser.getPasswordUser());
		this.setProfil(unUser.getProfil());
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}
	
	public void inscriptionNouveauMembre(Membre unMembre) 
	 {
		Scanner sc = new Scanner(System.in);
		Membre nouveauMembre = new Membre();
		System.out.println("Entrer Identifiant du membre :");
		String loginMembre =sc.next();
		nouveauMembre.setLoginUser(loginMembre);
		System.out.println("Entrer  Mot de Passe du membre :");
		String mdpMembre  =sc.next();
		nouveauMembre.setLoginUser(mdpMembre);
		
		
		
	}
	
	public Employe inscriptionNouveauEmploye(Employe unEmploye)
	{
		Employe nouveauEmploye = new Employe();
		
		return nouveauEmploye;
		
	}
	
	public void realiserEmprunt(Document unDocument, Membre unMembre) {
		
		
	}
	
	
}
