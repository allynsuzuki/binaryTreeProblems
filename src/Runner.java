/**
 * Created by h205p4 on 1/22/19.
 */
public class Runner {


    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(3);
        bt.add(7);
        bt.add(8);
        bt.add(1);
        bt.add(2);
        bt.add(9);
        bt.add(5);

        //return bt;
//
//        print traverseInOrder followed by a new line (“\n”)
//        print traversePreOrder followed by a new line (“\n”)
//        print traversePostOrder


        System.out.print(bt.containsNode(6));
        bt.delete(6);
        System.out.print(bt.containsNode(6));
        bt.add(6);
        System.out.print(bt.containsNode(6));
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);

    }



}
