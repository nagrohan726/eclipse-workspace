package anonymousinner;

public class DriverManager {

	static Connection getConnection() {
		Connection con = new Connection() {

			@Override
			public void createStatement() {

				System.out.println("Anonymous Inner Class's createStatement()");

			}

		};

		return con;
	}
}
