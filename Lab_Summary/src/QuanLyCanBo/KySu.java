package QuanLyCanBo;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public KySu() {
		super();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	@Override
	public void nhap() {
		System.out.println("--Ky su--");
		super.nhap();
		Scanner ng = new Scanner(System.in);
		System.out.print(" Nhap nganh dao tao: ");
		this.nganhDaoTao = ng.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Nganh nghe: Ky su");
		super.in();
		System.out.println(" Nganh dao tao: " + getNganhDaoTao());
	}
	
}
