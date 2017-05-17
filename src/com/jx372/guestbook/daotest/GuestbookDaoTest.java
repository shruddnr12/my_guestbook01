package com.jx372.guestbook.daotest;

import java.util.List;


import com.jx372.guestbook.dao.GuestbookDao;
import com.jx372.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		//insertTest();
		getListTest();
		//DeleteTest();
		//DeleteTest()2;  //위와 차이점은?
	}

	public static void insertTest(){
		GuestbookVo vo = new GuestbookVo();
		vo.setName("노경욱");
		vo.setPasswd("1234");
		vo.setMessage("이제 추가하나 됨");
		
		GuestbookDao dao = new GuestbookDao();
		dao.insert(vo);
	}
	public static void getListTest(){
		GuestbookDao dao = new GuestbookDao();
		List<GuestbookVo> list = dao.getList();
		
		for(GuestbookVo vo: list){
			System.out.println(vo);
		}
	}
	
	public static void DeleteTest2(){
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(1L);
		vo.setPasswd("1234");
		
		GuestbookDao dao = new GuestbookDao();
		dao.delete(vo);
	}
	public static void DeleteTest(){
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(1L);
		vo.setPasswd("1234");
		
		GuestbookDao dao = new GuestbookDao();
		dao.delete(vo.getNo(),vo.getPasswd());
	}
}
