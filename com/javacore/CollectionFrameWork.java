package com.javacore;

/**
 * Java Collection Framework cung caaps 1 tập hợp các interface và các classes để giúp chúng ta
 * làm việc dễ dàng nhanh chóng với các tập hợp dữ liệu
 * <p>
 * Trong interface Collections chúng ta các Interface chính như: List Interface , Set,
 * SortedSet, Map và SortedMap
 * <p>
 * -----------------------Các interface---------------------------
 * List interface: Các phần tử trong List interface được sắp xếp có thứ tự và có thể co giá trị giống nhau
 * <p>
 * Set: Các phần tử trong Set là duy nhất(nghĩa là giá trị của các phần tử này không được giống nhau)
 * <p>
 * SortedSet: là 1 dạng riêng của Set interface, trong đó giá trị của các phần tử mặc định được sắp xếp tăng
 * dần
 * <p>
 * Map: Giá trị của mỗi phần tử trong Map bao gồm 2 phần đó là khóa (key) và giá trị tương ứng của key đó (value)
 * và khóa của các phần tử là duy nhất
 * <p>
 * SortedMap: là 1 dạng riêng của Map interface, trong đó giá trị key được sắp xếp tăng dần
 * <p>
 * <p>
 * --------------------------Các class----------------------------------------
 * LinkedList(Danh sách liên kết): Là 1 cấu trúc dữ liệu lưu trữ các phần tử dưới dạng danh sách .Các phần tử trong
 * LinkedList được sắp xếp có thứ tự và có thể có giá trị giống nhau
 * <p>
 * ArrayList: Là kiểu danh sách sử dụng cấu trúc mảng để lưu trữ phần tử. Thứ tự các phần từu dựa theo thứ tự lúc thêm
 * vào và giá trị của các phần tử có thể trùng nhau.
 * <p>
 * HashSet: Thứ tự các phần tử trong HashSet không dựa theo thứ tự lúc thêm vào và giá trị của các phần tử này là duy nhất.
 * <p>
 * TreeSet: Các phần tử trong TreeSet mặc định được sắp xếp tăng dần và giá trị của các phần tử này là duy nhất.
 * <p>
 * HashMap: Giá trị của mỗi phần tử trong HashMap bao gồm 2 phần đó là khóa(key) và giá trị tương ứng của key đó(value)
 * và khóa của các phần tử này là duy nhất. HashMap cho phép truy xuất trực tiếp dữ liệu bằng khóa duy nhất của nó.
 * <p>
 * TreeMap: Giá trị của mỗi phần tử trong TreeMap bao gồm 2 phần đó là khóa (key) và giá trị tương ứng của key đó (value)
 * và khóa của các phần tử này là duy nhất. Giá trị của các phần tử trong TreeMap được sắp xếp tăng dần.
 */


/**
 * -----------------------Các interface---------------------------
 * List interface: Các phần tử trong List interface được sắp xếp có thứ tự và có thể co giá trị giống nhau
 *
 * Set: Các phần tử trong Set là duy nhất(nghĩa là giá trị của các phần tử này không được giống nhau)
 *
 * SortedSet: là 1 dạng riêng của Set interface, trong đó giá trị của các phần tử mặc định được sắp xếp tăng
 * dần
 *
 * Map: Giá trị của mỗi phần tử trong Map bao gồm 2 phần đó là khóa (key) và giá trị tương ứng của key đó (value)
 * và khóa của các phần tử là duy nhất
 *
 * SortedMap: là 1 dạng riêng của Map interface, trong đó giá trị key được sắp xếp tăng dần
 *
 * */

/**
 * --------------------------Các class----------------------------------------
 * LinkedList(Danh sách liên kết): Là 1 cấu trúc dữ liệu lưu trữ các phần tử dưới dạng danh sách .Các phần tử trong
 * LinkedList được sắp xếp có thứ tự và có thể có giá trị giống nhau
 *
 * ArrayList: Là kiểu danh sách sử dụng cấu trúc mảng để lưu trữ phần tử. Thứ tự các phần từu dựa theo thứ tự lúc thêm
 * vào và giá trị của các phần tử có thể trùng nhau.
 *
 * HashSet: Thứ tự các phần tử trong HashSet không dựa theo thứ tự lúc thêm vào và giá trị của các phần tử này là duy nhất.
 *
 * TreeSet: Các phần tử trong TreeSet mặc định được sắp xếp tăng dần và giá trị của các phần tử này là duy nhất.
 *
 * HashMap: Giá trị của mỗi phần tử trong HashMap bao gồm 2 phần đó là khóa(key) và giá trị tương ứng của key đó(value)
 * và khóa của các phần tử này là duy nhất. HashMap cho phép truy xuất trực tiếp dữ liệu bằng khóa duy nhất của nó.
 *
 * TreeMap: Giá trị của mỗi phần tử trong TreeMap bao gồm 2 phần đó là khóa (key) và giá trị tương ứng của key đó (value)
 * và khóa của các phần tử này là duy nhất. Giá trị của các phần tử trong TreeMap được sắp xếp tăng dần.
 *
 * */


import java.util.*;

/**
 * Cách duyết các phần tử của collection trong java
 *  + Sử dụng Ilterrator interface
 *  + Sử dụng vòng lặp for-each
 *
 * */


/**
 * Collection có nhiều phương thức tĩnh tiện dụng như: sort (sắp xếp danh sách), max/min (lấy giá trị lớn nhất),
 * reverse (đảo ngược thứ tự)
 * */
public class CollectionFrameWork {

//    public static void main(String[] args) {
//        //Creating arraylist
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Java");
//        list.add("C++");
//        list.add("PHP");
//
//        //Show list through Ilterator
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next() + ", ");
//        }
//
//        //Show list through for-each
//
//        for (String obj: list
//             ) {
//            System.out.println(obj);
//        }
//
//        List<String> animals = new ArrayList<>();
//        animals.add("tiger");
//        animals.add("cat");
//        animals.add("snake");
//        animals.add("dog");
//
//        //sort string
//        Collections.sort(animals);
//        System.out.println("animal sort: " + animals);
//
//
//        //number
//        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(20);
//        nums.add(40);
//        nums.add(9);
//        nums.add(30);
//        nums.add(1);
//        Collections.sort(nums);
//        System.out.println("number: " + nums);
//    }


    /**
     * List là 1 interface trong java. Các classes implement List : ArrayList, Vector, LinkedList
     * */

    /**
     * Một số phương thức trong -----ArrayList-------------
     * add(Object o ) thêm phần tử vào cuối
     * remove(int index) xóa phần tử có chỉ số index
     * clear() xóa mọi phần tử
     * contains(Object o) kiểm tra mảng có chứa phần tử o hay không
     * get(int index) lấy phần tử có chỉ số index
     * size() lấy số phần tử
     * toArray() chuyển thành mảng
     * */

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Java");
//        list.add("C++");
//        list.add("PHP");
//        list.add("Ruby");
//        list.add("Js");
//        list.add("HTML");
//
//
//        System.out.println(list.get(2));
//    }

    /**-------------LinkedList---------------------------*/
    /**
     * import java.util.LinkedList;
     * Đặc điểm:
     *  +Có thể chứa các phần tử trùng lặp
     *  +Duy trì thứ tự của các phần tử được thêm vào
     *  +Không đồng bộ
     *  +Thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xóa khỏi danh sách
     * */

    /**
     * LinkedList cũng implement List interface cho nên nó cũng có 1 số method giống ArrayList, ngoài
     * ra nó còn cung cấp thêm một số method dưới đây:
     *  +Add phần tử: add, addAll, addFirst, addLast
     *  +Đọc phần tử: get(index), getFirst() và getLast()
     *  +Cập nhất giá trị của phần tử: set(int index , E element)
     *
     * */

//    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("Java");
//        linkedList.add("C++");
//        linkedList.add("PHP");
//        linkedList.add("Ruby");
//
//        System.out.println("Show list through Iterator");
//        Iterator<String> itr = linkedList.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next() + ", ");
//        }
//
//        linkedList.addLast("Python");
//        linkedList.addFirst("Assembly");
//        linkedList.add(2, "test");
//        linkedList.set(1, "C/C++");
//        itr = linkedList.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next() + ", ");
//        }
//    }


    /**
     * -----------------Map Interface-------------------
     * HashMap được sử dụng để lưu trữ dữ liệu tập hợp như là cặp key/value.
     *  - Lớp HashMap implement Map Interface
     *  - Cần phải import java.util.HashMap khi sử dụng
     *  - Đặc điểm cần ghi nhớ về HashMap:
     *    1. HashMap lưu trữ dữ liệu dưới dạng cặp key và value
     *    2. Nó chứa các key duy nhất
     *    3. Nó có thể có 1 key là null và nhiều giá trị null
     *    4. Nó duy trì các phần tử KHÔNG theo thứ tự
     *
     * */

    /**
     * Một số phương thức ----------------- HashMap ------------------------
     * put(Object key , Object value) : thêm 1 phần tử
     * containsKey(Object key) kiểm tra phần tử có key tồn tại
     * containsValue(Object value) kiểm tra phần tử có giá trị value tồn tại hay không
     * get(Object key) lấy giá trị phần tử theo key
     * remove(Object key) loại bỏ phần tử theo key
     * size() lấy số phần tử
     * clear() xóa toàn bộ phần tử
     *
     *
     * */

//    public static void main(String[] args) {
//        Map<String, String> hashMap = new HashMap<String, String>();
//        hashMap.put("Apple" , "Táo");
//        hashMap.put("Banana" , "Chuối");
//        hashMap.put("Orange" , "Cam");
//       //khi có key mới trùng với key cũ , sẽ xóa key cũ
//        hashMap.put("Banana" , "Táo");
//
//        //duyệt values
//        Iterator<String> itrValue = hashMap.values().iterator();
//        while(itrValue.hasNext()){
//            System.out.println(itrValue.next() + ", ");
//        }
//
//        //duyệt key
//        Iterator<String> itrKey = hashMap.values().iterator();
//        while(itrKey.hasNext()){
//            System.out.println(itrKey.next() + ", ");
//        }
//
//        System.out.println(hashMap.containsValue("Chuối"));
//
//    }



    /**
     * --------------Set interface -----------------
     * Được sử dụng để lưu trũ dữ liệu không trùng lặp
     * các class implement : HashSet, TreeSet, LinkedHashSet
     * */

    /**
     * Một số phương thức với -------------------HashSet----------------------
     *  + add (E e) thêm phần tử vào tập hợp
     *  + size() lấy số phần tử
     *  + isEmpty() kiểm tra rỗng hay không
     *  contains(Object o) kiểm tra có chứa phần tử
     *  remove(Object o) xóa phần tử khỏi tập hợp
     *  clear() xóa mọi phần tử khỏi tập hợp
     *  toArray() lấy mảng các phần tử
     *  Ngoài ra duyệt danh sách phần tử bằng vòng lặp(for) hoặc bằng iterator
     * */


    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);

        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + ", ");
        }


    }
}






