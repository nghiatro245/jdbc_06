package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
	
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int insert(Sach t) {
		int ketQua =0;
		try {
			//Tao ket noi
			Connection con = JDBCUtil.getConnection();
			
			//Tao ra doi tuong statement
			Statement st = con.createStatement();
			
			//Thuc thi cau lenh sql
			String sql ="INSERT INTO sach (id, tenSach, giaBan, namXuatBan) "+
						"VALUES ('"+t.getId()+"', '"+t.getTenSach()+"', "+t.getGiaBan()+", "+t.getNamXuatBan()+")";
			System.out.println(sql);
			ketQua = st.executeUpdate(sql);
			
			//Xử lý kết quả
			System.out.println("Bạn đã thực thi: "+sql);
			System.out.println("Có "+ketQua+" dòng thay đổi");
			
			//ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
