package gh.atguigu1.connection;
/**
* @author guohao
* @version 2020年3月13日上午11:29:57
*/

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionTest{
	
	public static void main(String[] args) throws Exception {
		// 1 加载配置文件
		InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		
		pros.load(is);
		
		//2 读取配置信息
		String user = pros.getProperty("user");
		String passwd = pros.getProperty("password");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");
		
		// 3 加载驱动
		Class.forName(driverClass);
		
		// 4 获取链接
		Connection conn = DriverManager.getConnection(url,user,passwd);
		System.out.println(conn); // com.mysql.jdbc.JDBC4Connection@6433a2
	}
	
	
}
