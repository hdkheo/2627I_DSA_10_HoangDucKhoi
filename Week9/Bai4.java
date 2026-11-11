import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Bai4 {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static Node lca(Node root, int v1, int v2) {
        while (root != null) {
            if (v1 < root.data && v2 < root.data) {
                root = root.left;
            } else if (v1 > root.data && v2 > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextInt()) return;

        int n = scan.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();
            root = insert(root, data);
        }

        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();

        Node ans = lca(root, v1, v2);
        if (ans != null) {
            System.out.println(ans.data);
        }
    }
}
