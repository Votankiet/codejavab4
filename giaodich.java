package bai1;

import java.time.LocalDate;
    public class giaodich {
  
     protected String maGiaoDich;
     protected LocalDate ngayGiaoDich;
     protected double donGia;

    public giaodich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String toString() {
        return "Mã giao dịch: " + maGiaoDich + ", Ngày giao dịch: " + ngayGiaoDich + ", Đơn giá: " + donGia;
    }
}


