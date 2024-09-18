package stt32_23715171_nguyenthanhtai;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    // Constructor
    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    // Getter và Setter
    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    // Kiểm tra phòng đạt chuẩn
    @Override
    public boolean datChuan() {
        return duAnhSang() && (getDienTich() / 1.5) <= soMayTinh;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return super.toString() + ", Số máy tính: " + soMayTinh;
    }
}
