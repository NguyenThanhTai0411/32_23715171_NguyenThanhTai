package stt32_23715171_nguyenthanhtai;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc() {
        this.danhSachPhongHoc = new ArrayList<>();
    }

    public boolean themPhongHoc(PhongHoc phong) {
        for (PhongHoc ph : danhSachPhongHoc) {
            if (ph.getMaPhong().equals(phong.getMaPhong())) {
                return false;  // Trùng mã phòng
            }
        }
        danhSachPhongHoc.add(phong);
        return true;
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc phong : danhSachPhongHoc) {
            if (phong.getMaPhong().equals(maPhong)) {
                return phong;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PhongHoc phong : danhSachPhongHoc) {
            sb.append(phong.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<PhongHoc> danhSachDatChuan() {
        List<PhongHoc> dsDatChuan = new ArrayList<>();
        for (PhongHoc phong : danhSachPhongHoc) {
            if (phong.datChuan()) {
                dsDatChuan.add(phong);
            }
        }
        return dsDatChuan;
    }

    public void sapXepTangDanTheoDayNha() {
        danhSachPhongHoc.sort((p1, p2) -> p1.getDayNha().compareTo(p2.getDayNha()));
    }

    public void sapXepGiamDanTheoDienTich() {
        danhSachPhongHoc.sort((p1, p2) -> Double.compare(p2.getDienTich(), p1.getDienTich()));
    }

    public void sapXepTangDanTheoSoBongDen() {
        danhSachPhongHoc.sort((p1, p2) -> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        PhongHoc phong = timPhongHoc(maPhong);
        if (phong instanceof PhongMayTinh) {
            ((PhongMayTinh) phong).setSoMayTinh(soMayTinhMoi);
            return true;
        }
        return false;
    }

    public boolean xoaPhongHoc(String maPhong) {
        PhongHoc phong = timPhongHoc(maPhong);
        if (phong != null) {
            danhSachPhongHoc.remove(phong);
            return true;
        }
        return false;
    }

    public int tongSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public List<PhongMayTinh> danhSachPhongMayCo60May() {
        List<PhongMayTinh> dsPhongMay = new ArrayList<>();
        for (PhongHoc phong : danhSachPhongHoc) {
            if (phong instanceof PhongMayTinh && ((PhongMayTinh) phong).getSoMayTinh() == 60) {
                dsPhongMay.add((PhongMayTinh) phong);
            }
        }
        return dsPhongMay;
    }
}
