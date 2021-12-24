package BaiTap.KeThuaVaDaHinh.Bai7;

import BaiTap.LopVaDoiTuong.Bai8.CD;

public class QuanLy {
    private IPerson[] danhSach;
    private int tongSoNguoiTrongDanhSach;
    private int dungLuong;

    public QuanLy(int dungLuong) {
        this.dungLuong = dungLuong;
        this.danhSach = new IPerson[dungLuong];
        this.tongSoNguoiTrongDanhSach = 0;
    }

    public IPerson[] getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(IPerson[] danhSach) {
        this.danhSach = danhSach;
    }

    public int getTongSoNguoiTrongDanhSach() {
        int sum = 0;
        for (IPerson person : this.getDanhSach()
        ) {
            if (person != null) {
                sum++;
            }
        }
        return sum;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public void setTongSoNguoiTrongDanhSach(int tongSoNguoiTrongDanhSach) {
        this.tongSoNguoiTrongDanhSach = tongSoNguoiTrongDanhSach;
    }

    public void xuat() {
        for (IPerson person : this.getDanhSach()) {
            if (person != null) {
                person.hien();
            }
        }
    }

    //Sắp xếp theo tên
    public void sapXeptheoHoTen() {
        for (int i = 0; i < this.tongSoNguoiTrongDanhSach; i++) {
            //nếu dãy đã tăng rồi thì không cần sắp xếp nữa và thoát ra luôn
            boolean isSorted = true;
            for (int j = 0; j < this.tongSoNguoiTrongDanhSach - i - 1; j++) {
                if (this.danhSach[j].getHoTen().compareTo(this.danhSach[j + 1].getHoTen()) < 0) {
                    isSorted = false;
                    IPerson temp = this.danhSach[j];
                    this.danhSach[j] = this.danhSach[j + 1];
                    this.danhSach[j + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println("Sắp xếp thành công");
    }

    //Thêm 1 người vào danh sách
    public void themStudent() {
        IPerson student = new Student();
        student.nhap();
        int n = this.getTongSoNguoiTrongDanhSach();
        if (this.getTongSoNguoiTrongDanhSach() < this.getDanhSach().length) {
            this.danhSach[n] = student;
            this.setTongSoNguoiTrongDanhSach(n + 1);
            System.out.println("Thêm mới thành công");
        } else {
            IPerson[] danhSachMoi = new IPerson[n + n / 2];
            for (int i = 0; i < n; i++) {
                danhSachMoi[i] = getDanhSach()[i];
            }
            danhSachMoi[n] = student;
            setDungLuong(n + n / 2);
            setTongSoNguoiTrongDanhSach(n + 1);
            setDanhSach(danhSachMoi);
            System.out.println("Thêm mới thành công");
        }
    }

    public void themEmployee() {
        IPerson employee = new Employee();
        employee.nhap();
        int n = this.getTongSoNguoiTrongDanhSach();
        if (this.getTongSoNguoiTrongDanhSach() < this.getDanhSach().length) {
            this.danhSach[n] = employee;
            this.setTongSoNguoiTrongDanhSach(n + 1);
            System.out.println("Thêm mới thành công");
        } else {

            IPerson[] danhSachMoi = new IPerson[n + n / 2];
            for (int i = 0; i < n; i++) {
                danhSachMoi[i] = getDanhSach()[i];
            }
            danhSachMoi[n] = employee;
            setDungLuong(n + n / 2);
            setTongSoNguoiTrongDanhSach(n + 1);
            setDanhSach(danhSachMoi);
            System.out.println("Thêm mới thành công");
        }
    }

    public void themCustomer() {
        IPerson customer = new Customer();
        customer.nhap();
        int n = this.getTongSoNguoiTrongDanhSach();
        if (this.getTongSoNguoiTrongDanhSach() < this.getDanhSach().length) {
            this.danhSach[n] = customer;
            this.setTongSoNguoiTrongDanhSach(n + 1);
            System.out.println("Thêm mới thành công");
        } else {

            IPerson[] danhSachMoi = new IPerson[n + n / 2];
            for (int i = 0; i < n; i++) {
                danhSachMoi[i] = getDanhSach()[i];
            }
            danhSachMoi[n] = customer;
            setDungLuong(n + n / 2);
            setTongSoNguoiTrongDanhSach(n + 1);
            setDanhSach(danhSachMoi);
            System.out.println("Thêm mới thành công");
        }
    }

    public void xoaTheoTen(String hoVaTen) {
        IPerson person = null;
        int viTri = 0;
        for (int i = 0; i < this.getTongSoNguoiTrongDanhSach(); i++) {
            if (this.danhSach[i].getHoTen().toUpperCase().contains(hoVaTen.toUpperCase())) {
                viTri = i;
                person = danhSach[i];
                break;
            }
        }
        if (person == null) {
            System.out.println("Họ và tên không tồn tại trong danh sách");
            return;
        } else {
            for (int i = viTri; i < this.tongSoNguoiTrongDanhSach ; i++) {
                danhSach[i] = danhSach[i + 1];
            }
            this.setTongSoNguoiTrongDanhSach(this.getTongSoNguoiTrongDanhSach() - 1);
            System.out.println("Xóa thành công");
        }
    }


}
