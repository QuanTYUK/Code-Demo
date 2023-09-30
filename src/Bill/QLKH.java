package Bill;

import java.util.Scanner;

public class QLKH {

	public static void main(String[] args) {
	KhachHangList listKH = new KhachHangList();
	Scanner sc = new Scanner (System.in);
	int x;
	do {
		System.out.println("1.Them khach hang Viet: ");
		System.out.println("2.Them khach hang nuoc ngoai: ");
		System.out.println("3.Hien thi danh sach khach hang: ");
		System.out.println("4.Xem tong (KW) cua khach hang: ");
		System.out.println("5.Xem trung binh thanh tien cua khach hang nuoc ngoai: ");
		System.out.println("6.Xem danh sach khach hang trong thang 9/2023: ");
		x=sc.nextInt();
		switch (x) {
		case 1:
			listKH.ThemKH(1);
			break;
		case 2: 
			listKH.ThemKH(2);
		break;
		case 3:
			listKH.HienThi();
			break;
		case 4:
			listKH.TongSL();
			break;
		case 5:
			listKH.TrungBinh();
			break;
		case 6:
			listKH.checkDate();
			break;
		}
	}while (x != 0);

	}

}
