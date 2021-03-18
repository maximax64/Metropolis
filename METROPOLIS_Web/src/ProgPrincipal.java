import java.util.Scanner;  // Import the Scanner class


public class ProgPrincipal {


	public static void main(String[] args) throws InterruptedException {
		
		int choix = 0;
		while(choix != -1)
		{
			
			print("=== MENU PRINCIPAL ===");
			print("= OPTION 1 : SE CONNECTER =");
			print("= OPTION 2 : ... =");
			print("= OPTION 3 : ... =");
			print("= OPTION 4 : ... =");
			print("= OPTION 5 : ... =");
			print("= OPTION 6 : quitter... =");
			
			Scanner sc = new Scanner(System.in);  // Create a Scanner object
			System.out.print("\r= CHOIX ? : ");
			int opt = sc.nextInt();
			
			switch(opt) { // MENU SECONNECTER
			  case 1:
				  print("\r== SE CONNECTER == ");
				  print("= OPTION 1 : se connecter =");
				  print("= OPTION 2 : retour au menu principal... =");
				  System.out.print("\r= CHOIX ? : ");
				  int opt1 = sc.nextInt();
				  switch(opt1) { //DEUXIEME MENU
				  	
				  	case 1:
				  		print("\r== SE CONNECTER == ");
				  		// Rentrer login
				  		System.out.print("= Login : ");
				  		String login = sc.next();
				  		// Rentrer mdp
				  		System.out.print("= Mot de passe : ");
				  		String password = sc.next();
				  		
				  		//choix du profil
				  		System.out.print("CHOIX PROFIL (Employe = 1) (Membre = 2)");
				  		String profil = sc.next();
				  		
				  		
				  		if(profil.equals("1")){
				  			profil = "Employe";
				  		}else if (profil.equals("2")){
				  			profil = "Membre";
				  		}
				  		///Un user se connecte si les logins sont VRAI, on récupère isMember ou isEmploye et on créé l'objet adéquat
				  		//User unUser = new User(...);
				  		System.out.println("profil:"+profil);
				  		User user = new User(0,login,password,profil);
				  		// User user = new User(1,login,password,"","Employé");
				  		
				  		switch(user.getProfil()) 
				  		//si le user  
				  		{
				  			// Sous menu employé
				  			case "Employe": //est un employé
				  					//faire ceci...
				  				Employe unEmploye = new Employe(user,0);
				  				print("\r== ESPACE EMPLOYE == ");
			  					print("= OPTION 1 : INSCRIRE UN MEMBRE/PERSONNEL =");
			  					print("= OPTION 2 : RECHERCHER UN DOCUMENT =");
			  					print("= OPTION 3 : GERER EMPRUNT DOCUMENT =");
			  					print("= OPTION 4 : METTRE A JOUR BASE DE DONNEES =");
			  					System.out.print("\r= CHOIX ? : ");
			  					int opt3 =sc.nextInt();
			  					switch(opt3)
			  					{
			  						case 1:
			  							print("\r== INSCRIPTION MEMBRE/PERSONNEL ==");
			  							print("= OPTION 1 : INSCRIRE UN MEMBRE =");
			  							print("= OPTION 1 : INSCRIRE UN PERSONNEL =");
			  							System.out.print("\r= CHOIX ? : ");
			  							int opt5 =sc.nextInt();
			  							switch(opt5)
			  							{
			  								case 1: 
			  									unEmploye.inscriptionNouveauMembre(Membre unMembre);
			  									
			  									
			  							}
			  							
			  						case 4:
			  							print("\r== METTRE A JOUR BASE DE DONNEES == ");
					  					print("= OPTION 1 : AJOUTER UN DOCUMENT =");
					  					print("= OPTION 2 : SUPPRIMER UN DOCUMENT =");
					  					print("= OPTION 3 : MODIFIER UN DOCUMENT =");
					  					print("= OPTION 4 : ANNULER =");
					  					System.out.print("\r= CHOIX ? : ");
					  					int opt4 =sc.nextInt();
					  					break;
			  					}
			  					break;
			  					
			  					//sous menu membre
				  			case "Membre": //est un membre
				  					//faire autre chose...
				  				print("\r== ESPACE MEMBRE == ");
			  					print("= OPTION 1 : CONSULTER PARAMETRES =");
			  					print("= OPTION 2 : RECHERCHER UN DOCUMENT =");
			  					System.out.print("\r= CHOIX ? : ");
				  				int opt2 = sc.nextInt();
				  				switch(opt2)
				  				{
					  				case 1:
					  					System.out.print(unMembre.consulterParametres()+"\n");
					  					break;
					  				case 2:
					  					//fonction recherche document du Membre
					  					break;
				  				}
				  				break;
				  		}
				  		Thread.sleep(5000);
				  		break;
				  		
				  	case 2:
				  		print("= Retour au menu principal...");
				  		choix = 0;
				  		break;
				  }
				  break;
			  case 2:
			    // code block
			    break;
			  case 3:
			    // code block
			    break;
			  case 4:
			    // code block
			    break;
			  case 5:
			    // code block
			    break;
			  case 6:
				  print("= Terminaison du programme... =");
				  choix = -1;
				  break;
			 	  
				}	
			}
		}

	private static void print(String string) {
		
		System.out.println(string);
		
	}

}
