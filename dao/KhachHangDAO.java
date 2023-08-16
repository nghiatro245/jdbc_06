package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang>{
	
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}
	
	@Override
	public int insert(KhachHang t) {
		int ketQua = 0;
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			Statement st = con.createStatement();
			
			String sql ="INSERT INTO khachhang (id, hoVaTen, namSinh, diaChi) VALUES ("+
						t.getId()+", '"+t.getHoVaTen()+"', "+t.getNamSinh()+", '"+t.getDiaChi()+"');";
			
			System.out.println(sql);
			ketQua =st.executeUpdate(sql);
			
			System.out.println("Ban da thuc hien: "+sql);
			System.out.println("Co "+ketQua+" dong thay doi");
			
			JDBCUtil.closeConnection(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
