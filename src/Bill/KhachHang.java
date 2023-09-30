package Bill;

import java.util.Scanner;

public class KhachHang {
	
 protected int MaKH,SoLuong;
 protected double DonGia,ThanhTien;
 protected String HoTenKH,NgayRHD;
   Scanner sc = new Scanner (System.in);
	
   public KhachHang() {
   }
   public KhachHang (int MaKH, int SoLuong, double DonGia, double ThanhTien, String HoTenKH, String NgayRHD ) {
	   this.MaKH = MaKH;
	   this.SoLuong = SoLuong;
	   this.DonGia = DonGia;
	   this.ThanhTien = ThanhTien;
	   this.HoTenKH = HoTenKH;
	   this.NgayRHD = NgayRHD;
   }
 public int getMaKH () {
	 return MaKH;
 }
 public void setMaKH (int MaKH) {
	 this.MaKH = MaKH;
 }
 public int getSoLuong () {
	 return SoLuong;
 }
 public void setSoLuong (int SoLuong) {
	 this.SoLuong = SoLuong;
 }
 public double getDonGia () {
	 return DonGia;
 }
 public void setDonGia (double DonGia ) {
	 this.DonGia = DonGia;
 }
 public double getThanhTien () {
	 return ThanhTien;
 }
 public void setThanhTien (double ThanhTien) {
	 this.ThanhTien = ThanhTien;
 }
 public String getHoTenKH () {	
	 return HoTenKH;
			 }
 public void setHoTenKH (String HoTenKH) {
	 this.HoTenKH = HoTenKH;
 }
 public String getNgayRHD () {
	 return NgayRHD;
 }
 public void setNgayRHD (String NgayRHD) {
	 this.NgayRHD = NgayRHD;
 }
 
 public void nhap ()
 {
	 System.out.println("Nhap Ma Khach Hang: ");
	 MaKH = sc.nextInt ();
	 System.out.println("Nhap ho va ten khach hang: ");
	 HoTenKH = sc.nextLine();
	 System.out.println("Nhap ngay ra hoa don: ");
	 NgayRHD = sc.nextLine();
	 System.out.println("Nhap so luong (KW): ");
	 SoLuong = sc.nextInt();
	 System.out.println("Don Gia: ");
	 DonGia = sc.nextDouble();
	 System.out.println("Thanh Tien: ");
	 ThanhTien = sc.nextDouble();
 }
 @Override
 public String toString () {
	 return "MaKH=" + MaKH + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", ThanhTien=" + ThanhTien + ", NgayRHD=" + NgayRHD + ", HoTenKH=" + HoTenKH ;
 }
 }


