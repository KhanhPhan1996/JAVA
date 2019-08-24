package QuanLyCanBo;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private String diaChi;
	public CanBo() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}	
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void nhap() {
		Scanner ht = new Scanner(System.in);
		Scanner ns = new Scanner(System.in);
		Scanner dc = new Scanner(System.in);
		Scanner gt = new Scanner(System.in);

		System.out.print(" Nhap ho ten: ");
		this.hoTen = ht.nextLine();
		System.out.print(" Nhap nam sinh: ");
		this.namSinh = ns.nextInt();
		System.out.print(" Nhap dia chi: ");
		this.diaChi = dc.nextLine();
		System.out.print(" Nhap gioi tinh: ");
		this.gioiTinh = gt.nextLine();
	}
	public void in() {
		System.out.println(" Ho ten: " + getHoTen());
		System.out.println(" Nam sinh: " + getNamSinh());
		System.out.println(" Gioi tinh: " + getGioiTinh());
		System.out.println(" Dia Chi: " + getDiaChi());
	}
}
