package Study.CS_Study.DataStructure;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    Node root;

    public void setRoot(int data) {
        this.root = new Node(data);
    }


    public int find_node_by_recursion(Node current_node, int data) {
        if(current_node == null)
            return 0;
        if(data < current_node.data)
            return find_node_by_recursion(current_node.left, data);
        else if(data > current_node.data)
            return find_node_by_recursion(current_node.right, data);
        else
            return 1;
    }

    int find(int data) {
        if(find_node_by_recursion(root, data) == 0)
            return 0;
        else
            return 1;
    }

    void insert_node(Node current_node, int data) {
        if(data == current_node.data) {
            System.out.printf("이미 %d값이 존재합니다. 중복된 값은 삽입할 수 없습니다.\n", data);
            return;
        }
        if (data < current_node.data) {
            if (current_node.left == null) {
                current_node.left = new Node(data);
            }
            else {
                insert_node(current_node.left, data);
            }
        }
        else if (data > current_node.data) {
            if (current_node.right == null) {
                current_node.right = new Node(data);
            }
            else {
                insert_node(current_node.right, data);
            }
        }
    }

    void insert(int data) {
        if(root == null) {
            setRoot(data);
        }
        else {
            insert_node(root, data);
        }
    }
    Node get_next_node(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    void delete_node(Node parent, Node current_node, int data) {
        if (current_node == null) {
            System.out.printf("트리에 %d가 존재하지 않습니다. \n", data);
            return;
        }

        if (data < current_node.data)
            delete_node(current_node, current_node.left, data);

        else if (data > current_node.data)
            delete_node(current_node, current_node.right, data);
        else {
            if (current_node.left == null && current_node.right == null) {
                if (data < parent.data)
                    parent.left = null;
                else
                    parent.right = null;
            }

            else if (current_node.left != null && current_node.right == null) {
                if (data < parent.data)
                    parent.left = current_node.left;
                else
                    parent.right = current_node.left;
            }

            else if (current_node.left == null && current_node.right != null) {
                if (data < parent.data)
                    parent.left = current_node.right;
                else
                    parent.right = current_node.right;
            }

            else if (current_node.left != null && current_node.right != null) {
                Node next_node = get_next_node(current_node.right);
                current_node.data = next_node.data;
                delete_node(current_node, current_node.right, next_node.data);
            }
        }
    }

    void delete(int data) {
        if (root == null)
            System.out.printf("트리에 노드가 존재하지 않습니다.");
        else
            delete_node(null, root, data);
    }
}

// 데이터 탐색, 삽입, 제거
public class BinarySearchTree1 {
    static void in_order(Node node) {
        if (node == null) {
            return;
        }
        in_order(node.left);
        System.out.printf("%d  ", node.data);
        in_order(node.right);
        return;

    }
    public static void main(String[] args)  {
        BinarySearchTree BST = new BinarySearchTree();
        BST.setRoot(7);

        BST.insert(3);
        BST.insert(1);
        BST.insert(5);
        BST.insert(10);
        BST.insert(8);

        BST.insert(4);
        BST.insert(12);
        BST.insert(15);

        BST.delete(7);
        in_order(BST.root);
    }
}
