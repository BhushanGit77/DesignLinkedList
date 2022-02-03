class Main{

  Node head;
  int length;

  class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public Main() {
    this.head = null;
    length = 0;
  }

  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Main ls = new Main();

    ls.addAtHead(10);
    Node dumhead = ls.head;
    while(dumhead != null) {
      System.out.println(dumhead.val);
      dumhead = dumhead.next;
    }

    System.out.println("Post first append");
    ls.appendAtTail(5);
    dumhead = ls.head;
    while(dumhead != null) {
      System.out.println(dumhead.val);
      dumhead = dumhead.next;
    }

    System.out.println("Post Second append");
    ls.appendAtTail(16);
    dumhead = ls.head;
    while(dumhead != null) {
      System.out.println(dumhead.val);
      dumhead = dumhead.next;
    }

  }

  public void addAtHead(int val) {

    Node nd = new Node(val);
    nd.next = head;
    this.head = nd;
    length++;
  }

  public void appendAtTail(int val) {

    Node nd = head;

    while(nd.next != null) {
      nd = nd.next;
    }
    Node lastNode = new Node(val);
    nd.next = lastNode;
  }
}