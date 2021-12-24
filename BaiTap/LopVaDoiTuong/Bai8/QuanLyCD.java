package BaiTap.LopVaDoiTuong.Bai8;

import java.util.Scanner;

public class QuanLyCD {
    Scanner sc = new Scanner(System.in);

    private CD[] danhSach;//danh sách CD
    private int n;// độ dài của danh sách
    private int index;//số CD có trong danh sách

    public QuanLyCD( int n ) {
        this.danhSach = new CD[n];
        this.n = n;
        this.index = 0;
        for (int i = 0; i < n ; i++) {
            this.danhSach[i] = new CD();
        }
    }

    public QuanLyCD() {
    }

    public CD[] getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(CD[] danhSach) {
        this.danhSach = danhSach;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void them(CD cdAdd){
        if((this.getIndex() < this.getN())){
            for (CD cd: this.danhSach
                 ) {
                if(cd.getMaCD() == cdAdd.getMaCD()){
                    return;
                }
            }
            this.danhSach[this.index] = cdAdd;
            this.index++;
            System.out.println("Thêm mới thành công");
        }else {
            System.out.println("Danh sách đã đầy");
        }
    }

    public void tongGiaThanh(){
        float sum = 0;
        for (CD cd: this.danhSach
             ) {
            sum += cd.getGiaThanh();
        }
        System.out.printf("Tổng giá thành là:%20.2f ",sum);
    }

    public void sapXepTheoGiaGiamDan(){
        for(int i = 0 ; i < this.index ; i++){
            //nếu dãy đã tăng rồi thì không cần sắp xếp nữa và thoát ra luôn
            boolean isSorted = true;
            for(int j = 0; j < this.index- i -1; j++){
                if(this.danhSach[j].getGiaThanh() < this.danhSach[j + 1].getGiaThanh()){
                    isSorted = false;
                    CD temp = this.danhSach[j];
                    this.danhSach[j] = this.danhSach[j+1];
                    this.danhSach[j+1] = temp;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println("Sắp xếp thành công");
    }

    public void sapXepTheoTuaCD(){
        for(int i = 0 ; i < this.index ; i++){
            //nếu dãy đã tăng rồi thì không cần sắp xếp nữa và thoát ra luôn
            boolean isSorted = true;
            for(int j = 0; j < this.index- i -1; j++){
                if(this.danhSach[j].getTuaCD().compareTo(this.danhSach[j + 1].getTuaCD()) < 0){
                    isSorted = false;
                    CD temp = this.danhSach[j];
                    this.danhSach[j] = this.danhSach[j+1];
                    this.danhSach[j+1] = temp;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println("Sắp xếp thành công");
    }

    public void nhap(){
        int i = 1;
        for (CD cd: this.getDanhSach()) {
            System.out.println("Nhập thông tin cho đĩa CD thứ " + i);
            System.out.println("Nhập mã CD: ");
            cd.setMaCD(sc.nextInt());
            sc.nextLine();

            System.out.println("Nhập tựa CD: ");
            cd.setTuaCD(sc.nextLine());

            System.out.println("Nhập ca sỹ: ");
            cd.setCaSi(sc.nextLine());

            System.out.println("Nhập số bài hát: ");
            cd.setSoBaiHat(sc.nextInt());

            System.out.println("Nhập giá thành: ");
            cd.setGiaThanh(sc.nextFloat());

            System.out.println();
            i++;
            this.index++;
        }
    }


    public void xuat(){
        for (int i = 0; i < this.index ; i++) {
            this.danhSach[i].hienThi();
        }
    }


}
