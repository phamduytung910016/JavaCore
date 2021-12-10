package com.javamidle;




/**
 * tight-coupling(Liên kết rằng buộc): là 1 khái niệm trong Java ám chỉ việc mối quan hệ giữa các Class quá chặt chẽ.Khi
 * yêu cầu thay đổi logic hay 1 class bị lỗi sẽ dẫn tới ảnh hưởng toàn bộ các Class khác.
 *
 * loosely-coupled là cách ám chỉ việc làm giảm bớt sự phụ thuộc giữa các Class với nhau
 *
 * */


//---------------Ví dụ level1

//class BubbleSortAlgorithm{
//    public void sort(int[] array){
//        System.out.println("Đã sắp xếp bằng thuật toán sx nổi bọt!");
//    }
//
//
//}
//
//class VeryComplexService{
//    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//
//    public VeryComplexService() {
//    }
//
//    public void compleBusiness(int arr[]){
//        bubbleSortAlgorithm.sort(arr);
//    }
//}



/**
 * Với cách làm ở trên khi có yêu cầu thay đổi thuật toán sắp ếp sang QuickSort thì chúng ta
 * phải sửa lại hoàn toàn 2 class và BubbleSort sẽ chỉ tồn tại nếu VeryComplex tồn tại vì
 * Verycomplex tạo đối tượng BubbleSort bên trong nó
 * => Đây là liên kết chặt chẽ với nhau
 * */


//-------Level2-----------

//interface SortAlgorithm{
//    void sort(int array[]);
//}
//
//class BubbleSort implements SortAlgorithm{
//    @Override
//    public void sort(int[] array) {
//        System.out.println("Đã sắp xếp bằng thuật toán sx nổi bọt");
//    }
//}
//
//class VeryComplexService{
//    private SortAlgorithm sortAlgorithm;
//
//    public VeryComplexService() {
//        sortAlgorithm = new BubbleSort();
//    }
//
//    public void compleBusiness(int arr[]){
//        this.sortAlgorithm.sort(arr);
//    }
//}

/**
 * Với cách làm này , VeryComplexService sẽ chỉ quan hệ với 1 interface
 * => mối quan hệ giảm bớt sự liên kết , nhưng nó không thay đổi được
 * thuật toán vẫn đang dùng là BubbleSort
 * */


//--------Level3-Pro-----------------

interface SortAlgorithm {
    void sort(int[] array);
}

class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble sort");
    }
}

class QuickSort implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        System.out.println("Quick sort");
    }
}

class VeryComplexService {
    private SortAlgorithm sort;

    public VeryComplexService(SortAlgorithm sort) {
        this.sort = sort;
    }

    public void complexBussines(int[] arr){
        this.sort.sort(arr);
    }
}

public class LienKetRangBuoc {
    public static void main(String[] args) {
        SortAlgorithm bubble = new BubbleSort();
        SortAlgorithm quick = new QuickSort();
        VeryComplexService busines1 = new VeryComplexService(bubble);
        VeryComplexService busines2 = new VeryComplexService(quick);
    }
}




