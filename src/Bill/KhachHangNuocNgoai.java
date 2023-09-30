package Bill;

public class KhachHangNuocNgoai extends KhachHang {
private String QuocTich;
public KhachHangNuocNgoai () {
}
public KhachHangNuocNgoai(String QuocTich, int MaKH, int SoLuong, double DonGia, double ThanhTien, String HoTenKH, String NgayRHD ) {

super (MaKH, SoLuong, DonGia, ThanhTien, HoTenKH, NgayRHD);
this.QuocTich = QuocTich;
}
public String getQuocTich () {
	return QuocTich;
}
public void setQuocTich (String QuocTich) {
	this.QuocTich = QuocTich;
}

public void nhap()
{
	super.nhap();
	System.out.println("Nhap Quoc Tich: ");
	QuocTich = sc.nextLine();
}
public double TTien ()
{
	return this.SoLuong*this.DonGia;
}
@Override
public String toString() {
	return "KhachHangNuocNgoai { " + super.toString() + "QuocTich=" + QuocTich + '}' ;
}
}
