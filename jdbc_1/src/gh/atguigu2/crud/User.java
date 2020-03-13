package gh.atguigu2.crud;

/**
 * @author guohao
 * @version 2020年3月13日下午2:54:37
 */
public class User {

	private String user;
	private String password;

	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public User() {
		
	}
}
