
import javax.swing.JTextArea;

class Node {

    String data;
    FileFrequencyNode fileFrequencyHead;
    Node left, right;

    Node(String word, String filename) {
        data = word;
        fileFrequencyHead = new FileFrequencyNode(filename);
        left = right = null;
    }

    void addFileFrequency(String filename) {
        FileFrequencyNode newNode = new FileFrequencyNode(filename);
        if (fileFrequencyHead == null) {
            fileFrequencyHead = newNode;
        } else {
    
            FileFrequencyNode current = fileFrequencyHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}


class FileFrequencyNode {

    String filename;
    int frequency;
    FileFrequencyNode next;

    FileFrequencyNode(String filename) {
        this.filename = filename;
        this.frequency = 1;
        next = null;
    }
}

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insertInOrder(String word, String filename) {
        root = insertInOrderRecursive(root, word, filename);
    }

    Node insertInOrderRecursive(Node root, String word, String filename) {
        if (root == null) {
            return new Node(word, filename);
        }

        int compareResult = word.compareTo(root.data);

        if (compareResult < 0) {
            root.left = insertInOrderRecursive(root.left, word, filename);
        } else if (compareResult > 0) {
            root.right = insertInOrderRecursive(root.right, word, filename);
        } else {
            FileFrequencyNode existingFileFrequency = getFileFrequency(root, filename);
            if (existingFileFrequency == null) {
                root.addFileFrequency(filename);
            } else {
                existingFileFrequency.frequency++;
            }
        }

        return root;
    }
  
    
    
    int getTotalFrequency(FileFrequencyNode fileFrequencyHead) {
        int totalFrequency = 0;
        FileFrequencyNode current = fileFrequencyHead;
        while (current != null) {
            totalFrequency += current.frequency;
            current = current.next;
        }
        return totalFrequency;
    }
    

    FileFrequencyNode getFileFrequency(Node node, String filename) {
        FileFrequencyNode current = node.fileFrequencyHead;
        while (current != null) {
            if (current.filename.equals(filename)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void printPreOrder(Node node, JTextArea textArea) {
    if (node != null) {
        int totalFrequency = getTotalFrequency(node.fileFrequencyHead);
        textArea.append(node.data + ", " + totalFrequency + "\n");
        printPreOrder(node.left, textArea);
        printPreOrder(node.right, textArea);
    }
}

void printInOrder(Node node, JTextArea textArea) {
    if (node != null) {
        int totalFrequency = getTotalFrequency(node.fileFrequencyHead);
        printInOrder(node.left, textArea);
        textArea.append(node.data + ", " + totalFrequency + "\n");
        printInOrder(node.right, textArea);
    }
}

void printPostOrder(Node node, JTextArea textArea) {
    if (node != null) {
        int totalFrequency = getTotalFrequency(node.fileFrequencyHead);
        printPostOrder(node.left, textArea);
        printPostOrder(node.right, textArea);
        textArea.append(node.data + ", " + totalFrequency + "\n");
    }

    
}
}
