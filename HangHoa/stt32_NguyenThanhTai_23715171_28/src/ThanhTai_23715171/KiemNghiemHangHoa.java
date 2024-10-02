package ThanhTai_23715171;

import java.util.Scanner;

public class KiemNghiemHangHoa {
	public static void main(String[] args) {
		DanhSachHangHoa ds=null;
		Scanner sc=null;
		boolean flag=true;
		int n=0;
		try {
			sc=new Scanner(System.in);
			
			while(flag) {
				try {
					System.out.println("Nhập số phần tử mảng: ");
					n=sc.nextInt();
					ds=new DanhSachHangHoa(n);
					flag=false;
				}catch (RuntimeException e) {
					System.out.println(e.getMessage());
					continue;
				}
			}
		}finally {
			sc.close();
		}
		
		khoiTaoDS(ds);
		
		System.out.println("Danh sách hàng hóa sau khi sắp xếp theo tên hàng");
		HangHoa[] dsMoi= ds.sapXepDSHHTheoTenHang();
		for(HangHoa hh: dsMoi)
			System.out.println(hh);
		
		System.out.println("Danh sách là hàng thực phẩm");
		HangHoa[] dsHangThucPham
		
		
	}
}
