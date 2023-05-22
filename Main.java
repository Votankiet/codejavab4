package bai1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<giaodich> danhSachGiaoDich = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            System.out.println("----- QUẢN LÝ GIAO DỊCH -----");
            System.out.println("1. Nhập thông tin giao dịch đất");
            System.out.println("2. Nhập thông tin giao dịch nhà");
            System.out.println("3. Hiển thị thông tin tất cả giao dịch");
            System.out.println("4. Hiển thị tổng số lượng giao dịch đất");
            System.out.println("5. Hiển thị trung bình thành tiền của giao dịch đất");
            System.out.println("6. Hiển thị giao dịch tháng 9 năm 2013");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    nhapGiaoDichDat(scanner, danhSachGiaoDich);
                    break;
                case 2:
                    nhapGiaoDichNha(scanner, danhSachGiaoDich);
                    break;
                case 3:
                    hienThiThongTinGiaoDich(danhSachGiaoDich);
                    break;
                case 4:
                    hienThiTongSoLuongGiaoDichDat(danhSachGiaoDich);
                    break;
                case 5:
                    hienThiTrungBinhThanhTienGiaoDichDat(danhSachGiaoDich);
                    break;
                case 6:
                    hienThiGiaoDichThang9Nam2013(danhSachGiaoDich);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println();
        } while (luaChon != 0);
    }

    private static void nhapGiaoDichDat(Scanner scanner, List<giaodich> danhSachGiaoDich) {
        System.out.println("----- NHẬP THÔNG TIN GIAO DỊCH ĐẤT -----");
        System.out.print("Nhập mã giao dịch: ");
        String maGiaoDich = scanner.nextLine();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        String ngayGiaoDichStr = scanner.nextLine();
        LocalDate ngayGiaoDich = LocalDate.parse(ngayGiaoDichStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập diện tích: ");
        double dienTich = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nhập loại đất (A, B, C): ");
        String loaiDat = scanner.nextLine();

        giaodichdat giaoDichDat = new giaodichdat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
        danhSachGiaoDich.add(giaoDichDat);

        System.out.println("Giao dịch đất đã được thêm thành công.");
    }

    private static void nhapGiaoDichNha(Scanner scanner, List<giaodich> danhSachGiaoDich) {
        System.out.println("----- NHẬP THÔNG TIN GIAO DỊCH NHÀ -----");
        System.out.print("Nhập mã giao dịch: ");
        String maGiaoDich = scanner.nextLine();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        String ngayGiaoDichStr = scanner.nextLine();
        LocalDate ngayGiaoDich = LocalDate.parse(ngayGiaoDichStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập diện tích: ");
        double dienTich = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập loại nhà (cao cấp, thường): ");
        String loaiNha = scanner.nextLine();

        giaodichnha giaoDichNha = new giaodichnha(maGiaoDich, ngayGiaoDich, donGia, dienTich, diaChi, loaiNha);
        danhSachGiaoDich.add(giaoDichNha);

        System.out.println("Giao dịch nhà đã được thêm thành công.");
    }

    private static void hienThiThongTinGiaoDich(List<giaodich> danhSachGiaoDich) {
        System.out.println("----- HIỂN THỊ THÔNG TIN GIAO DỊCH -----");
        for (giaodich giaoDich : danhSachGiaoDich) {
            System.out.println(giaoDich.toString());
        }
    }

    private static void hienThiTongSoLuongGiaoDichDat(List<giaodich> danhSachGiaoDich) {
        int count = 0;
        for (giaodich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof giaodichdat) {
                count++;
            }
        }
        System.out.println("Tổng số lượng giao dịch đất: " + count);
    }

    private static void hienThiTrungBinhThanhTienGiaoDichDat(List<giaodich> danhSachGiaoDich) {
        double tongThanhTien = 0;
        int count = 0;
        for (giaodich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof giaodichdat) {
                tongThanhTien += giaoDich.tinhThanhTien();
                count++;
            }
        }
        double trungBinhThanhTien = count > 0 ? tongThanhTien / count : 0;
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTien);
    }

    private static void hienThiGiaoDichThang9Nam2013(List<giaodich> danhSachGiaoDich) {
        System.out.println("----- HIỂN THỊ GIAO DỊCH THÁNG 9 NĂM 2013 -----");
        for (giaodich giaoDich : danhSachGiaoDich) {
            LocalDate ngayGiaoDich = giaoDich.getNgayGiaoDich();
            if (ngayGiaoDich.getMonthValue() == 9 && ngayGiaoDich.getYear() == 2013) {
                System.out.println(giaoDich.toString());
            }
        }
    }
}

