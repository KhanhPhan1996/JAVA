package QuanLyCanBo;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private String bac;
	
	
	public CongNhan() {
		super();
	}

	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}
	@Override
	public void nhap() {
		System.out.println("--Cong nhan--");
		super.nhap();
		Scanner b = new Scanner(System.in);
		System.out.print(" Nhap bac: ");
		this.bac = b.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Nganh nghe: Cong nhan");
		super.in();
		System.out.println(" Bac: " + getBac());
	}
}
