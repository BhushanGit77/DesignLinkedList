 class Node {
    int val;
    Node next;

    public Node(int val) {
      this.val = val;
      this.next = null;
    }
  }


class Main{

  Node head;
  int length;

  public Main() {
    this.head = null;
    length = 0;
  }

  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Main ls = new Main();

    ls.addAtHead(10);
    ls.print();

    System.out.println("Post first append");
    ls.appendAtTail(5);
    ls.print();

    System.out.println("Post Second append");
    ls.appendAtTail(16);
    ls.print();

    System.out.println("Post first prepend");
    ls.addAtHead(18);
    ls.print();

    System.out.println("Insert at perticular location");
    ls.insert(2,99);
    ls.print();

    System.out.println("Insert at head location");
    ls.insert(0,5);
    ls.print();

    System.out.println("Remove at perticular location");
    ls.remove(2);
    ls.print();

    
    System.out.println("Remove head");
    ls.remove(0);
    ls.print();
  }

  public void print() {

    Node dumhead = head;
    while(dumhead != null) {
      System.out.println(dumhead.val);
      dumhead = dumhead.next;
    }
  }

  public void remove(int index) {
    if(index >= this.length) {
      return;
    }
    
    if(index == 0) {
      head = head.next;
      return;
    }

    Node nd = head;
    for(int i = 0; i < index-1; i++) {
       nd = nd.next;
    }
    nd.next = nd.next.next;
  }

  public void insert(int index, int val) {

    if(index >= this.length) {
      return;
    }

    if(index == 0) {
      addAtHead(val);
      return;
    }

    Node ins = new Node(val);
    Node nd = head;
    for(int i = 0; i < index-1; i++) {
      nd = nd.next;
    }

    ins.next = nd.next;
    nd.next = ins;
    this.length++;
  }

  public void addAtHead(int val) {

    Node nd = new Node(val);
    nd.next = head;
    this.head = nd;
    this.length++;
  }

  public void appendAtTail(int val) {

    Node nd = head;

    while(nd.next != null) {
      nd = nd.next;
    }
    Node lastNode = new Node(val);
    nd.next = lastNode;
    this.length++;
  }
}