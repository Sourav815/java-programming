import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class treeNode {
    public static void main(String[] args) {
        final JFrame f = new JFrame();
        Container c = f.getContentPane();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer"),
                c1 = new DefaultMutableTreeNode("HDD"),
                c2 = new DefaultMutableTreeNode("CPU"),
                c3 = new DefaultMutableTreeNode("RAM");
        root.add(c1);
        root.add(c2);
        root.add(c3);
        c1.add(new DefaultMutableTreeNode("Samsung"));
        c1.add(new DefaultMutableTreeNode("Crucial"));
        c2.add(new DefaultMutableTreeNode("IBM"));
        c2.add(new DefaultMutableTreeNode("Intel"));
        c2.add(new DefaultMutableTreeNode("Ryzen"));
        c3.add(new DefaultMutableTreeNode("HYNIX"));
        c3.add(new DefaultMutableTreeNode("Kingston"));
        JTree t = new JTree(root);
        c.add(t);
        f.setVisible(true);
    }
}