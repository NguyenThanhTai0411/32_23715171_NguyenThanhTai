package stt32_23715171_nguyenthanhtai;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    // Constructor
    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    // Getter và Setter
    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    // Kiểm tra phòng đạt chuẩn
    @Override
    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return super.toString() + ", Có máy chiếu: " + (coMayChieu ? "Có" : "Không");
    }
}
