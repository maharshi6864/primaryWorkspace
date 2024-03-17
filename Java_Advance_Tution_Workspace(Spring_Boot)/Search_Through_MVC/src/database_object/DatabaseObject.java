package database_object;

import value_object.*;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.*;

import javax.websocket.Session;

import org.apache.catalina.connector.Request;

public class DatabaseObject {
		public void registerUser(ValueObject v){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
				Statement s=c.createStatement();
				s.executeUpdate("INSERT INTO register_28(firstname,lastname) VALUES	('"+v.getFirstname()+"','"+v.getLastname()+"')");
				s.close();
				c.close();
			}catch(Exception e){
				System.out.print(e);
			}
		}
		public ResultSet searchValue(ValueObject v){
			ResultSet data = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
				Statement s=c.createStatement();
				String search=v.getSearch() ;
				data = s.executeQuery("SELECT * FROM register_28 WHERE firstname like '" +search+"%'");
				System.out.print("Hello World");
				while (data.next()) {
					System.out.print(11);
					int id=data.getInt("id");
					String fnn = data.getString("firstname");
					String ln = data.getString("lastname");	
					System.out.print(fnn);
	}
				s.close();
				c.close();
				
				
			}catch(Exception e){
				System.out.print(e);
			}
			//System.out.print(data);
			return data;
		}
}
