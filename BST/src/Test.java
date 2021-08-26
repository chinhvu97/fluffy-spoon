public class Test {

    public static void main(String[] args) {
//        MyBinaryTree myBinaryTree = new MyBinaryTree();
//        myBinaryTree.init();

        MyBST myBST = new MyBST();
        TreeNode root = new TreeNode(5);
        myBST.insert(root, 4);
        myBST.insert(root, 6);
        myBST.insert(root, 7);
        myBST.insert(root, 3);
        myBST.insert(root, 2);
        myBST.insert(root, 9);
        System.out.println("done");
    }
}
