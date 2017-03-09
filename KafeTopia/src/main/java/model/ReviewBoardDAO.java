package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.dto.ReviewBoard;

public class ReviewBoardDAO {
	//게시물 등록
	public static boolean writeContent(ReviewBoard vo){
		Connection con = null;	
		PreparedStatement pstmt = null;
		boolean result = false;
		try {
			con = DBUtil.getConnection();
			// seq, author, cafeid, title, content, img
			//날짜가 없어...
			pstmt = con.prepareStatement("INSERT INTO ReviewBoard(author, cafeid, title, content, count, likecount, img, date) "
					+ "																				VALUES(?, ?, ?, ?, 0, 0, ?, now())");
	        pstmt.setString(1, vo.getAuthor());
	        pstmt.setString(2, vo.getCafeid());
	        pstmt.setString(3, vo.getTitle());
	        pstmt.setString(4, vo.getContent());
	        pstmt.setString(5, vo.getImg());
			int count = pstmt.executeUpdate();
			if(count != 0){
				result = true;
			}
		}finally{
			DBUtil.close(pstmt, con);
		}
		return result;		
	}
	
	// 게시물 조회 - boolean flag 값 = read인 경우 true, update인 경우  false
		public static ReviewBoard getContent(int  seq, boolean flag) throws SQLException{		
			Connection con = null;	
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ReviewBoard vo  = null;
			
			String sql1="UPDATE ReviewBoard set count = count+1 WHERE seq=?";	
			//to_char(writeday,'yyyy/mm/dd hh24:mi:ss'), 
			String sql2="SELECT author,vafeid, title, content, count, likecount, img, date from ReviewBoard WHERE seq=?";

			try {
				con = DBUtil.getConnection();
				if(flag){
					pstmt = con.prepareStatement(sql1);
					pstmt.setInt(1, seq);
					int count = pstmt.executeUpdate();
					if(count == 0){
						return vo;
					}
				}
				pstmt = con.prepareStatement(sql2);
				pstmt.setInt(1, seq);	
				rset = pstmt.executeQuery();
				
				if(rset.next()){
					vo = new ReviewBoard(seq, rset.getString(1), rset.getString(2), rset.getString(3), 
							rset.getString(4).replaceAll("</n>","<br>"), rset.getInt(5), rset.getInt(6), 
							rset.getString(7), rset.getDate(8));
				}
			}finally{
				DBUtil.close(pstmt, con);
			}
			return vo;
		}
		//게시물 삭제
		/*public  static boolean deleteContent(int num, String password) throws SQLException{
			Connection con = null;	
			PreparedStatement pstmt = null;
			boolean result = false;		
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("DELETE FROM gbook WHERE num=? and password=?");
				pstmt.setInt(1,num);
		        pstmt.setString(2,password);
				int count = pstmt.executeUpdate();
				if(count != 0){
					result = true;
				}
			}finally{
				DBUtil.close(pstmt, con);
			}
			return result;
		}*/
		
		// 게시물 수정
		/*public  static boolean updateContent(GuestBookBean vo) throws SQLException{
			Connection con = null;	
			PreparedStatement pstmt = null;
			boolean result = false;
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("UPDATE gbook set title=?,author=?,email=?,content=? WHERE num=? AND password=?");
				pstmt.setString(1,vo.getTitle());
			    pstmt.setString(2,vo.getAuthor());
			    pstmt.setString(3, vo.getEmail());
			    pstmt.setString(4, vo.getContent());
			    pstmt.setInt(5, vo.getNum());
			    pstmt.setString(6, vo.getPassword());
				int count = pstmt.executeUpdate();
				if(count != 0){
					result = true;
				}
			}finally{
				DBUtil.close(pstmt, con);
			}
			return result;
		}*/
		
		// 모든 게시물 조회
		public  static ArrayList<ReviewBoard> getAllContents() throws SQLException{
			Connection con = null;	
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<ReviewBoard> alist = null;
			String sql="SELECT seq, author, cafeid, title, content, count, likecount, date" + "from ReviewBoard order by seq desc";	
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql);
				rset = pstmt.executeQuery();
				alist = new ArrayList<ReviewBoard>();
				while(rset.next()){
					alist.add(new ReviewBoard(rset.getInt(1),rset.getString(2), rset.getString(3),
							rset.getString(4),rset.getString(5),rset.getInt(6),
							rset.getInt(7),rset.getString(8), rset.getDate(9)));
				}
			}finally{
				DBUtil.close(rset, pstmt, con);
			}
			return alist;
		}
}
