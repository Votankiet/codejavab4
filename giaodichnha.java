package bai1;

import java.time.LocalDate;
public class giaodichnha extends giaodich{
        private double dienTich;
        private String loaiNha;
        private String diaChi;
    
        public giaodichnha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
            super(maGiaoDich, ngayGiaoDich, donGia);
            this.dienTich = dienTich;
            this.loaiNha = loaiNha;
            this.diaChi = diaChi;
        }
        public double getdienTich() {
            return dienTich;
        }
    
        public void setdienTich(double dienTich) {
            this.dienTich = dienTich;
        }
    
        public String getloaiNha() {
            return loaiNha;
        }
    
        public void setloaiNha(String loaiNha) {
            this.loaiNha = loaiNha;
        }
           
        public String getdiachi() {
            return diaChi;
        }
    
        public void setdiachi(String diachi) {
            this.diaChi = diachi;
        }
        
        @Override
        public double tinhThanhTien() {
            if (loaiNha.equals("cao cấp")) {
                return dienTich * donGia;
            } else {
                return dienTich * donGia * 0.9;
            }
        }
        @Override
        public String toString() {
            return super.toString() + ", Diện tích: " + dienTich + ", Loại nhà: " + loaiNha + ", Địa chỉ: " + diaChi;
        }
    }

