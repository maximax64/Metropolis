import java.util.Scanner;

public class Employe extends User{


	public Employe(int idUser, String loginUser, String passwordUser, String profil) {
		super(idUser, loginUser, passwordUser, profil );
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}
	
	public void inscriptionNouveauMembre(Membre unMembre) 
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer Identifiant du membre :");
		String loginMembre =sc.next();
		unMembre.setLoginUser(loginMembre);
		System.out.println("Entrer  Mot de Passe du membre :");
		String mdpMembre  =sc.next();
		unMembre.setPasswordUser(mdpMembre);
	}
	
	public void inscriptionNouveauEmploye(Employe unEmploye)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer Identifiant de l'employe :");
		String loginEmploye =sc.next();
		unEmploye.setLoginUser(loginEmploye);
		System.out.println("Entrer  Mot de Passe de l'employe :");
		String mdpEmploye  =sc.next();
		unEmploye.setPasswordUser(mdpEmploye); 
		
	}
	
	public void realiserEmprunt(Document unDocument, Membre unMembre) {
		
		
	}
	
	public void rechercherUnDuocument()
	
}
