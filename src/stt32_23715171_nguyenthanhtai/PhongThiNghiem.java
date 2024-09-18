package stt32_23715171_nguyenthanhtai;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    // Constructor
    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    // Getter và Setter
    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    // Kiểm tra phòng đạt chuẩn
    @Override
    public boolean datChuan() {
        return duAnhSang() && coBonRua;
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return super.toString() + 
               ", Chuyên ngành: " + chuyenNganh + 
               ", Sức chứa: " + sucChua + 
               ", Có bồn rửa: " + (coBonRua ? "Có" : "Không");
    }
}
