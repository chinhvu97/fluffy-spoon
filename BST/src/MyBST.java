public class MyBST {

    public TreeNode root;

    public MyBST() {
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            TreeNode temp = root;
            while (true) {
                if (temp.val < value) {
                    if (temp.right == null) {
                        temp.right = new TreeNode(value);
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else if (temp.val > value) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(value);
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }

        }
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                root.right = insertIntoBST(root, value);
            }
        } else if (value < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                root.left = insertIntoBST(root, value);
            }
        }
        return root;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key<root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key>root.val){
            root.right = deleteNode(root.right, key);
        } else {
            //TH1: leaf
            if (root.left == null && root.right == null) {
                return null;
            }
            //TH2: one child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            //TH3: two child
            TreeNode successor = findLeftMost(root.right);
            root.val = successor.val;
            root.right =  deleteNode(root.right, successor.val);
        }
        return root;
    }

    private TreeNode findLeftMost(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    /**
     * leetcode 108
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        return addSortArray(nums, start, end);
    }

    private TreeNode addSortArray(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = addSortArray(nums, start, mid - 1);
        node.right = addSortArray(nums, mid + 1, end);

        return node;
    }


}
