package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBConnection {
	
	/*
	 * 
	 * CONNECT TO THE DATABASE
	 */
	public  void connect()
	{
		 try {
	    	  // Carichiamo un driver di tipo 1 (bridge jdbc-odbc)
	        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	        Class.forName(driver);
	        // Creiamo la stringa di connessione
	        String url = "jdbc:odbc:myDataSource";
	        // Otteniamo una connessione con username e password
	       Connection con =  DriverManager.getConnection (url, "myUserName", "myPassword");
	       // Creiamo un oggetto Statement per poter interrogare il db
	       Statement cmd = con.createStatement ();
	       // Eseguiamo una query e immagazziniamone i risultati
	       // in un oggetto ResultSet
	       String qry = "SELECT * FROM myTable";
	       ResultSet res = cmd.executeQuery(qry);
	       // Stampiamone i risultati riga per riga
	       while (res.next()) {
	       System.out.println(res.getString("columnName1"));
	       System.out.println(res.getString("columnName2"));
	     }
	     res.close();
	     cmd.close();
	     con.close();
	   } catch (SQLException e) {
	        e.printStackTrace();
	           } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	      }
		 
	}

 }

