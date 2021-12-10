package CauTrucDuLieuVaGiaiThuat;


/**
 * Stack-ngăn xếp: là một cấu trúc dữ liệu hoạt động theo nguyên tắc FILO(vào sau ra trước)
 *
 * */

/**
 * push: Thêm vào một phần từ SnQ
 * pop: Lấy ra một phần tử trong SnQ
 * isFull: Kiểm tra SnQ đã đầy chưa
 * isEmpty: Kiểm tra SnQ có empty hay không
 * */



class Node_Stack_Array{
    private int data;

    public Node_Stack_Array(int data) {
        this.data = data;
    }

    public void printData(){
        System.out.println("Data = " + this.data);
    }
}

class Stack_Array{

    private int top;
    private Node_Stack_Array[] stack;

    public Stack_Array(int maxSize) {
        this.stack = new Node_Stack_Array[maxSize];
        this.top = -1;

    }

    public void push(Node_Stack_Array node_stack_array){
        if(this.isFull()){
            System.out.println("Stack is full\n");
            return;
        }
        this.top++;

        this.stack[this.top] = node_stack_array;
    }

    public Node_Stack_Array pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty \n");
            return null;
        }
        Node_Stack_Array node_stack_array = this.stack[this.top];
        this.top--;

        return node_stack_array;
    }

    public Node_Stack_Array peek(){
        return this.stack[this.top];
    }

    public boolean isFull(){
        return (this.top + 1 == this.stack.length);
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public void print(){
        System.out.println("Stack: \n");
        for (int i = 0; i <= this.top; i++) {
            this.stack[i].printData();
        }
    }
}



class Node_Stack_Linked{
    private int data;
    public Node_Stack_Linked next;

    public Node_Stack_Linked(int data){
        this.data = data;
    }

    public void printData(){
        System.out.println("Data = " + this.data + "\n");
    }
}

class Stack_Linked{
    private Node_Stack_Linked head;
    private int size;

    public Stack_Linked() {
        this.size = 0;
        this.head = null;
    }

    public void push(Node_Stack_Linked node_stack_linked){
        node_stack_linked.next = this.head;
        this.head = node_stack_linked;
        this.size++;
    }

    public Node_Stack_Linked pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Node_Stack_Linked node_stack_linked = this.head;
        this.head = this.head.next;
        this.size--;
        return node_stack_linked;

    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public Node_Stack_Linked peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return this.head;
    }

    public void print(){
        System.out.println("Stack: \n");
        Node_Stack_Linked node_stack_linked = this.head;
        while(node_stack_linked != null){
            node_stack_linked.printData();
            node_stack_linked = node_stack_linked.next;
        }
    }
}





public class Stack {
    public static void main(String[] args) {
//        System.out.println("Stack - Java \n");
//        Stack_Array stack = new Stack_Array(6);
//        stack.push(new Node_Stack_Array(12));
//        stack.push(new Node_Stack_Array(11));
//        stack.push(new Node_Stack_Array(10));
//        stack.push(new Node_Stack_Array(9));
//        stack.push(new Node_Stack_Array(8));
//
//        stack.print();
//
//        stack.pop();
//        stack.print();



        System.out.println("Stack - Java \n");
        Stack_Linked stack = new Stack_Linked();
        stack.push(new Node_Stack_Linked(12));
        stack.push(new Node_Stack_Linked(11));
        stack.push(new Node_Stack_Linked(10));
        stack.push(new Node_Stack_Linked(9));
        stack.push(new Node_Stack_Linked(8));

        stack.print();

        stack.pop();
        stack.print();
    }
}
