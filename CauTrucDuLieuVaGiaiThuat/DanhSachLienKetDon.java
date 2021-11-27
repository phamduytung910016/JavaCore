package CauTrucDuLieuVaGiaiThuat;

public class DanhSachLienKetDon {
    /**
     * Chỉ cần lưu node đầu tiên là có thể truy xuất cả mảng
     * Khả năng truy xuất 1 phần tử của mảng: O(n)
     * Khả năng thêm và xóa 1 phần tử : O(1)*
     */

    public static void main(String[] args) {
        System.out.println("Linked List - Java");

        LinkedList list = new LinkedList();
        list.insertAt(new Node(new Student("Tùng", 20)), 0);
        Student nam = new Student("Nam", 21);
        Node newNode = new Node(nam);
        list.insertAt(newNode, 0);
        list.insertAt(new Node(new Student("Tuấn", 20)), 0);

        list.insertAt(new Node(new Student("Ngọc", 20)), 4);
        list.insertAt(new Node(new Student("Dũng", 20)), 2);
        list.printList();
        list.delete(3);
        list.printList();
//        int id = 2;
//        Node searchNode = list.search(id);
//        System.out.println("Tìm kiếm Student có id = " + id);
//        if (searchNode != null) {
//            searchNode.printData();
//        } else {
//            System.out.println("Không có kết quả");
//        }

    }
}

class Student {
    public static int autoId;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student(String name, int age) {
        this.id = Student.autoId++;
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}

class Node {
    private Student student;
    public Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void printData() {
        student.printInfo();
    }

    public boolean hasStudent(int studentId) {
        return this.student.getId() == studentId;
    }


}

class LinkedList {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        Student.autoId = 1;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int size() {
        return this.size;
    }


    public void insertAt(Node node, int position) {

        //thêm vào đầu
        if (position < 1 || this.size == 0) {
            node.next = this.head;
            this.head = node;
            //nếu danh sách rỗng
            if (this.tail == null) {
                this.tail = node;
            }
            this.size++;
            return;
        } else if (position >= this.size) {
            if (this.tail != null) {
                this.tail.next = node;
            }
            this.tail = node;
            if (this.head == null) {
                this.head = node;
            }
            size++;
            return;
        }

        //insert ở giữa
        Node preNode = null;
        Node currentNode = this.head;
        int counter = 0;
        while (counter < position) {
            counter++;
            preNode = currentNode;
            currentNode = currentNode.next;
        }
        node.next = currentNode;
        preNode.next = node;
        size++;
        return;
    }


    public void printList() {
        System.out.println("PrintList");
        Node currentNode = head;
        while (currentNode != null) {
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }

    public Node search(int studentId) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.hasStudent(studentId)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void delete(int studentId) {
        Node preNode = null;
        Node currentNode = this.head;
        int counter = 0;
        while (currentNode != null) {
            if (currentNode.hasStudent(studentId)) {
                if (counter == 0) {
                    //delete first
                    this.head = this.head.next;
                    if (this.head == null) {
                        this.tail = null;
                    }
                } else if (counter == this.size - 1) {
                    //delete last
                    preNode.next = null;
                    this.tail = preNode;

                } else {
                    preNode.next = currentNode.next;
                    //delete middle
                }
                this.size--;
            }
            counter++;
            preNode = currentNode;
            currentNode = currentNode.next;
        }
    }


}


