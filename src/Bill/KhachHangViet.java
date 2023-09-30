package Bill;

public class KhachHangViet extends KhachHang{
private int LoaiKH,DinhMuc;

public KhachHangViet () {
}
public KhachHangViet (int LoaiKH, int DinhMuc,  int MaKH, int SoLuong, double DonGia, double ThanhTien, String HoTenKH, String NgayRHD) {
	super (MaKH, SoLuong, DonGia, ThanhTien, HoTenKH, NgayRHD);
	this.LoaiKH = LoaiKH;
	this.DinhMuc = DinhMuc;
}
public int getLoaiKH () {
	return LoaiKH;
}
public void setLoaiKH (int LoaiKH) {
	this.LoaiKH = LoaiKH;
}
public int getDinhMuc () {
	return DinhMuc;
}
public void setDinhMuc (int DinhMuc) {
	this.DinhMuc = DinhMuc;
}
public void nhap()
{
	super.nhap();
	System.out.println("Loai Khach Hang (1.Sinh Hoat , 2.Kinh Doanh , 3.San Xuat )");
	LoaiKH = sc.nextInt();
	System.out.println("Dinh Muc: ");
	DinhMuc = sc.nextInt();
}
public double TTien () {
	if (SoLuong <= DinhMuc)
	{
		return this.DonGia*this.SoLuong;
	}
	else {
		return this.DinhMuc*this.DonGia+(this.SoLuong-this.DinhMuc)*this.DonGia*2.5 ;
		
	}
}
@Override
public String toString() {
	String temp;
	if (LoaiKH == 1) {
		temp = "Sinh Hoat";
	}
	else if (LoaiKH == 2) {
		temp = "Kinh Doanh";
	}
	else {
		temp = "San Xuat";
	}
	return "KhachHangViet { " + super.toString() + "LoaiKH=" + temp + "DinhMuc=" + DinhMuc +'}';
}
}
