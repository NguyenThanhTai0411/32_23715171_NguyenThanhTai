package stt32_23715171_nguyenthanhtai;

public abstract class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    // Constructor
    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    // Getters
    public String getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    // Setters
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    // Phương thức kiểm tra đủ ánh sáng
    public boolean duAnhSang() {
        return (dienTich / 10) <= soBongDen;
    }

    // Phương thức abstract kiểm tra đạt chuẩn
    public abstract boolean datChuan();

    // Override phương thức toString
    @Override
    public String toString() {
        return "Mã phòng: " + maPhong +
               ", Dãy nhà: " + dayNha +
               ", Diện tích: " + dienTich + " m2" +
               ", Số bóng đèn: " + soBongDen;
    }
}
