package test;

import dao.SachDAO;
import model.Sach;

public class TestSachDAO {
	public static void main(String[] args) {
		Sach sach1 = new Sach("LTC", "Lập trình C", 50000, 1995);
		Sach sach2 = new Sach("LTJV", "Lập trình JV", 70000, 1998);
		
		SachDAO.getInstance().insert(sach2);
	}
}
