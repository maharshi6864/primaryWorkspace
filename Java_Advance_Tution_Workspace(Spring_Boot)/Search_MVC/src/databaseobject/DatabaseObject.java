package databaseobject;

import valueobject.*;

import java.sql.*;
import java.util.*;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

public class DatabaseObject {
	public ArrayList searchData(ValueObject v,String sd){
		ResultSet data=null;
//		String a=v.getSearch();
		ArrayList arr=new ArrayList();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
			Statement s=c.createStatement();
			if(sd.equals("search")){
				data=s.executeQuery("SELECT * FROM register_28 WHERE firstname LIKE '"+v.getSearch()+"%'");
				System.out.print("search");
			}if(sd.equals("edit")){
				data=s.executeQuery("SELECT * FROM register_28 WHERE id LIKE '"+v.getId()+"%'");
				System.out.print("edit");
			}
			
			while(data.next()){
//				Map mp=new HashMap();
				ValueObject v1=new ValueObject();
				int id=data.getInt("id");
				String fnn=data.getString("firstname");
				String ln=data.getString("lastname");
//				mp.put("id", id);
//				mp.put("firstname",fnn );
//				mp.put("lastname",ln);
				v1.setId(id);
				v1.setFirstname(fnn);
				v1.setLastname(ln);
				
				arr.add(v1);
			}
			
			
		}catch(Exception e){
			System.out.print(e);
		}
		return arr;
	}
	public void deleteUser(ValueObject v){
		String dele=v.getDelete();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("DELETE FROM register_28 WHERE id='"+dele+"'");
			s.close();
			
			
			
			
		}catch(Exception e){
			System.out.print(e);
		}
	}
	public void editUsername(ValueObject v){
		int id=v.getId();
		String newfn=v.getFirstname();
		String newln=v.getLastname();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("UPDATE register_28 SET firstname = '"+newfn+"', lastname = '"+newln+"' WHERE id='"+id+"';");
			s.close();
			
			
			
			
		}catch(Exception e){
			System.out.print(e);
		}
	}
}
