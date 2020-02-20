package com.capgemini.service;

	import com.capgemini.bean.TicketBean;
	import com.capgemini.dao.TicketDAO;

	public class TicketService {
	public int addTicket(int ticketId,int noOfSeats,String screenName,String ticketStatus,String seatName)
	{
		
		TicketDAO ticketDAO=new TicketDAO();
		TicketBean ticketBean=new TicketBean();
		ticketBean.setTicketid(ticketId);
		ticketBean.setNoOfSeats(noOfSeats);
		ticketBean.setTicketStatus(ticketStatus);
		ticketBean.setScreenName(screenName);
		ticketBean.setSeatName(seatName);
		int updateResult=0;
		try{
		updateResult=ticketDAO.addTicket1(ticketBean);
		return updateResult;                                                                                                                       
		}
		catch(Exception e)
		{
			System.out.println("exception resolved");
		}
		return 0;
		}}


