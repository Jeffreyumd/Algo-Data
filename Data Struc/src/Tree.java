
// Representation of a binary Tree
public class Tree {

  public static void main(String arg[]) {


    Node node = new Node(5);

    for(int i=0; i < 10; i++) {
      node.add(i);
    }
    node.add(4);
    node.add(-1);
    node.printOrder();
  }

}

class Node {

  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
  }

  // Add new Node to the tree
  // EFFECT: if node value is less than Root add left
  // if Node value is greater than Root add right
  public void add(int value) {

    if (this.data <= value) {
      // if no Left no exit create new Node
      if (this.left == null) {
        left = new Node(value);
      } else {
        this.left.add(value);
      }
    } else {
      // if no Left no exit create new Node
      if (this.right == null) {
        right = new Node(value);
      } else {
        this.right.add(value);
      } 
    }
  }
  

  // check if node contains item
  public boolean find(int value) {

    if(value == this.data) {
      return true;
    } else if(value < this.data) {
      // check if left node exits 
      if(this.left == null) {
        return false;
      } else {
        return this.left.find(value);
      }
    } else {
      // check if right node exits 
      if (this.right == null) {
        return false;
      } else {
        return this.right.find(value);
      }
    }
  }

  // print data in Node
  // EFFECT print data from smallest to largest
  void printOrder() {

    if (this.left != null) {
      this.left.printOrder();
    }

    System.out.println(this.data);

    if (this.right != null) {
      this.right.printOrder();
    }
    
    
  }

}
