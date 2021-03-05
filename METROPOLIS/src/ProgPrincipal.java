import java.util.Scanner;  // Import the Scanner class

public class ProgPrincipal {

	
	public static void main(String[] args) throws InterruptedException {
		
		int choix = 0;
		while(choix != -1)
		{
			Thread.yield();
			
			print("=== MENU PRINCIPAL ===");
			print("= OPTION 1 : SE CONNECTER =");
			print("= OPTION 2 : ... =");
			print("= OPTION 3 : ... =");
			print("= OPTION 4 : ... =");
			print("= OPTION 5 : ... =");
			print("= OPTION 6 : quitter... =");
			
			Scanner sc = new Scanner(System.in);  // Create a Scanner object
			print("\r= CHOIX ? : ");
			int opt = sc.nextInt();
			
			switch(opt) { //PREMIER MENU
			  case 1:
				  print("\r== SE CONNECTER == ");
				  print("= OPTION 1 : se connecter =");
				  print("= OPTION 2 : retour au menu principal... =");
				  print("= CHOIX ? : ");
				  int opt1 = sc.nextInt();
				  switch(opt1) { //DEUXIEME MENU
				  	
				  	case 1:
				  		print("== SE CONNECTER == ");
				  		
				  		print("= Login : ");
				  		String login = sc.next();

				  		print("= Mot de passe : ");

				  		String password = sc.next();
				  		///Un user se connecte si les logins sont VRAI, on récupère isMember ou isEmploye et on créé l'objet adéquat
				  		//User unUser = new User(...);
				  		User user = new User(0,login,password,"Membre","");
				  		
				  		switch(user.getIsMembre())//TROISIEME MENU  
				  		//si le user  
				  		{
				  			case "Employé": //est un employé
				  					//faire ceci...
				  				break;
				  			case "Membre": //est un membre
				  					//faire autre chose...
				  				Membre unMembre = new Membre(user,0);
				  				print(unMembre.consulterParametres()+"\n");
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
			Thread.yield();
		}

	private static void print(String string) {
		
		System.out.println(string);
		
	}

}
