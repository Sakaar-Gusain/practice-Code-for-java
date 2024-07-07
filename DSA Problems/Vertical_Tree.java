//vertical order traversal of treemap
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val){
        this.val = val;
        left = null;
        right= null;
    }
}

public class Vertical_Tree{
    public static List<List<Integer>> VerticalOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Map<Integer,List<Integer>> verticalMap = new TreeMap();
        Queue<SimpleEntry<TreeNode, Integer>> nodeQueue = new LinkedList();
        nodeQueue.offer(new SimpleEntry<>(root,0));

        while(!nodeQueue.isEmpty()){
            SimpleEntry<TreeNode, Integer> entry = nodeQueue.poll();
            TreeNode node = entry.getKey();
            int col = entry.getValue();
            verticalMap.computeIfAbsent(col,k->new ArrayList<>()).add(node.val);
            if (node.left != null){
                nodeQueue.offer(new SimpleEntry<>(node.left, col - 1));
            }
            if (node.right != null){
                nodeQueue.offer(new SimpleEntry<>(node.right, col + 1));
            }
        }
    
        for (List<Integer> values:verticalMap.values()){
            result.add(values);
        }
        return result;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> verticalOrderResult = VerticalOrderTraversal(root);

        for (List<Integer> column:verticalOrderResult){
            for(int val:column){
                System.out.print(val+' ');
            }
            System.out.println();
        }
    }
}