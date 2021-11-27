package CauTrucDuLieuVaGiaiThuat;

public class Mang {
    public static void main(String[] args) {
        //Khai báo mảng động
        int arr[] = {5,3,2,7,8,1,2};
        SelectionSort(arr);
    }

    public static void printArray(int a[] , int loop){
        System.out.print(loop + ":");
        for (int i = 0; i < a.length ; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int []a){
        int n = a.length;
        for(int i = 0 ; i < n ; i++){
            //nếu dãy đã tăng rồi thì không cần sắp xếp nữa và thoát ra luôn
            boolean isSorted = true;
            for(int j = 0; j < n- i -1; j++){
                if(a[j] > a[j + 1]){
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            printArray(a , i);
            if(isSorted){
                break;
            }
        }
    }

    /**
     * Insertion sort: sắp xếp chèn
     * Nguyên lý:
     * + Chạy từ đầu đến cuối mảng
     * + Tại vòng lặp i , coi như dãy từ [0,i-1] đã được sắp xếp,
     *   chèn phần từ a[i] vào vị trí thích hợp
     * + Sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp
     *
     * */
    public static void InsertionSort(int []a){
        int n = a.length;
        for (int i = 1; i < n ; i++) {
            //chèn a[i] vào dãy 0 -> i-1
            int ai = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > ai){
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = ai;
            printArray(a,i);

        }
    }


    /**
     * Selection Sort
     *
     * Nguyên lý:
     * + Chạy từ đầu đến cuối mảng
     * + Tại vòng lặp thứ i ,tìm phần tử nhỏ nhất từ [i+1,n-1], nếu nhỏ hơn a[i]
     *   thì đổi chỗ cho a[i]
     * + Sau vòng lặp thứ i , thì dãy [0,i] đã được sắp xếp
     * */

    public static void SelectionSort(int[] a){
        int n = a.length;
        for(int i = 0 ; i < n - 1 ;i++){
            for(int j = i + 1 ; j < n ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            printArray(a , i);
        }
    }




}
