import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FileTree extends JFrame {
    File file;
    FileTree(File file){
        super("FileTree");
        this.file=file;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        init();
        setVisible(true);
    }
    private JTree treeOfFiles;
    private void init() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(file.getName());
        initTree(file,top);
        treeOfFiles = new JTree(top);
        JScrollPane treeView = new JScrollPane(treeOfFiles);
        
        add(treeView);
    }
    private DefaultMutableTreeNode initTree(File file, DefaultMutableTreeNode node) {
            File[] files = file.listFiles();
            if (files!=null){
            for (File f : files) {
                DefaultMutableTreeNode newDirect = new DefaultMutableTreeNode(f.getName());
                if (f.isDirectory()) {
                    initTree(f, newDirect);
                }
                node.add(newDirect);
            }
        }
        return node;
    }
    public static void main(String[] args) {
    	FileTree ft = new FileTree(new File("C:\\Users\\Igor\\eclipse-workspace\\"));
    	ft.setVisible(true);
    }
}
