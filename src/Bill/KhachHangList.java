package Bill;

public class KhachHangList {
private KhachHang kh[] = new KhachHang[100];
private int CKH,sum1=0,sum2=0,dem=0,sumtien=0;
public KhachHangList() {
	CKH=0;
	for (int i = 0; i < 100; i++) {
		kh[i] = new KhachHang();
	}
}
public void ThemKH (int temp) {
	if (CKH > 100) {
		System.out.println("Bo nho day ");
	}
	else {
		if (temp == 1) {
			kh[CKH] = new KhachHangViet ();
			KhachHangViet khv = new KhachHangViet();
			khv.nhap();
			khv.ThanhTien=khv.TTien();
			kh[CKH]=khv;
			sum1+=khv.SoLuong;
		}
		else {
			kh[CKH] = new KhachHangNuocNgoai ();
			KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
			khnn.nhap();
			khnn.ThanhTien=khnn.TTien();
			kh[CKH]=khnn;
			sum2+=khnn.SoLuong;
			sumtien+=khnn.ThanhTien;
		}
		dem++;
		CKH++;
		
		
	}
}
public void HienThi() {
	for (int i = 0; i < CKH; i++) {
		System.out.println("So TT" + (i+1));
		System.out.println(kh[i].toString());
	}
}
public void TongSL () {
	System.out.println("Tong so luong (KW) dien cua khach hang VN : " + sum1);
	System.out.println("Tong so luong (KW) dien cua khach hang nuoc ngoai : " + sum2);
}
public void TrungBinh () {
	System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai : " + (sumtien/dem));
}
public void checkDate() {
	String Date = "9/2013", Date1;
	for (int i = 0; i < CKH; i++) {
	Date1=kh[i].getNgayRHD();
	String[] date1=Date.split("/");
	String[] date2=Date1.split("/");
	int month1=Integer.parseInt(date1[0]);
	int year1=Integer.parseInt(date1[1]);
	int month2=Integer.parseInt(date2[0]);
	int year2=Integer.parseInt(date2[1]);
	if (month1==month2&&year1==year2) {
		System.out.println(kh[i].toString());
	}
}
}
}

