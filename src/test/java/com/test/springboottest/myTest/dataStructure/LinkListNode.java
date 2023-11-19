package com.test.springboottest.myTest.dataStructure;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class LinkListNode {
  private static class Node {
    Integer value;
    Node next;

    public Node(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node{" +
              "value=" + value +
              ", next=" + next +
              '}';
    }
  }

  private static void showLink(Node node) {
    while (node != null) {
      System.out.printf("%d ---> ", node.value);
      node = node.next;
    }
    System.out.printf("%s%n", "null");
  }

  private static Node reverse(Node node) {
    Node current = null, prev = null;

    while (node != null) {
      current = node;
      node = node.next;
      current.next = prev;
      prev = current;
    }
    return prev;
  }
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    showLink(n1);
    showLink(reverse(n1));
  }

}
