package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@18.208.119.28:1521:XE";
		String username = "hr";
		String password = "hr";

		Connection conn = DriverManager.getConnection(url, username, password);

		Statement stm = conn.createStatement();

		String query = "select * from employees";

		ResultSet rs = stm.executeQuery(query);
		
//		System.out.println(rs);

	int counter = 0;

		while (rs.next() == true) {
//			System.out.println("Country name is " + rs.getString("COUNTRY_NAME") + " Country code - "
//					+ rs.getString("COUNTRY_ID"));
			System.out.println(rs.getString("FIRST_NAME"));

			if (counter == 30)
				break;
			counter++;
		}

//	String REGION_ID = rs.getString("REGION_ID");
//	String COUNTRY_NAME = rs.getString("COUNTRY_NAME");
//	String COUNTRY_ID = rs.getString("COUNTRY_ID");
//	
//	System.out.println(REGION_ID);
//	System.out.println(COUNTRY_NAME);
//	System.out.println(COUNTRY_ID);

		rs.close();
		stm.close();
		conn.close();

	}
}