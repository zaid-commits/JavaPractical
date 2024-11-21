import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

public class Question12 {
    public static void main(String[] args) {
        // Create a root node for the tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root Directories");

        // Get the root directories (like C:\, D:\, etc. on Windows or / on Linux/Mac)
        File[] roots = File.listRoots();

        // Add root directories as children of the root node
        for (File rootDir : roots) {
            DefaultMutableTreeNode rootDirNode = new DefaultMutableTreeNode(rootDir.getPath());
            root.add(rootDirNode);

            // Optionally add subdirectories here, but for simplicity, we add only the root directories
        }

        // Create the tree using the root node
        JTree tree = new JTree(root);

        // Set up the frame to display the tree
        JFrame frame = new JFrame("Directory Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new JScrollPane(tree)); // Add the tree to a scroll pane
        frame.setVisible(true);
    }
}
