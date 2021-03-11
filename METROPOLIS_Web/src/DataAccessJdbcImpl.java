	
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	public abstract class DataAccessJdbcImpl<T, K>
	{
	 protected Connection connect;
	 private String jdbcDriver;
	 private String databaseUrl;
	 private String databaseUser;
	 private String databasePwd;

	 public DataAccessJdbcImpl(String driver, String url, String usr,
	 String pwd)
	 {
	 this.jdbcDriver=driver;
	 this.databaseUrl=url;
	 this.databaseUser=usr;
	 this.databasePwd=pwd;
	 }

	 public boolean connection()
	 {
	 try
	 {
	 Class.forName(jdbcDriver);
	 connect=DriverManager.getConnection(databaseUrl,
	 databaseUser, databasePwd);
	 }
	 catch(Exception e)
	 {
	 return false;
	 }
	 return true;
	 }

	 public void deconnection()
	 {
	 if(connect!=null)
	 try
	 {
	 connect.close();

	 }
	 catch(Exception e){}
	 }

	 public abstract boolean create(T entity);

	 public abstract T selectByID(K idType);

	 public abstract boolean update(T entity);
	 public abstract boolean delete(T entity);
	 }

