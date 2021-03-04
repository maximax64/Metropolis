public class User {
	
	private int idUser; 
	private String loginUser;
	private String passwordUser;
	private boolean isMembre;
	private boolean isEmploye;
	
	public User(int idUser, String loginUser, String passwordUser, boolean isMembre, boolean isEmploye) {
		super();
		this.idUser = idUser;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
		this.isMembre = isMembre;
		this.isEmploye = isEmploye;
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
	public boolean isMembre() {
		return isMembre;
	}
	public void setMembre(boolean isMembre) {
		this.isMembre = isMembre;
	}
	public boolean isEmploye() {
		return isEmploye;
	}
	public void setEmploye(boolean isEmploye) {
		this.isEmploye = isEmploye;
	}
	
	public void login(String loginUser, String passwordUser) {
		
		
	}
	
	public void consulterDocument(Document unDocument) {
		
		
	}
	
}
