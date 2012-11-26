package in.bluepi.pirecruit.user;

/**
 * @author Amin
 * @version 1.0
 * @created 21-Nov-2012 12:49:12 PM
 */
public class User {

	private String loginName;
	private String password;

	public User(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param user
	 */
	public boolean login(User user){
		return false;
	}

	/**
	 * 
	 * @param user
	 */
	public boolean newRegistration(User user){
		return false;
	}
}//end User