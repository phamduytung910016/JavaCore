package BaiTap.LopVaDoiTuong.Bai7;
import java.util.Scanner;
public class QuanLySinhVien {

    Scanner sc = new Scanner(System.in);
    private SinhVien[] danhSach ; //Danh sách sinh viên
    private int n; //Số lượng sinh viên

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(int n) {
        this.danhSach = new SinhVien[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            this.danhSach[i] = new SinhVien();
        }
    }

    public SinhVien[] getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(SinhVien[] danhSach) {
        this.danhSach = danhSach;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap(){
        int i = 1;
        for (SinhVien s: this.getDanhSach()
             ) {
            System.out.println("Nhập thông tin sinh viên thứ " + i);
            System.out.println("Nhập mã số sinh viên: ");
            s.setMsv(sc.nextInt());
            sc.nextLine();

            System.out.print("Nhập họ và tên: ");
            s.setHoTen(sc.nextLine());


            System.out.println("Nhập địa chỉ: ");
            String diaChi = sc.nextLine();
            s.setDiaChi(diaChi);

            System.out.println("Nhập số điện thoại (7 chữ số): ");
            String soDienThoai = sc.nextLine();
            s.setSoDienThoai(soDienThoai);
            i++;
            System.out.println();
        }
    }

    public void xuat(){

        for(int i = 0 ; i < this.n ; i++){
            //nếu dãy đã tăng rồi thì không cần sắp xếp nữa và thoát ra luôn
            boolean isSorted = true;
            for(int j = 0; j < this.n- i -1; j++){
                if(this.danhSach[j].getMsv() > this.danhSach[j + 1].getMsv()){
                    isSorted = false;
                    SinhVien temp = this.danhSach[j];
                    this.danhSach[j] = this.danhSach[j+1];
                    this.danhSach[j+1] = temp;
                }
            }
            if(isSorted){
                break;
            }
        }

        for (SinhVien s: this.getDanhSach()
             ) {
            System.out.println(s);
        }
    }
}
