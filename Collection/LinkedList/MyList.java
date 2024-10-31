package Collection.LinkedList;

public class MyList {

    Node head, tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(int x) {
        Node newNode = new Node(x);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addFirst(int x) {
        Node newNode = new Node(x);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void traversal(){
        Node p = head;
        while(p != null){
            System.out.println(p.info + " ");
            p = p.next;
            System.out.println("");
        }
    }

    public int size(){
        Node p = head;
        int count = 0;
        while(p != null){
            count++;
            p = p.next;
        }
        return count;
    }

    public Node get(int k){
        Node p = head;
        int c = 0;
        while(p != null && c < k){
            c++;
            p = p.next;
        }
        return p;
    }

    public void sort(){
        int n = size();
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = get(i), pj = get(j);
                if(pi.info > pj.info){
                    int t = pi.info;
                    pi.info = pj.info;
                    pj.info = t;
                }
            }
        }
    }

    public Node search(int k){
        Node p = head;
        while(p != null && p.info != k){
            p = p.next;
        }
        return p;
    }



}
