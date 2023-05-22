package bai1;

import java.time.LocalDate;
public class giaodichdat extends giaodich{
        private double dienTich;
        private String loaiDat;
    
        public giaodichdat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
            super(maGiaoDich, ngayGiaoDich, donGia);
            this.dienTich = dienTich;
            this.loaiDat = loaiDat;
        }
        public double getdienTich() {
            return dienTich;
        }
    
        public void setdienTich(double dienTich) {
            this.dienTich = dienTich;
        }
    
        public String getloaiDat() {
            return loaiDat;
        }
    
        public void setloaiDat(String loaiDat) {
            this.loaiDat = loaiDat;
        }
    
        @Override
        public double tinhThanhTien() {
            if (loaiDat.equals("A")) {
                return dienTich * getDonGia() * 1.5;
            } else {
                return dienTich * getDonGia();
            }
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Diện tích: " + dienTich + ", Loại đất: " + loaiDat;
        }
}
    

