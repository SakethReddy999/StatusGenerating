package com.capgemini.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import com.capgemini.bean.TicketBean;
	public class TicketDAO {
	public int addTicket1(TicketBean ticketBean)
	{
		Connection con=null;
		PreparedStatement pst=null;
		try{
			con=TicketDB.getConnection1();
			pst=con.prepareStatement("insert into Ticket values(?,?,?,?,?)");
			pst.setInt(1, ticketBean.getTicketid());
			pst.setInt(2, ticketBean.getNoOfSeats());
			pst.setString(3,ticketBean.getSeatName());
			pst.setString(4,ticketBean.getTicketStatus());
			pst.setString(5, ticketBean.getScreenName());
			int updateCount=pst.executeUpdate();
			return updateCount;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
