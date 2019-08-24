package QuanLyCanBo;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	@Override
	public void nhap() {
		System.out.println("--Nhan vien--");
		super.nhap();
		Scanner cv = new Scanner(System.in);
		System.out.print(" Nhap cong viec: ");
		this.congViec = cv.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Nganh nghe: Nhan vien");
		super.in();
		System.out.println(" Cong viec: " + getCongViec());
	}

}
