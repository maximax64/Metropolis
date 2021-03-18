public class User {
	
	private int idUser; 
	private String loginUser;
	private String passwordUser;
	private String profil;

	
	public User(int idUser, String loginUser, String passwordUser, String profil) {
		super();
		this.idUser = idUser;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
		this.profil = profil;
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
	
	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public void login(String loginUser, String passwordUser) {
		
		
	}
	
	public void consulterDocument(Document unDocument) {
		
		
	}
	
}
