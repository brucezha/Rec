package db;

public class MySQLUtil {
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "yelprec";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME + "?user=" + USERNAME
			+ "&password=" + PASSWORD + "&autoreconnect=true&serverTimezone=UTC";
}
