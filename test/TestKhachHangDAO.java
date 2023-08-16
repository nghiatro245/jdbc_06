package test;

import dao.KhachHangDAO;
import database.JDBCUtil;
import model.KhachHang;

public class TestKhachHangDAO {
	public static void main(String[] args) {
		KhachHang khachHang1 = new KhachHang(1, "nitro", 95, "MK");
		KhachHang khachHang2 = new KhachHang(2, "kngan", 98, "cp");
		
		//KhachHangDAO.getInstance().insert(khachHang1);
		
		for (int i = 1; i < 10; i++) {
			KhachHang khachHang = new KhachHang(i+2, "kh "+i , 1995, "diachi "+i);
			KhachHangDAO.getInstance().insert(khachHang);
		}
		
		
	}
}
