<%@page import="com.jx372.guestbook.dao.GuestbookDao"%>
<%@page import="com.jx372.guestbook.vo.GuestbookVo"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String passwd = request.getParameter("pass");
	String message = request.getParameter("message");
	
	GuestbookVo vo = new GuestbookVo();
	vo.setName(name);
	vo.setPasswd(passwd);
	vo.setMessage(message);
	
	new GuestbookDao().insert(vo);
	response.sendRedirect("/guestbook01");
%>
