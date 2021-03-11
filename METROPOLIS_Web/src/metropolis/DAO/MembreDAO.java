package metropolis.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metropolis.entities.Membre;

public class MembreDAO extends DataAccessJdbcImpl<Membre, Integer>{

	public MembreDAO(String driver, String url, String usr, String pwd) {
		super(driver, url, usr, pwd);
		
		
	}

	@Override
	public boolean create(Membre e) {
		 PreparedStatement statement; 
		 if(connect!=null) {
			 try {
				 statement=connect.prepareStatement("INSERT INTO CUSTOMER VALUES(?, ?, ?, ?, ?, ?)");
				 statement.setInt(1, e.getIdUser());
				 statement.setString(2, e.getLoginUser());
				 statement.setString(3, e.getPasswordUser());
				 statement.setString(4, e.getIsMembre());
				 statement.setString(5, e.getIsEmploye());
				 statement.setLong(6, e.getNbEmprunt());
				 statement.executeUpdate();
			 }
			 catch(SQLException se) {
			 		return false;
			 }
			 return true;
		}
		return false;
	}
		 	

	@Override
	public Membre selectByID(Integer idType) {
		
		return null;
	}

	@Override
	public boolean update(Membre entity) {
		
		return false;
	}

	@Override
	public boolean delete(Membre entity) {

		return false;
	}

}
