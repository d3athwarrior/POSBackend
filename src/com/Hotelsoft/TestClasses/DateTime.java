package com.Hotelsoft.TestClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.Hotelsoft.DatabaseConnection.ConnectionManager;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;


public class DateTime extends ConnectionManager {

	public static void main(String[] args) {
		try{
		// TODO Auto-generated method stub
		LocalDate dt = new LocalDate();
	    LocalTime tm = new LocalTime();
	    DateTimeFormatter frm = DateTimeFormat.forPattern("HH:mm:ss");
	    
	    System.out.println(dt + new java.sql.Date(dt.toDate().getTime()).toString());
	    System.out.println(frm.print(tm)+new java.sql.Time(tm.toDateTimeToday().getMillis()));
	    ConnectionManager c = new ConnectionManager();
	    c.connection=c.getConnection();
	    Statement st = (Statement) c.connection.createStatement();
		ResultSetImpl rs = (ResultSetImpl) st.executeQuery("select kotno from kot where auditdate<'"+dt + "'& kottime<"+"'"+frm.print(tm)+"'");
		/*while(rs.next()){
			
			System.out.println(rs.getString("kotno"));
		}*/
		rs.afterLast();
		rs.previous();
		System.out.println(rs.getString("kotno"));
		String kotno=rs.getString("kotno");
		String [] temp = kotno.split("-");
		int kotnumber=Integer.parseInt(temp[1]);
		kotnumber+=1;
		kotno=temp[0]+"-"+kotnumber;
		System.out.println(kotno);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    
	}

}
