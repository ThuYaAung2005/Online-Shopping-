//package helper;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBHelper {
//	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private final String URL="jdbc:mysql://localhost:3306/72api";
//	private final String USERNAME="root";
//	private final String PASSWORD="root";
//	private static Connection con;
//	private static DBHelper instance;
//	
//	public DBHelper(){
//		try {
//			Class.forName(DRIVER);
//			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
//			if(con !=null) {
//				System.out.println("connection Success!");
//			}
//				
//		} catch (SQLException | ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("Can't connect");
//		}
//	}
//	public static DBHelper getinstance() {
//		if(instance==null) {
//			instance=new DBHelper();
//		}
//		return instance;
//	}
//	
//	public static Connection getConnection() {
//		return con;
//}
//	
//	
//}
