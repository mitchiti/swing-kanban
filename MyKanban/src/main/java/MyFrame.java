import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    Task task = new Task();

    public MyFrame() {
        this.setTitle("My Kanban");
        this.setBackground(Color.lightGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.add(task);
        this.setVisible(true);
    }

}
