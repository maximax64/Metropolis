import java.util.Scanner;  // Import the Scanner class

public class ProgPrincipal {

	
	public static void main(String[] args) {
		
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
			
			switch(opt) {
			  case 1:
				  print("\r== SE CONNECTER == ");
				  print("= OPTION 1 : se connecter =");
				  print("= OPTION 2 : retour au menu principal... =");
				  print("= CHOIX ? : ");
				  int opt1 = sc.nextInt();
				  switch(opt1) {
				  	
				  	case 1:
				  		print("== SE CONNECTER == ");
				  		
				  		print("= Login : ");
				  		sc.next();

				  		print("= Mot de passe : ");

				  		sc.next();
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
