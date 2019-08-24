package QuanLyCanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	public static CanBo canBo = null;
	public static ArrayList list = new ArrayList();
	public static void main(String[] args) {
		boolean flag = true;
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Nhap danh sach can bo");
			System.out.println("2. Tim kiem can bo theo ten");
			System.out.println("3. In danh sach can bo");
			System.out.println("4. Thoat chuong trinh");
			System.out.println("==============");
			
			Scanner lc = new Scanner(System.in);
			System.out.print(" Nhap lua chon cua ban: ");
			int n = lc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("1. Nhap danh sach can bo");
				nhapThongTin();
				break;
			case 2:
				System.out.println("2. Tim kiem can bo theo ten");
				timKiem();
				break;
			case 3:
				System.out.println("3. In danh sach can bo");
				danhSach();
				break;
			case 4:
				System.out.println("4. Thoat chuong trinh");
				flag = false;
			
			}
		} while (flag == true);
	}
	
	public static void nhapThongTin() {
		Scanner so = new Scanner(System.in);
		Scanner nN = new Scanner(System.in);
		Scanner nt = new Scanner(System.in);

		do {
			System.out.print(" Nhap nghe ngiep(CN,KS,NV): ");
			String ngheNghiep = nN.nextLine();
			
			if (ngheNghiep.equals("CN")) {
				System.out.print(" Nhap so cong nhan: ");
				int s = so.nextInt();
				for (int i = 0; i < s; i++) {
					System.out.println(" Thong tin cong nhan thu " + (i+1) + " la: ");
					canBo = new CongNhan();
					canBo.nhap();
					list.add(canBo);
				}
			} 
			else if (ngheNghiep.equals("KS")) {
				System.out.print(" Nhap so ky su: ");
				int s = so.nextInt();
				for (int i = 0; i < s; i++) {
					System.out.println(" Thong tin ky su thu " + (i+1) + " la: ");
					canBo = new KySu();
					canBo.nhap();
					list.add(canBo);
				}
			}
			else if (ngheNghiep.equals("NV")) {
				System.out.print(" Nhap so nhan vien: ");
				int s = so.nextInt();
				for (int i = 0; i < s; i++) {
					System.out.println(" Thong tin nhan vien thu " + (i+1) + " la: ");
					canBo = new NhanVien();
					canBo.nhap();
					list.add(canBo);
				}
			}
			else {
				System.out.println(" Ban da nhap sai !");
			}
			System.out.print(" Nhap them (y/n) : ");
			if(nt.nextLine().equals("n")) {
				break;
			}
		} while (true);
		
	}
	
	public static void timKiem() {
		Scanner tk = new Scanner(System.in);
		if (list.size() == 0) {
			System.out.println(" Chua tao thong tin");
		} else {
		System.out.print(" Nhap ten can tim: ");
		String tenTK = tk.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if(tenTK.equals(((CanBo) list.get(i)).getHoTen())) {
				((CanBo) list.get(i)).in();
				System.out.println("--------------------");
			}
		}
		}
	}
	
	public static void danhSach() {
		if (list.size() == 0) {
			System.out.println(" Chua tao thong tin");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(" Thong tin can bo thu " + (i+1) + " :");
				((CanBo) list.get(i)).in();
				System.out.println("--------------------");
			}
		}
		
	}
}
