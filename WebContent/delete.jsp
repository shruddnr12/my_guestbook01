<%@page import="java.util.List"%>
<%@page import="com.jx372.guestbook.vo.GuestbookVo"%>
<%@page import="com.jx372.guestbook.dao.GuestbookDao"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String no = request.getParameter("no");
	String passwd = request.getParameter("password");
	
	GuestbookVo vo = new GuestbookVo();
	vo.setNo(Long.parseLong(no));
	vo.setPasswd(passwd);

	new GuestbookDao().delete(vo);
	response.sendRedirect("/guestbook01");
	
%>