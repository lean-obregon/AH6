import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static Node<String> linkedListValues(Node<String> head) {
    while (head != null) {
      head.next = new Node<>(head.val);
    }
    return head;
  }

  public static void main(String[] args) {
    Node<String> one = new Node<>("1");
    Node<String> two = new Node<>("2");
    Node<String> three = new Node<>("3");
    Node<String> four = new Node<>("4");
    Node<String> five = new Node<>("5");
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;

    Solution.linkedListValues(one);
  }
}
