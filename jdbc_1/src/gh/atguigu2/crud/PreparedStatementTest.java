package gh.atguigu2.crud;

import java.util.Scanner;

import org.junit.Test;

/**
* @author guohao
* @version 2020年3月13日下午5:16:20
*/
public class PreparedStatementTest {

	@Test
	public void testLogin() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入用户名：");
		String user = scan.nextLine();
		System.out.print("请输入密码：");
		String password = scan.nextLine();
		
		String sql = "SELECT user,password FROM user_table WHERE user = ? and password = ?";
		User returenUser = getInstance(User.class, sql, user, password);
		
		
	}

	private <T>T getInstance(Class<T> class1, String sql, Object... args) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
