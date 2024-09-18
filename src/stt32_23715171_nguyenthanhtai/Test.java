package stt32_23715171_nguyenthanhtai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLyPhongHoc qlPhongHoc = new QuanLyPhongHoc();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm phòng học theo mã phòng");
            System.out.println("3. Hiển thị toàn bộ danh sách phòng học");
            System.out.println("4. Hiển thị danh sách các phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách phòng học tăng dần theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách phòng học giảm dần theo diện tích");
            System.out.println("7. Sắp xếp danh sách phòng học tăng dần theo số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính theo mã phòng");
            System.out.println("9. Xóa phòng học theo mã phòng");
            System.out.println("10. Tính tổng số phòng học");
            System.out.println("11. Hiển thị danh sách phòng máy có 60 máy tính");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();  // Đọc bỏ dòng trống sau số nhập

            switch (choice) {
                case 1:
                    themPhongHoc(qlPhongHoc, sc);
                    break;
                case 2:
                    timPhongHoc(qlPhongHoc, sc);
                    break;
                case 3:
                    System.out.println("Danh sách phòng học:");
                    System.out.println(qlPhongHoc.toString());
                    break;
                case 4:
                    hienThiPhongHocDatChuan(qlPhongHoc);
                    break;
                case 5:
                    qlPhongHoc.sapXepTangDanTheoDayNha();
                    System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo dãy nhà.");
                    break;
                case 6:
                    qlPhongHoc.sapXepGiamDanTheoDienTich();
                    System.out.println("Danh sách phòng học đã được sắp xếp giảm dần theo diện tích.");
                    break;
                case 7:
                    qlPhongHoc.sapXepTangDanTheoSoBongDen();
                    System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo số bóng đèn.");
                    break;
                case 8:
                    capNhatSoMayTinh(qlPhongHoc, sc);
                    break;
                case 9:
                    xoaPhongHoc(qlPhongHoc, sc);
                    break;
                case 10:
                    System.out.println("Tổng số phòng học: " + qlPhongHoc.tongSoPhongHoc());
                    break;
                case 11:
                    hienThiDanhSachPhongMayCo60May(qlPhongHoc);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
        sc.close();
    }

    // Phương thức thêm phòng học
    public static void themPhongHoc(QuanLyPhongHoc qlPhongHoc, Scanner sc) {
        System.out.println("Chọn loại phòng học để thêm:");
        System.out.println("1. Phòng lý thuyết");
        System.out.println("2. Phòng máy tính");
        System.out.println("3. Phòng thí nghiệm");
        int loaiPhong = sc.nextInt();
        sc.nextLine();  // Đọc bỏ dòng trống sau số nhập

        System.out.print("Nhập mã phòng: ");
        String maPhong = sc.nextLine();
        System.out.print("Nhập dãy nhà: ");
        String dayNha = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        double dienTich = sc.nextDouble();
        System.out.print("Nhập số bóng đèn: ");
        int soBongDen = sc.nextInt();

        switch (loaiPhong) {
            case 1: // Phòng lý thuyết
                System.out.print("Phòng có máy chiếu không (true/false): ");
                boolean coMayChieu = sc.nextBoolean();
                PhongLyThuyet phongLyThuyet = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                if (qlPhongHoc.themPhongHoc(phongLyThuyet)) {
                    System.out.println("Thêm phòng lý thuyết thành công.");
                } else {
                    System.out.println("Thêm phòng không thành công (trùng mã phòng).");
                }
                break;
            case 2: // Phòng máy tính
                System.out.print("Nhập số máy tính: ");
                int soMayTinh = sc.nextInt();
                PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                if (qlPhongHoc.themPhongHoc(phongMayTinh)) {
                    System.out.println("Thêm phòng máy tính thành công.");
                } else {
                    System.out.println("Thêm phòng không thành công (trùng mã phòng).");
                }
                break;
            case 3: // Phòng thí nghiệm
                sc.nextLine(); // Đọc bỏ dòng trống sau số nhập
                System.out.print("Nhập chuyên ngành: ");
                String chuyenNganh = sc.nextLine();
                System.out.print("Nhập sức chứa: ");
                int sucChua = sc.nextInt();
                System.out.print("Phòng có bồn rửa không (true/false): ");
                boolean coBonRua = sc.nextBoolean();
                PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
                if (qlPhongHoc.themPhongHoc(phongThiNghiem)) {
                    System.out.println("Thêm phòng thí nghiệm thành công.");
                } else {
                    System.out.println("Thêm phòng không thành công (trùng mã phòng).");
                }
                break;
            default:
                System.out.println("Loại phòng không hợp lệ.");
        }
    }

    // Phương thức tìm phòng học theo mã phòng
    public static void timPhongHoc(QuanLyPhongHoc qlPhongHoc, Scanner sc) {
        System.out.print("Nhập mã phòng cần tìm: ");
        String maPhong = sc.nextLine();
        PhongHoc phong = qlPhongHoc.timPhongHoc(maPhong);
        if (phong != null) {
            System.out.println("Thông tin phòng học: " + phong.toString());
        } else {
            System.out.println("Không tìm thấy phòng học với mã: " + maPhong);
        }
    }

    // Phương thức hiển thị danh sách phòng học đạt chuẩn
    public static void hienThiPhongHocDatChuan(QuanLyPhongHoc qlPhongHoc) {
        System.out.println("Danh sách phòng học đạt chuẩn:");
        for (PhongHoc phong : qlPhongHoc.danhSachDatChuan()) {
            System.out.println(phong.toString());
        }
    }

    // Phương thức cập nhật số máy tính cho phòng máy tính
    public static void capNhatSoMayTinh(QuanLyPhongHoc qlPhongHoc, Scanner sc) {
        System.out.print("Nhập mã phòng máy tính cần cập nhật: ");
        String maPhong = sc.nextLine();
        System.out.print("Nhập số máy tính mới: ");
        int soMayTinhMoi = sc.nextInt();
        if (qlPhongHoc.capNhatSoMayTinh(maPhong, soMayTinhMoi)) {
            System.out.println("Cập nhật số máy tính thành công.");
        } else {
            System.out.println("Không tìm thấy phòng máy tính với mã: " + maPhong);
        }
    }

    // Phương thức xóa phòng học
    public static void xoaPhongHoc(QuanLyPhongHoc qlPhongHoc, Scanner sc) {
        System.out.print("Nhập mã phòng cần xóa: ");
        String maPhong = sc.nextLine();
        System.out.print("Bạn có chắc chắn muốn xóa phòng này không? (yes/no): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            if (qlPhongHoc.xoaPhongHoc(maPhong)) {
                System.out.println("Xóa phòng học thành công.");
            } else {
                System.out.println("Không tìm thấy phòng học với mã: " + maPhong);
            }
        } else {
            System.out.println("Đã hủy xóa phòng.");
        }
    }

    // Phương thức hiển thị danh sách phòng máy có 60 máy tính
    public static void hienThiDanhSachPhongMayCo60May(QuanLyPhongHoc qlPhongHoc) {
        System.out.println("Danh sách phòng máy có 60 máy tính:");
        for (PhongMayTinh phongMay : qlPhongHoc.danhSachPhongMayCo60May()) {
            System.out.println(phongMay.toString());
        }
    }
}