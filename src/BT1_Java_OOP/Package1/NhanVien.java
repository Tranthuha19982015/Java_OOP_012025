package BT1_Java_OOP.Package1;

public class NhanVien {
    public String hoTen;
    public int tuoi;
    public String gioiTinh;

    public NhanVien(String hoTen, int tuoi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void getInfo() {
        System.out.println("Họ tên: " + hoTen + ", tuổi: " + tuoi + ", giới tính: " + gioiTinh);
    }
}
