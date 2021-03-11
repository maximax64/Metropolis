package metropolis.entities;
public class User {
	
	private int idUser; 
	private String loginUser;
	private String passwordUser;
	private String isMembre;
	private String isEmploye;
	
	public User(int idUser, String loginUser, String passwordUser, String isMembre, String isEmploye) {
		super();
		this.idUser = idUser;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
		this.isMembre = isMembre;
		this.isEmploye = isEmploye;
	}

	public User() {
		
	}
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	
	public String getIsMembre() {
		return "Membre";
	}

	public void setIsMembre(String isMembre) {
		this.isMembre = isMembre;
	}

	public String getIsEmploye() {
		return "Employé";
	}

	public void setIsEmploye(String isEmploye) {
		this.isEmploye = isEmploye;
	}

	public void login(String loginUser, String passwordUser) {
		
		
	}
	
	public void consulterDocument(Document unDocument) {
		
		
	}
	
}
