package model;

import java.sql.Date;

public class KhachHang {
	private int id;
	private String hoVaTen;
	private int namSinh;
	private String diaChi;
	
	public KhachHang(int id, String hoVaTen, int namSinh, String diaChi) {
		super();
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
