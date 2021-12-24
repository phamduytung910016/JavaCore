package BaiTap.KeThuaVaDaHinh.QuanLySanPham;

public class QuanLySanPham {
    private static final int SP_SO = 1;
    private static final int SP_NN = 2;
    private static final int SP_CN = 3;

    public SanPham taoSanPham(int loai){
        switch (loai){
            case SP_SO: {
                return new SanPhamSo();
            }
            case SP_NN:{
                return new SanPhamNongNghiep();
            }
            default:{
                return null;
            }
        }
    }

    public void nhapThongTinSanPham(ISanPham []danhSach){
        if(danhSach != null){
            for (ISanPham iSanPham: danhSach) {
                if(iSanPham != null){
                    iSanPham.nhap();
                }else {
                    System.out.println("Sản phẩm không tồn tại");
                }

            }
        }
    }

    public void hienThongTinSanPham(ISanPham []danhSach){
        if(danhSach != null){
            for (ISanPham iSanPham: danhSach) {
                if(iSanPham != null){
                    iSanPham.hien();
                }else {
                    System.out.println("Sản phẩm không tồn tại");
                }

            }
        }
    }

    public ISanPham timGiaLonNhat(ISanPham []danhSach){
        ISanPham priceMax = null;
        if(danhSach != null){

            for (ISanPham iSanPham: danhSach) {
                if(iSanPham == null){
                    continue;
                }else {
                    if(priceMax == null || (priceMax.getGiaBan() < iSanPham.getGiaBan())){
                        priceMax = iSanPham;
                    }
                }

            }
        }
        return priceMax;
    }


}
